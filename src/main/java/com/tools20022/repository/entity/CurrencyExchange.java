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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.ExchangeRateTypeCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.msg.CurrencyExchange5;
import com.tools20022.repository.msg.CurrencyExchange6;
import com.tools20022.repository.msg.ExchangeRate1;
import java.util.Arrays;
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
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#OriginalAmount
 * CurrencyExchange.OriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForForeignExchangeTrade
 * CurrencyExchange.CurrencyExchangeForForeignExchangeTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#UnitCurrency
 * CurrencyExchange.UnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#QuotedCurrency
 * CurrencyExchange.QuotedCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#ExchangeRate
 * CurrencyExchange.ExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#ResultingAmount
 * CurrencyExchange.ResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedCorporateActionEvent
 * CurrencyExchange.RelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForSecuritiesBalance
 * CurrencyExchange.CurrencyExchangeForSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#QuotationDate
 * CurrencyExchange.QuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CalculatedAssetValue
 * CurrencyExchange.CalculatedAssetValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#SourceCurrency
 * CurrencyExchange.SourceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#TargetCurrency
 * CurrencyExchange.TargetCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCashEntry
 * CurrencyExchange.CurrencyExchangeForCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedPayment
 * CurrencyExchange.RelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#RateType
 * CurrencyExchange.RateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedLimitManagement
 * CurrencyExchange.RelatedLimitManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#FixingConditions
 * CurrencyExchange.FixingConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#Tax
 * CurrencyExchange.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedInvoice
 * CurrencyExchange.RelatedInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForTransactionAdministrator
 * CurrencyExchange.CurrencyExchangeForTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#ReportedAccount
 * CurrencyExchange.ReportedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCorporateActionCashEntitlement
 * CurrencyExchange.CurrencyExchangeForCorporateActionCashEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#PaymentExecution
 * CurrencyExchange.PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForSecuritiesQuote
 * CurrencyExchange.CurrencyExchangeForSecuritiesQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForSecuritiesConversion
 * CurrencyExchange.CurrencyExchangeForSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCashDistribution
 * CurrencyExchange.CurrencyExchangeForCashDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#Adjustment
 * CurrencyExchange.Adjustment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#CurrencyExchange
 * Account.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#CurrencyExchange
 * Tax.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#CurrencyExchange
 * Adjustment.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#CurrencyExchange
 * Payment.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#CurrencyExchange
 * CashEntry.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#ExchangeRate
 * AssetHolding.ExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#CurrencyExchange
 * PaymentExecution.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#CurrencyExchange
 * TransactionAdministrator.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#AgreedRate
 * ForeignExchangeTrade.AgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionUnitCurrency
 * SecuritiesConversion.ConversionUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#ExchangeRate
 * SecuritiesBalance.ExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#ExchangeRate
 * CorporateActionEvent.ExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#ExchangeRate
 * CorporateActionCashEntitlement.ExchangeRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.FixingCondition#FixingRate
 * FixingCondition.FixingRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#CurrencyExchange
 * Invoice.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#CurrencyExchange
 * LiquidityManagementLimit.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#DistributionCurrencyExchangeInformation
 * CashDistribution.DistributionCurrencyExchangeInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#QuotedRate
 * Quote.QuotedRate}</li>
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
	/**
	 * Amount in its original currency when conversion from/into another
	 * currency has occurred.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#TransactionAmount
	 * AmountAndCurrencyExchange3.TransactionAmount}</li>
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
	public static final MMBusinessAttribute OriginalAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndCurrencyExchange3.TransactionAmount);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalAmount";
			definition = "Amount in its original currency when conversion from/into another currency has occurred.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Trade which uses the specified exchange rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#AgreedRate
	 * ForeignExchangeTrade.AgreedRate}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchangeForForeignExchangeTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForForeignExchangeTrade";
			definition = "Trade which uses the specified exchange rate.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.AgreedRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency in which the rate of exchange is expressed in a currency
	 * exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#UnitCurrency
	 * CurrencyExchange5.UnitCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRate1#UnitCurrency
	 * ExchangeRate1.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#UnitCurrency
	 * CurrencyExchange6.UnitCurrency}</li>
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
	public static final MMBusinessAttribute UnitCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyExchange5.UnitCurrency, com.tools20022.repository.msg.ExchangeRate1.UnitCurrency, com.tools20022.repository.msg.CurrencyExchange6.UnitCurrency);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Currency into which the base currency is converted, in a currency
	 * exchange.
	 * <p>
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
	public static final MMBusinessAttribute QuotedCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * The value of one currency expressed in relation to another currency.
	 * ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency
	 * (ExchangeRate = UnitCurrency/QuotedCurrency).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#ExchangeRate
	 * CurrencyExchange5.ExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRate1#ExchangeRate
	 * ExchangeRate1.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#ExchangeRate
	 * CurrencyExchange6.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#ExchangeRate
	 * DirectDebitTransactionInformation21.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#ExchangeRate
	 * PaymentTransaction81.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#ExchangeRate
	 * PaymentTransaction76.ExchangeRate}</li>
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
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExchangeRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyExchange5.ExchangeRate, com.tools20022.repository.msg.ExchangeRate1.ExchangeRate, com.tools20022.repository.msg.CurrencyExchange6.ExchangeRate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.ExchangeRate, com.tools20022.repository.msg.PaymentTransaction81.ExchangeRate, com.tools20022.repository.msg.PaymentTransaction76.ExchangeRate);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Amount of money resulting from a foreign exchange transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#CounterValueAmount
	 * AmountAndCurrencyExchange3.CounterValueAmount}</li>
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
	public static final MMBusinessAttribute ResultingAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndCurrencyExchange3.CounterValueAmount);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultingAmount";
			definition = "Amount of money resulting from a foreign exchange transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Corporate action for which the offeror/issuer has specified an exchange
	 * rate for the payment in a currency different from the announced one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#ExchangeRate
	 * CorporateActionEvent.ExchangeRate}</li>
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
	public static final MMBusinessAssociationEnd RelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action for which the offeror/issuer has specified an exchange rate for the payment in a currency different from the announced one.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.ExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies a securities balance which used a specific exchange rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#ExchangeRate
	 * SecuritiesBalance.ExchangeRate}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchangeForSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesBalance";
			definition = "Specifies a securities balance which used a specific exchange rate.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.ExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date and time at which an exchange rate is quoted.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#QuotationDate
	 * CurrencyExchange5.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#QuotationDate
	 * CurrencyExchange6.QuotationDate}</li>
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
	public static final MMBusinessAttribute QuotationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyExchange5.QuotationDate, com.tools20022.repository.msg.CurrencyExchange6.QuotationDate);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuotationDate";
			definition = "Date and time at which an exchange rate is quoted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Asset value calculated in a different currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#ExchangeRate
	 * AssetHolding.ExchangeRate}</li>
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
	public static final MMBusinessAssociationEnd CalculatedAssetValue = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculatedAssetValue";
			definition = "Asset value calculated in a different currency.";
			minOccurs = 0;
			type_lazy = () -> AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.ExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency of the amount to be converted in a currency conversion.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#SourceCurrency
	 * CurrencyExchange5.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#SourceCurrency
	 * CurrencyExchange6.SourceCurrency}</li>
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
	public static final MMBusinessAttribute SourceCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyExchange5.SourceCurrency, com.tools20022.repository.msg.CurrencyExchange6.SourceCurrency);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SourceCurrency";
			definition = "Currency of the amount to be converted in a currency conversion.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Currency into which an amount is to be converted in a currency
	 * conversion.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#TargetCurrency
	 * CurrencyExchange5.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#TargetCurrency
	 * CurrencyExchange6.TargetCurrency}</li>
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
	public static final MMBusinessAttribute TargetCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyExchange5.TargetCurrency, com.tools20022.repository.msg.CurrencyExchange6.TargetCurrency);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TargetCurrency";
			definition = "Currency into which an amount is to be converted in a currency conversion.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Cash entry to which the currency exchange parameters apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#CurrencyExchange
	 * CashEntry.CurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchangeForCashEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCashEntry";
			definition = "Cash entry to which the currency exchange parameters apply.";
			minOccurs = 0;
			type_lazy = () -> CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment for which currency exchange parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#CurrencyExchange
	 * Payment.CurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd RelatedPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment for which currency exchange parameters are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type used to complete the currency exchange.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRate1#RateType
	 * ExchangeRate1.RateType}</li>
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
	public static final MMBusinessAttribute RateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeRate1.RateType);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type used to complete the currency exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExchangeRateTypeCode.mmObject();
		}
	};
	/**
	 * Limit for which an exchange rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#CurrencyExchange
	 * LiquidityManagementLimit.CurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd RelatedLimitManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedLimitManagement";
			definition = "Limit for which an exchange rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LiquidityManagementLimit.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Set of parameters used to calculate a rate for instance, the fixing rate
	 * to be applied to a non-deliverable agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition#FixingRate
	 * FixingCondition.FixingRate}</li>
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
	public static final MMBusinessAssociationEnd FixingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FixingConditions";
			definition = "Set of parameters used to calculate a rate for instance, the fixing rate to be applied to a non-deliverable agreement.";
			minOccurs = 0;
			type_lazy = () -> FixingCondition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FixingCondition.FixingRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax for which exchange information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#CurrencyExchange
	 * Tax.CurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax for which exchange information is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Invoice for which currency exchange information is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#CurrencyExchange
	 * Invoice.CurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd RelatedInvoice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoice";
			definition = "Invoice for which currency exchange information is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Invoice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Set of applications which use currency exchange information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#CurrencyExchange
	 * TransactionAdministrator.CurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchangeForTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForTransactionAdministrator";
			definition = "Set of applications which use currency exchange information.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TransactionAdministrator.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the account which uses an exchange rate to report entries and
	 * balances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#CurrencyExchange
	 * Account.CurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd ReportedAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedAccount";
			definition = "Specifies the account which uses an exchange rate to report entries and balances.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash entitlement for which an exchange rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#ExchangeRate
	 * CorporateActionCashEntitlement.ExchangeRate}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchangeForCorporateActionCashEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCorporateActionCashEntitlement";
			definition = "Cash entitlement for which an exchange rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionCashEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.ExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment execution process for which currrency exchange information is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#CurrencyExchange
	 * PaymentExecution.CurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd PaymentExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Payment execution process for which currrency exchange information is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote which uses currency exchange information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#QuotedRate
	 * Quote.QuotedRate}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchangeForSecuritiesQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesQuote";
			definition = "Quote which uses currency exchange information.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.QuotedRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion for which a conversion currency is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionUnitCurrency
	 * SecuritiesConversion.ConversionUnitCurrency}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchangeForSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesConversion";
			definition = "Securities conversion for which a conversion currency is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionUnitCurrency;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash distribution for which a conversion currency is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution#DistributionCurrencyExchangeInformation
	 * CashDistribution.DistributionCurrencyExchangeInformation}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchangeForCashDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCashDistribution";
			definition = "Cash distribution for which a conversion currency is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashDistribution.DistributionCurrencyExchangeInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Fees or commission applied to the currency exchange.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#CurrencyExchange
	 * Adjustment.CurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd Adjustment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Fees or commission applied to the currency exchange.\r\n";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CurrencyExchange";
				definition = "Information needed to process a currency exchange or conversion.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.CurrencyExchange, com.tools20022.repository.entity.Tax.CurrencyExchange, com.tools20022.repository.entity.Adjustment.CurrencyExchange,
						com.tools20022.repository.entity.Payment.CurrencyExchange, com.tools20022.repository.entity.CashEntry.CurrencyExchange, com.tools20022.repository.entity.AssetHolding.ExchangeRate,
						com.tools20022.repository.entity.PaymentExecution.CurrencyExchange, com.tools20022.repository.entity.TransactionAdministrator.CurrencyExchange, com.tools20022.repository.entity.ForeignExchangeTrade.AgreedRate,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionUnitCurrency, com.tools20022.repository.entity.SecuritiesBalance.ExchangeRate, com.tools20022.repository.entity.CorporateActionEvent.ExchangeRate,
						com.tools20022.repository.entity.CorporateActionCashEntitlement.ExchangeRate, com.tools20022.repository.entity.FixingCondition.FixingRate, com.tools20022.repository.entity.Invoice.CurrencyExchange,
						com.tools20022.repository.entity.LiquidityManagementLimit.CurrencyExchange, com.tools20022.repository.entity.CashDistribution.DistributionCurrencyExchangeInformation,
						com.tools20022.repository.entity.Quote.QuotedRate);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyExchange.OriginalAmount, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForForeignExchangeTrade,
						com.tools20022.repository.entity.CurrencyExchange.UnitCurrency, com.tools20022.repository.entity.CurrencyExchange.QuotedCurrency, com.tools20022.repository.entity.CurrencyExchange.ExchangeRate,
						com.tools20022.repository.entity.CurrencyExchange.ResultingAmount, com.tools20022.repository.entity.CurrencyExchange.RelatedCorporateActionEvent,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesBalance, com.tools20022.repository.entity.CurrencyExchange.QuotationDate,
						com.tools20022.repository.entity.CurrencyExchange.CalculatedAssetValue, com.tools20022.repository.entity.CurrencyExchange.SourceCurrency, com.tools20022.repository.entity.CurrencyExchange.TargetCurrency,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashEntry, com.tools20022.repository.entity.CurrencyExchange.RelatedPayment, com.tools20022.repository.entity.CurrencyExchange.RateType,
						com.tools20022.repository.entity.CurrencyExchange.RelatedLimitManagement, com.tools20022.repository.entity.CurrencyExchange.FixingConditions, com.tools20022.repository.entity.CurrencyExchange.Tax,
						com.tools20022.repository.entity.CurrencyExchange.RelatedInvoice, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForTransactionAdministrator,
						com.tools20022.repository.entity.CurrencyExchange.ReportedAccount, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCorporateActionCashEntitlement,
						com.tools20022.repository.entity.CurrencyExchange.PaymentExecution, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesQuote,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesConversion, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashDistribution,
						com.tools20022.repository.entity.CurrencyExchange.Adjustment);
				derivationComponent_lazy = () -> Arrays.asList(CurrencyExchange5.mmObject(), ExchangeRate1.mmObject(), CurrencyExchange6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}