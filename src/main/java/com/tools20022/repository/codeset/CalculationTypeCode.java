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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CalculationTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies calculation types such as yield, duration, analytics etc.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Convexity
 * CalculationTypeCode.Convexity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Volatility
 * CalculationTypeCode.Volatility}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Alpha
 * CalculationTypeCode.Alpha}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Beta
 * CalculationTypeCode.Beta}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Delta
 * CalculationTypeCode.Delta}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Gamma
 * CalculationTypeCode.Gamma}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Speed
 * CalculationTypeCode.Speed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Rho
 * CalculationTypeCode.Rho}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Theta
 * CalculationTypeCode.Theta}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Vega
 * CalculationTypeCode.Vega}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#PriceEarningRatio
 * CalculationTypeCode.PriceEarningRatio}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Lambda
 * CalculationTypeCode.Lambda}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#VegaGamma
 * CalculationTypeCode.VegaGamma}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Vanna
 * CalculationTypeCode.Vanna}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#DeltaDecay
 * CalculationTypeCode.DeltaDecay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Color
 * CalculationTypeCode.Color}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#PriceBookRatio
 * CalculationTypeCode.PriceBookRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#PriceSalesRatio
 * CalculationTypeCode.PriceSalesRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#EarningPerShare
 * CalculationTypeCode.EarningPerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#EPSPercentChange
 * CalculationTypeCode.EPSPercentChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#NetIncomeSalesRatio
 * CalculationTypeCode.NetIncomeSalesRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#PriceEarningsGrowth
 * CalculationTypeCode.PriceEarningsGrowth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#QuickRatio
 * CalculationTypeCode.QuickRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#CurrentRatio
 * CalculationTypeCode.CurrentRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#DividendPayoutRatio
 * CalculationTypeCode.DividendPayoutRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#DebtEquityRatio
 * CalculationTypeCode.DebtEquityRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#ReturnOnEquity
 * CalculationTypeCode.ReturnOnEquity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#ReturnOnAssets
 * CalculationTypeCode.ReturnOnAssets}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#ReturnOnInvestment
 * CalculationTypeCode.ReturnOnInvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#SalesEmployee
 * CalculationTypeCode.SalesEmployee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#CurrentAssets
 * CalculationTypeCode.CurrentAssets}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#LongTermDebt
 * CalculationTypeCode.LongTermDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#CurrentLiabilities
 * CalculationTypeCode.CurrentLiabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#SalesRevenue
 * CalculationTypeCode.SalesRevenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#SalesMargin
 * CalculationTypeCode.SalesMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#FundAnnualReturn
 * CalculationTypeCode.FundAnnualReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#FundCumReturn
 * CalculationTypeCode.FundCumReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#FundStandardDeviation
 * CalculationTypeCode.FundStandardDeviation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#FundBenchExcessAnnualReturn
 * CalculationTypeCode.FundBenchExcessAnnualReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#FundBenchExcessCumReturn
 * CalculationTypeCode.FundBenchExcessCumReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#FundBenchTrackingError
 * CalculationTypeCode.FundBenchTrackingError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#FundPortfolioStandardDeviation
 * CalculationTypeCode.FundPortfolioStandardDeviation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#FundBenchAnnualReturn
 * CalculationTypeCode.FundBenchAnnualReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#FundBenchCumReturn
 * CalculationTypeCode.FundBenchCumReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#LifeToNextProbableCall
 * CalculationTypeCode.LifeToNextProbableCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#AverageLife
 * CalculationTypeCode.AverageLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#MacaulyDuration
 * CalculationTypeCode.MacaulyDuration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#ModifiedDuration
 * CalculationTypeCode.ModifiedDuration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Duration
 * CalculationTypeCode.Duration}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Yield
 * CalculationTypeCode.Yield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#YieldToMaturity
 * CalculationTypeCode.YieldToMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#CurrentYield
 * CalculationTypeCode.CurrentYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#DiscountYield
 * CalculationTypeCode.DiscountYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#DirectYield
 * CalculationTypeCode.DirectYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#YieldToNextCall
 * CalculationTypeCode.YieldToNextCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#YieldToAverageLife
 * CalculationTypeCode.YieldToAverageLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#BondEquivalentYield
 * CalculationTypeCode.BondEquivalentYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#AfterTax
 * CalculationTypeCode.AfterTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Annual
 * CalculationTypeCode.Annual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#AtIssue
 * CalculationTypeCode.AtIssue}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Book
 * CalculationTypeCode.Book}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#ToAverageMaturity
 * CalculationTypeCode.ToAverageMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#ChangeSinceClose
 * CalculationTypeCode.ChangeSinceClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Closing
 * CalculationTypeCode.Closing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Compound
 * CalculationTypeCode.Compound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#TrueGross
 * CalculationTypeCode.TrueGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#GovernmentEquivalent
 * CalculationTypeCode.GovernmentEquivalent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#InflationAssumption
 * CalculationTypeCode.InflationAssumption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#InverseFloater
 * CalculationTypeCode.InverseFloater}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#LastClose
 * CalculationTypeCode.LastClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#LastMonth
 * CalculationTypeCode.LastMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#LastQuarter
 * CalculationTypeCode.LastQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#LastYear
 * CalculationTypeCode.LastYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#LongestAverageLife
 * CalculationTypeCode.LongestAverageLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#MarkToMarket
 * CalculationTypeCode.MarkToMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#ToNextRefund
 * CalculationTypeCode.ToNextRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#OpenAverage
 * CalculationTypeCode.OpenAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#ToNextPut
 * CalculationTypeCode.ToNextPut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#PreviousClose
 * CalculationTypeCode.PreviousClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Proceeds
 * CalculationTypeCode.Proceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#SemiAnnual
 * CalculationTypeCode.SemiAnnual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#ShortestAverageLife
 * CalculationTypeCode.ShortestAverageLife}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#Simple
 * CalculationTypeCode.Simple}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#TaxEquivalent
 * CalculationTypeCode.TaxEquivalent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#ToTenderDate
 * CalculationTypeCode.ToTenderDate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationTypeCode#True
 * CalculationTypeCode.True}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode#ToWorstConvention
 * CalculationTypeCode.ToWorstConvention}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CNVX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CalculationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies calculation types such as yield, duration, analytics etc."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CalculationTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Measure of change in duration (linear measure of changes in bond price in
	 * reaction to interest rate changes) of a bond as interest rate changes
	 * over time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNVX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Convexity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Measure of change in duration (linear measure of changes in bond price in reaction to interest rate changes) of a bond as interest rate changes over time."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Convexity = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Convexity";
			definition = "Measure of change in duration (linear measure of changes in bond price in reaction to interest rate changes) of a bond as interest rate changes over time.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "CNVX";
		}
	};
	/**
	 * A statistical measure of the dispersion of returns for a given security
	 * or market index. Volatility can either be measured by using the standard
	 * deviation or variance between returns from that same security or market
	 * index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VOLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Volatility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A statistical measure of the dispersion of returns for a given security or market index. Volatility can either be measured by using the standard deviation or variance between returns from that same security or market index."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Volatility = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Volatility";
			definition = "A statistical measure of the dispersion of returns for a given security or market index. Volatility can either be measured by using the standard deviation or variance between returns from that same security or market index.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "VOLA";
		}
	};
	/**
	 * Excess return on an investment attributed to an investment managers
	 * performance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALFA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Alpha"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Excess return on an investment attributed to an investment managers performance."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Alpha = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Alpha";
			definition = "Excess return on an investment attributed to an investment managers performance.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "ALFA";
		}
	};
	/**
	 * Volatility of an instrument relative to a particular market set of
	 * instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BETA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beta"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Volatility of an instrument relative to a particular market set of instruments."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Beta = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Beta";
			definition = "Volatility of an instrument relative to a particular market set of instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "BETA";
		}
	};
	/**
	 * First order (linear) sensitivity to changes in an underlying security
	 * price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delta"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First order (linear) sensitivity to changes in an underlying security price."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Delta = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Delta";
			definition = "First order (linear) sensitivity to changes in an underlying security price.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "DLTA";
		}
	};
	/**
	 * Second order (quadratic) sensitivity to changes in an underlying security
	 * price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GAMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gamma"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Second order (quadratic) sensitivity to changes in an underlying security price."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Gamma = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gamma";
			definition = "Second order (quadratic) sensitivity to changes in an underlying security price.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "GAMA";
		}
	};
	/**
	 * Third order sensitivity to changes in an underlying security price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Speed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Third order sensitivity to changes in an underlying security price."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode Speed = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Speed";
			definition = "Third order sensitivity to changes in an underlying security price.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "SPID";
		}
	};
	/**
	 * First order (linear) sensitivity to changes in the risk free rate of
	 * return.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RHOO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rho"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First order (linear) sensitivity to changes in the risk free rate of return."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Rho = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rho";
			definition = "First order (linear) sensitivity to changes in the risk free rate of return.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "RHOO";
		}
	};
	/**
	 * First order (linear) sensitivity to the passage of time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TETA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Theta"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First order (linear) sensitivity to the passage of time."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode Theta = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Theta";
			definition = "First order (linear) sensitivity to the passage of time.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "TETA";
		}
	};
	/**
	 * First order (linear) sensitivity to changes in implied volatility of an
	 * underlying security. Sometimes called kappa or tau.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VEGA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vega"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First order (linear) sensitivity to changes in implied volatility of an underlying security. Sometimes called kappa or tau."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Vega = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Vega";
			definition = "First order (linear) sensitivity to changes in implied volatility of an underlying security. Sometimes called kappa or tau.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "VEGA";
		}
	};
	/**
	 * A ratio used to determine a stock's value while taking into account
	 * earnings growth.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceEarningRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A ratio used to determine a stock's value while taking into account earnings growth."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode PriceEarningRatio = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceEarningRatio";
			definition = "A ratio used to determine a stock's value while taking into account earnings growth.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "PRER";
		}
	};
	/**
	 * Percent change in option value per change in underlying price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LMDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lambda"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percent change in option value per change in underlying price."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode Lambda = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lambda";
			definition = "Percent change in option value per change in underlying price.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "LMDA";
		}
	};
	/**
	 * Second order (quadratic) sensitivity to changes in implied volatility in
	 * an underlying security price. Also called Volga.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VGAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VegaGamma"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Second order (quadratic) sensitivity to changes in implied volatility in an underlying security price. Also called Volga."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode VegaGamma = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VegaGamma";
			definition = "Second order (quadratic) sensitivity to changes in implied volatility in an underlying security price. Also called Volga.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "VGAM";
		}
	};
	/**
	 * Sensitivity of delta to a change in volatility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VANA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vanna"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sensitivity of delta to a change in volatility."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode Vanna = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Vanna";
			definition = "Sensitivity of delta to a change in volatility.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "VANA";
		}
	};
	/**
	 * Measures time decay of Delta.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeltaDecay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measures time decay of Delta."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode DeltaDecay = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeltaDecay";
			definition = "Measures time decay of Delta.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "DEDE";
		}
	};
	/**
	 * Sensitivity of Delta Decay to underlying price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Color"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sensitivity of Delta Decay to underlying price."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode Color = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Color";
			definition = "Sensitivity of Delta Decay to underlying price.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "COLR";
		}
	};
	/**
	 * A ratio used to compare a stock's market value to its book value. It is
	 * calculated by dividing the current closing price of the stock by the
	 * latest quarter's book value per share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRBR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceBookRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A ratio used to compare a stock's market value to its book value. It is calculated by dividing the current closing price of the stock by the latest quarter's book value per share."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode PriceBookRatio = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceBookRatio";
			definition = "A ratio used to compare a stock's market value to its book value. It is calculated by dividing the current closing price of the stock by the latest quarter's book value per share.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "PRBR";
		}
	};
	/**
	 * A ratio for valuing a stock relative to its own past performance, other
	 * companies or the market itself. Price to sales is calculated by dividing
	 * a stock's current price by its revenue per share for the trailing 12
	 * months.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRSR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceSalesRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A ratio for valuing a stock relative to its own past performance, other companies or the market itself. Price to sales is calculated by dividing a stock's current price by its revenue per share for the trailing 12 months."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode PriceSalesRatio = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceSalesRatio";
			definition = "A ratio for valuing a stock relative to its own past performance, other companies or the market itself. Price to sales is calculated by dividing a stock's current price by its revenue per share for the trailing 12 months.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "PRSR";
		}
	};
	/**
	 * The portion of a company's profit allocated to each outstanding share of
	 * common stock. EPS serves as an indicator of a company's profitability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EAPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarningPerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The portion of a company's profit allocated to each outstanding share of common stock. EPS serves as an indicator of a company's profitability."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode EarningPerShare = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarningPerShare";
			definition = "The portion of a company's profit allocated to each outstanding share of common stock. EPS serves as an indicator of a company's profitability.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "EAPS";
		}
	};
	/**
	 * Percent Change in EPS Trailing Twelve Months.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EPPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EPSPercentChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percent Change in EPS Trailing Twelve Months."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode EPSPercentChange = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EPSPercentChange";
			definition = "Percent Change in EPS Trailing Twelve Months.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "EPPC";
		}
	};
	/**
	 * Net income as percent of sales.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NISR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetIncomeSalesRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net income as percent of sales."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode NetIncomeSalesRatio = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetIncomeSalesRatio";
			definition = "Net income as percent of sales.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "NISR";
		}
	};
	/**
	 * A ratio used to determine a stock's value while taking into account
	 * earnings growth.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceEarningsGrowth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A ratio used to determine a stock's value while taking into account earnings growth."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode PriceEarningsGrowth = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceEarningsGrowth";
			definition = "A ratio used to determine a stock's value while taking into account earnings growth.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "PREG";
		}
	};
	/**
	 * The current assets minus the inventory and the result is divided by the
	 * liabilities. (Current Assets - Inventory)/Liabilities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QIKR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuickRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The current assets minus the inventory and the result is divided by the liabilities.\n(Current Assets - Inventory)/Liabilities."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode QuickRatio = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuickRatio";
			definition = "The current assets minus the inventory and the result is divided by the liabilities.\n(Current Assets - Inventory)/Liabilities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "QIKR";
		}
	};
	/**
	 * The current assets are divided by the current liabilities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CURA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The current assets are divided by the current liabilities."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode CurrentRatio = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrentRatio";
			definition = "The current assets are divided by the current liabilities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "CURA";
		}
	};
	/**
	 * Dividends per Share divided by EPS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPayoutRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividends per Share divided by EPS."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode DividendPayoutRatio = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendPayoutRatio";
			definition = "Dividends per Share divided by EPS.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "DIPR";
		}
	};
	/**
	 * Total Liabilities divided by the shareholder equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEQR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtEquityRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total Liabilities divided by the shareholder equity."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode DebtEquityRatio = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebtEquityRatio";
			definition = "Total Liabilities divided by the shareholder equity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "DEQR";
		}
	};
	/**
	 * A measure of a corporation's profitability that reveals how much profit a
	 * company generates with the money shareholders have invested. .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTOE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnOnEquity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A measure of a corporation's profitability that reveals how much profit a company generates with the money shareholders have invested. ."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode ReturnOnEquity = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReturnOnEquity";
			definition = "A measure of a corporation's profitability that reveals how much profit a company generates with the money shareholders have invested. .";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "RTOE";
		}
	};
	/**
	 * An indicator of how profitable a company is relative to its total
	 * assets. Return On Assets gives an idea as to how efficient management
	 * is at using its assets to generate earnings. Calculated by dividing a
	 * company's annual earnings by its total assets, Return On Assets is
	 * displayed as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnOnAssets"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An indicator of how profitable a company is relative to its total assets. Return On Assets gives an idea as to how efficient management is at using its assets to generate earnings. Calculated by dividing a company's annual earnings by its total assets, Return On Assets is displayed as a percentage."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode ReturnOnAssets = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReturnOnAssets";
			definition = "An indicator of how profitable a company is relative to its total assets. Return On Assets gives an idea as to how efficient management is at using its assets to generate earnings. Calculated by dividing a company's annual earnings by its total assets, Return On Assets is displayed as a percentage.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "RTOA";
		}
	};
	/**
	 * Return on investment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REOI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnOnInvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Return on investment."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode ReturnOnInvestment = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReturnOnInvestment";
			definition = "Return on investment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "REOI";
		}
	};
	/**
	 * Important ratio that looks at a company's sales in relation to the number
	 * of employees they have.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAEM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalesEmployee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Important ratio that looks at a company's sales in relation to the number of employees they have."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode SalesEmployee = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SalesEmployee";
			definition = "Important ratio that looks at a company's sales in relation to the number of employees they have.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "SAEM";
		}
	};
	/**
	 * Balance sheet account that represents the value of all assets that
	 * are reasonably expected to be converted into cash within one year in the
	 * normal course of business. Current assets include cash, accounts
	 * receivable, inventory, marketable securities, prepaid expenses and other
	 * liquid assets that can be readily converted to cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentAssets"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance sheet account that represents the value of all assets that are reasonably expected to be converted into cash within one year in the normal course of business. Current assets include cash, accounts receivable, inventory, marketable securities, prepaid expenses and other liquid assets that can be readily converted to cash."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode CurrentAssets = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrentAssets";
			definition = "Balance sheet account that represents the value of all assets that are reasonably expected to be converted into cash within one year in the normal course of business. Current assets include cash, accounts receivable, inventory, marketable securities, prepaid expenses and other liquid assets that can be readily converted to cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "CUAS";
		}
	};
	/**
	 * Loans and financial obligations lasting over one year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LTDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loans and financial obligations lasting over one year."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode LongTermDebt = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LongTermDebt";
			definition = "Loans and financial obligations lasting over one year.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "LTDB";
		}
	};
	/**
	 * Company's debts or obligations that are due within one year. Current
	 * liabilities appear on the company's balance sheet and include short term
	 * debt, accounts payable, accrued liabilities and other debts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CULI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentLiabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Company's debts or obligations that are due within one year. Current liabilities appear on the company's balance sheet and include short term debt, accounts payable, accrued liabilities and other debts."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode CurrentLiabilities = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrentLiabilities";
			definition = "Company's debts or obligations that are due within one year. Current liabilities appear on the company's balance sheet and include short term debt, accounts payable, accrued liabilities and other debts.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "CULI";
		}
	};
	/**
	 * Amount of sales.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SARE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalesRevenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of sales."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode SalesRevenue = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SalesRevenue";
			definition = "Amount of sales.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "SARE";
		}
	};
	/**
	 * Financial metric used to assess a firm's financial health by revealing
	 * the proportion of money left over from revenues after accounting for the
	 * cost of goods sold. Gross profit margin serves as the source for paying
	 * additional expenses and future savings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalesMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial metric used to assess a firm's financial health by revealing the proportion of money left over from revenues after accounting for the cost of goods sold. Gross profit margin serves as the source for paying additional expenses and future savings."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode SalesMargin = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SalesMargin";
			definition = "Financial metric used to assess a firm's financial health by revealing the proportion of money left over from revenues after accounting for the cost of goods sold. Gross profit margin serves as the source for paying additional expenses and future savings.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "SAMA";
		}
	};
	/**
	 * Last twelve months or calendar year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundAnnualReturn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last twelve months or calendar year."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode FundAnnualReturn = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundAnnualReturn";
			definition = "Last twelve months or calendar year.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "FUAR";
		}
	};
	/**
	 * Requires timeframe - generally from inception or in 3, 5, and 10 year
	 * periods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCumReturn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requires timeframe - generally from inception or in 3, 5, and 10 year periods."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode FundCumReturn = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundCumReturn";
			definition = "Requires timeframe - generally from inception or in 3, 5, and 10 year periods.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "FUCR";
		}
	};
	/**
	 * Portfolio volatility as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundStandardDeviation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Portfolio volatility as a percentage."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode FundStandardDeviation = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundStandardDeviation";
			definition = "Portfolio volatility as a percentage.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "FUSD";
		}
	};
	/**
	 * Variance between the fund annual return and a benchmark.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundBenchExcessAnnualReturn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance between the fund annual return and a benchmark."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode FundBenchExcessAnnualReturn = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundBenchExcessAnnualReturn";
			definition = "Variance between the fund annual return and a benchmark.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "FEAR";
		}
	};
	/**
	 * Requires timeframe - generally from inception or in 3, 5, and 10 year
	 * periods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FECR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundBenchExcessCumReturn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requires timeframe - generally from inception or in 3, 5, and 10 year periods."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode FundBenchExcessCumReturn = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundBenchExcessCumReturn";
			definition = "Requires timeframe - generally from inception or in 3, 5, and 10 year periods.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "FECR";
		}
	};
	/**
	 * Volatility of fund excess return.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FBTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundBenchTrackingError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Volatility of fund excess return."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode FundBenchTrackingError = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundBenchTrackingError";
			definition = "Volatility of fund excess return.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "FBTE";
		}
	};
	/**
	 * Portfolio volatility as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FPSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundPortfolioStandardDeviation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Portfolio volatility as a percentage."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode FundPortfolioStandardDeviation = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundPortfolioStandardDeviation";
			definition = "Portfolio volatility as a percentage.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "FPSD";
		}
	};
	/**
	 * Last twelve months or calendar year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FBAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundBenchAnnualReturn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last twelve months or calendar year."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode FundBenchAnnualReturn = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundBenchAnnualReturn";
			definition = "Last twelve months or calendar year.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "FBAR";
		}
	};
	/**
	 * Requires timeframe - generally from inception or in 3, 5, and 10 year
	 * periods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FBCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundBenchCumReturn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requires timeframe - generally from inception or in 3, 5, and 10 year periods."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode FundBenchCumReturn = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundBenchCumReturn";
			definition = "Requires timeframe - generally from inception or in 3, 5, and 10 year periods.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "FBCR";
		}
	};
	/**
	 * Life of the bond to next probable call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LNPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LifeToNextProbableCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Life of the bond to next probable call."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode LifeToNextProbableCall = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LifeToNextProbableCall";
			definition = "Life of the bond to next probable call.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "LNPC";
		}
	};
	/**
	 * Weighted average time to redemption of an amortising bond using relative
	 * redemption cash flows as weights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVGL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Weighted average time to redemption of an amortising bond using relative redemption cash flows as weights."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode AverageLife = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AverageLife";
			definition = "Weighted average time to redemption of an amortising bond using relative redemption cash flows as weights.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "AVGL";
		}
	};
	/**
	 * Weighted-average term to maturity of the cash flows from a bond. The
	 * weight of each cash flow is determined by dividing the present value of
	 * the cash flow by the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MADU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MacaulyDuration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Weighted-average term to maturity of the cash flows from a bond. The weight of each cash flow is determined by dividing the present value of the cash flow by the price."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode MacaulyDuration = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MacaulyDuration";
			definition = "Weighted-average term to maturity of the cash flows from a bond. The weight of each cash flow is determined by dividing the present value of the cash flow by the price.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "MADU";
		}
	};
	/**
	 * Formula that expresses the measurable change in the value of a security
	 * in response to a change in interest rates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedDuration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Formula that expresses the measurable change in the value of a security in response to a change in interest rates."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode ModifiedDuration = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ModifiedDuration";
			definition = "Formula that expresses the measurable change in the value of a security in response to a change in interest rates.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "MODU";
		}
	};
	/**
	 * Measurement of how long, in years, it takes for the price of a bond to be
	 * repaid by its internal cash flows.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DURA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Measurement of how long, in years, it takes for the price of a bond to be repaid by its internal cash flows."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Duration = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Duration";
			definition = "Measurement of how long, in years, it takes for the price of a bond to be repaid by its internal cash flows.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "DURA";
		}
	};
	/**
	 * Yield is the annual rate of return for any investment and is expressed as
	 * a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YIEL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Yield is the annual rate of return for any investment and is expressed as a percentage."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Yield = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Yield";
			definition = "Yield is the annual rate of return for any investment and is expressed as a percentage.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "YIEL";
		}
	};
	/**
	 * Internal rate of return an investor would achieve if he or she purchased
	 * that bond at its current dirty price, and held it to maturity, assuming
	 * all coupon and principal payments are received as scheduled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YTMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldToMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Internal rate of return an investor would achieve if he or she purchased that bond at its current dirty price, and held it to maturity, assuming all coupon and principal payments are received as scheduled."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode YieldToMaturity = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YieldToMaturity";
			definition = "Internal rate of return an investor would achieve if he or she purchased that bond at its current dirty price, and held it to maturity, assuming all coupon and principal payments are received as scheduled.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "YTMA";
		}
	};
	/**
	 * The ratio of the interest payment amount to the clean price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUYI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The ratio of the interest payment amount to the clean price."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode CurrentYield = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrentYield";
			definition = "The ratio of the interest payment amount to the clean price.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "CUYI";
		}
	};
	/**
	 * Yield quoted for a discount instrument. This is the ratio of the discount
	 * to the face value, divided by the period to maturity as a fraction of a
	 * year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIYI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Yield quoted for a discount instrument. This is the ratio of the discount to the face value, divided by the period to maturity as a fraction of a year."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode DiscountYield = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiscountYield";
			definition = "Yield quoted for a discount instrument. This is the ratio of the discount to the face value, divided by the period to maturity as a fraction of a year.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "DIYI";
		}
	};
	/**
	 * Dividend related to the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIRY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend related to the price."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode DirectYield = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DirectYield";
			definition = "Dividend related to the price.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "DIRY";
		}
	};
	/**
	 * Yield of a bond to the next possible call date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YTNC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldToNextCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Yield of a bond to the next possible call date."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode YieldToNextCall = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YieldToNextCall";
			definition = "Yield of a bond to the next possible call date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "YTNC";
		}
	};
	/**
	 * The yield achieved by substituting a bond's average life for the issue's
	 * final maturity date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YTAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldToAverageLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield achieved by substituting a bond's average life for the issue's final maturity date."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode YieldToAverageLife = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YieldToAverageLife";
			definition = "The yield achieved by substituting a bond's average life for the issue's final maturity date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "YTAL";
		}
	};
	/**
	 * Calculation for restating semi-annual, quarterly, or monthly
	 * discount-bond or note yields into an annual yield.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEQY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondEquivalentYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation for restating semi-annual, quarterly, or monthly discount-bond or note yields into an annual yield."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode BondEquivalentYield = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BondEquivalentYield";
			definition = "Calculation for restating semi-annual, quarterly, or monthly discount-bond or note yields into an annual yield.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "BEQY";
		}
	};
	/**
	 * The yield on the bond net of any tax consequences from holding the bond.
	 * The discount on municipal securities can be subject to both capital gains
	 * taxes and ordinary income taxes. Calculated from dollar price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AFTX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield on the bond net of any tax consequences from holding the bond. The discount on municipal securities can be subject to both capital gains taxes and ordinary income taxes. Calculated from dollar price."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode AfterTax = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterTax";
			definition = "The yield on the bond net of any tax consequences from holding the bond. The discount on municipal securities can be subject to both capital gains taxes and ordinary income taxes. Calculated from dollar price.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "AFTX";
		}
	};
	/**
	 * The annual interest or dividend income an investment earns, expressed as
	 * a percentage of the investment's total value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANNU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The annual interest or dividend income an investment earns, expressed as a percentage of the investment's total value."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Annual = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Annual";
			definition = "The annual interest or dividend income an investment earns, expressed as a percentage of the investment's total value.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "ANNU";
		}
	};
	/**
	 * The yield of the bond offered on the issue date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The yield of the bond offered on the issue date."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode AtIssue = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtIssue";
			definition = "The yield of the bond offered on the issue date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * The yield of a security calculated by using its book value instead of the
	 * current market price. This term is typically used in the US domestic
	 * market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOOK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Book"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield of a security calculated by using its book value instead of the current market price. This term is typically used in the US domestic market."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Book = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Book";
			definition = "The yield of a security calculated by using its book value instead of the current market price. This term is typically used in the US domestic market.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "BOOK";
		}
	};
	/**
	 * The yield achieved by substituting a bond's average maturity for the
	 * issue's final maturity date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAverageMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield achieved by substituting a bond's average maturity for the issue's final maturity date."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode ToAverageMaturity = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAverageMaturity";
			definition = "The yield achieved by substituting a bond's average maturity for the issue's final maturity date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "AVMA";
		}
	};
	/**
	 * The change in the yield since the previous day's closing yield.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeSinceClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The change in the yield since the previous day's closing yield."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode ChangeSinceClose = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeSinceClose";
			definition = "The change in the yield since the previous day's closing yield.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "CHCL";
		}
	};
	/**
	 * The yield of a bond based on the closing price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The yield of a bond based on the closing price."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode Closing = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closing";
			definition = "The yield of a bond based on the closing price.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * The yield of certain Japanese bonds based on its price. Certain Japanese
	 * bonds have irregular first or last coupons, and the yield is calculated
	 * compound for these irregular periods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield of certain Japanese bonds based on its price. Certain Japanese bonds have irregular first or last coupons, and the yield is calculated compound for these irregular periods."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Compound = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compound";
			definition = "The yield of certain Japanese bonds based on its price. Certain Japanese bonds have irregular first or last coupons, and the yield is calculated compound for these irregular periods.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "CMPD";
		}
	};
	/**
	 * Yield calculated using the price including accrued interest, where coupon
	 * dates are moved from holidays and weekends to the next trading day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrueGross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Yield calculated using the price including accrued interest, where coupon dates are moved from holidays and weekends to the next trading day."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode TrueGross = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TrueGross";
			definition = "Yield calculated using the price including accrued interest, where coupon dates are moved from holidays and weekends to the next trading day.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "TRGR";
		}
	};
	/**
	 * Ask yield based on semi-annual coupons compounding in all periods and
	 * actual/actual calendar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GVEQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentEquivalent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ask yield based on semi-annual coupons compounding in all periods and actual/actual calendar."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode GovernmentEquivalent = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentEquivalent";
			definition = "Ask yield based on semi-annual coupons compounding in all periods and actual/actual calendar.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "GVEQ";
		}
	};
	/**
	 * Based on price, the return an investor would require on a normal bond
	 * that would make the real return equal to that of the inflation-indexed
	 * bond, assuming a constant inflation rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InflationAssumption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Based on price, the return an investor would require on a normal bond that would make the real return equal to that of the inflation-indexed bond, assuming a constant inflation rate."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode InflationAssumption = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InflationAssumption";
			definition = "Based on price, the return an investor would require on a normal bond that would make the real return equal to that of the inflation-indexed bond, assuming a constant inflation rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "FLAS";
		}
	};
	/**
	 * Inverse Floater Bond Yield - Inverse floater semi-annual bond equivalent
	 * rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NVFL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InverseFloater"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Inverse Floater Bond Yield - Inverse floater semi-annual bond equivalent rate."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode InverseFloater = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InverseFloater";
			definition = "Inverse Floater Bond Yield - Inverse floater semi-annual bond equivalent rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "NVFL";
		}
	};
	/**
	 * Most Recent Closing Yield - The last available yield stored in history,
	 * computed using price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LSCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Most Recent Closing Yield - The last available yield stored in history, computed using price."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode LastClose = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastClose";
			definition = "Most Recent Closing Yield - The last available yield stored in history, computed using price.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "LSCL";
		}
	};
	/**
	 * Closing Yield Most Recent Month - The yield of a bond based on the
	 * closing price as of the most recent month's end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LSMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing Yield Most Recent Month - The yield of a bond based on the closing price as of the most recent month's end."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode LastMonth = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastMonth";
			definition = "Closing Yield Most Recent Month - The yield of a bond based on the closing price as of the most recent month's end.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "LSMT";
		}
	};
	/**
	 * Closing Yield Most Recent Quarter - The yield of a bond based on the
	 * closing price as of the most recent quarter's end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LSQR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastQuarter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing Yield Most Recent Quarter - The yield of a bond based on the closing price as of the most recent quarter's end."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode LastQuarter = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastQuarter";
			definition = "Closing Yield Most Recent Quarter - The yield of a bond based on the closing price as of the most recent quarter's end.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "LSQR";
		}
	};
	/**
	 * Closing Yield Most Recent Year - The yield of a bond based on the closing
	 * price as of the most recent year's end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LSYR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing Yield Most Recent Year - The yield of a bond based on the closing price as of the most recent year's end."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode LastYear = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastYear";
			definition = "Closing Yield Most Recent Year - The yield of a bond based on the closing price as of the most recent year's end.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "LSYR";
		}
	};
	/**
	 * The yield assuming only mandatory sinks are taken. This results in a
	 * lower paydown of debt; the yield is then calculated to the final payment
	 * date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LGAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongestAverageLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield assuming only mandatory sinks are taken. This results in a lower paydown of debt; the yield is then calculated to the final payment date."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode LongestAverageLife = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongestAverageLife";
			definition = "The yield assuming only mandatory sinks are taken. This results in a lower paydown of debt; the yield is then calculated to the final payment date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "LGAL";
		}
	};
	/**
	 * An adjustment in the valuation of a securities portfolio to reflect the
	 * current market values of the respective securities in the portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An adjustment in the valuation of a securities portfolio to reflect the current market values of the respective securities in the portfolio."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode MarkToMarket = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarket";
			definition = "An adjustment in the valuation of a securities portfolio to reflect the current market values of the respective securities in the portfolio.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "MARK";
		}
	};
	/**
	 * Yield To Next Refund (Sinking Fund Bonds) - Yield assuming all bonds are
	 * redeemed at the next refund date at the redemption price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NXRF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToNextRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Yield To Next Refund (Sinking Fund Bonds) - Yield assuming all bonds are redeemed at the next refund date at the redemption price."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode ToNextRefund = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToNextRefund";
			definition = "Yield To Next Refund (Sinking Fund Bonds) - Yield assuming all bonds are redeemed at the next refund date at the redemption price.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "NXRF";
		}
	};
	/**
	 * The average yield of the respective securities in the portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The average yield of the respective securities in the portfolio."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode OpenAverage = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenAverage";
			definition = "The average yield of the respective securities in the portfolio.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "PNAV";
		}
	};
	/**
	 * The yield to the date at which the bond holder can next put the bond to
	 * the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NXPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToNextPut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield to the date at which the bond holder can next put the bond to the issuer."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode ToNextPut = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToNextPut";
			definition = "The yield to the date at which the bond holder can next put the bond to the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "NXPT";
		}
	};
	/**
	 * The yield of a bond based on the closing price 1 day ago.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The yield of a bond based on the closing price 1 day ago."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode PreviousClose = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousClose";
			definition = "The yield of a bond based on the closing price 1 day ago.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "PRCL";
		}
	};
	/**
	 * The CD equivalent yield when the remaining time to maturity is less than
	 * two years.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRYL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CD equivalent yield when the remaining time to maturity is less than two years."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Proceeds = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proceeds";
			definition = "The CD equivalent yield when the remaining time to maturity is less than two years.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "PRYL";
		}
	};
	/**
	 * The yield of a bond whose coupon payments are reinvested semi-annually.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiAnnual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield of a bond whose coupon payments are reinvested semi-annually."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode SemiAnnual = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SemiAnnual";
			definition = "The yield of a bond whose coupon payments are reinvested semi-annually.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "SEMI";
		}
	};
	/**
	 * The yield assuming that all sinks (mandatory and voluntary) are taken at
	 * par. This results in a faster paydown of debt; the yield is then
	 * calculated to the shortest average life date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHLF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortestAverageLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield assuming that all sinks (mandatory and voluntary) are taken at par. This results in a faster paydown of debt; the yield is then calculated to the shortest average life date."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode ShortestAverageLife = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortestAverageLife";
			definition = "The yield assuming that all sinks (mandatory and voluntary) are taken at par. This results in a faster paydown of debt; the yield is then calculated to the shortest average life date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "SHLF";
		}
	};
	/**
	 * The yield of a bond assuming no reinvestment of coupon payments. (Act/360
	 * day count).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Simple"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield of a bond assuming no reinvestment of coupon payments. (Act/360 day count)."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode Simple = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Simple";
			definition = "The yield of a bond assuming no reinvestment of coupon payments. (Act/360 day count).";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "SPLL";
		}
	};
	/**
	 * The after tax yield grossed up by the maximum federal tax rate of 39.6%.
	 * For comparison to taxable yields.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXQV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxEquivalent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The after tax yield grossed up by the maximum federal tax rate of 39.6%. For comparison to taxable yields."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode TaxEquivalent = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxEquivalent";
			definition = "The after tax yield grossed up by the maximum federal tax rate of 39.6%. For comparison to taxable yields.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "TXQV";
		}
	};
	/**
	 * The yield on a Municipal bond to its mandatory tender date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TTDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToTenderDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield on a Municipal bond to its mandatory tender date."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode ToTenderDate = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToTenderDate";
			definition = "The yield on a Municipal bond to its mandatory tender date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "TTDT";
		}
	};
	/**
	 * The yield calculated with coupon dates moved from a weekend or holiday to
	 * the next valid settlement date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRYL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "True"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield calculated with coupon dates moved from a weekend or holiday to the next valid settlement date."
	 * </li>
	 * </ul>
	 */
	public static final CalculationTypeCode True = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "True";
			definition = "The yield calculated with coupon dates moved from a weekend or holiday to the next valid settlement date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "TRYL";
		}
	};
	/**
	 * The lowest yield to all possible redemption date scenarios.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WRST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToWorstConvention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lowest yield to all possible redemption date scenarios."</li>
	 * </ul>
	 */
	public static final CalculationTypeCode ToWorstConvention = new CalculationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToWorstConvention";
			definition = "The lowest yield to all possible redemption date scenarios.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationTypeCode.mmObject();
			codeName = "WRST";
		}
	};
	final static private LinkedHashMap<String, CalculationTypeCode> codesByName = new LinkedHashMap<>();

	protected CalculationTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CNVX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CalculationTypeCode";
				definition = "Specifies calculation types such as yield, duration, analytics etc.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CalculationTypeCode.Convexity, com.tools20022.repository.codeset.CalculationTypeCode.Volatility, com.tools20022.repository.codeset.CalculationTypeCode.Alpha,
						com.tools20022.repository.codeset.CalculationTypeCode.Beta, com.tools20022.repository.codeset.CalculationTypeCode.Delta, com.tools20022.repository.codeset.CalculationTypeCode.Gamma,
						com.tools20022.repository.codeset.CalculationTypeCode.Speed, com.tools20022.repository.codeset.CalculationTypeCode.Rho, com.tools20022.repository.codeset.CalculationTypeCode.Theta,
						com.tools20022.repository.codeset.CalculationTypeCode.Vega, com.tools20022.repository.codeset.CalculationTypeCode.PriceEarningRatio, com.tools20022.repository.codeset.CalculationTypeCode.Lambda,
						com.tools20022.repository.codeset.CalculationTypeCode.VegaGamma, com.tools20022.repository.codeset.CalculationTypeCode.Vanna, com.tools20022.repository.codeset.CalculationTypeCode.DeltaDecay,
						com.tools20022.repository.codeset.CalculationTypeCode.Color, com.tools20022.repository.codeset.CalculationTypeCode.PriceBookRatio, com.tools20022.repository.codeset.CalculationTypeCode.PriceSalesRatio,
						com.tools20022.repository.codeset.CalculationTypeCode.EarningPerShare, com.tools20022.repository.codeset.CalculationTypeCode.EPSPercentChange,
						com.tools20022.repository.codeset.CalculationTypeCode.NetIncomeSalesRatio, com.tools20022.repository.codeset.CalculationTypeCode.PriceEarningsGrowth, com.tools20022.repository.codeset.CalculationTypeCode.QuickRatio,
						com.tools20022.repository.codeset.CalculationTypeCode.CurrentRatio, com.tools20022.repository.codeset.CalculationTypeCode.DividendPayoutRatio, com.tools20022.repository.codeset.CalculationTypeCode.DebtEquityRatio,
						com.tools20022.repository.codeset.CalculationTypeCode.ReturnOnEquity, com.tools20022.repository.codeset.CalculationTypeCode.ReturnOnAssets, com.tools20022.repository.codeset.CalculationTypeCode.ReturnOnInvestment,
						com.tools20022.repository.codeset.CalculationTypeCode.SalesEmployee, com.tools20022.repository.codeset.CalculationTypeCode.CurrentAssets, com.tools20022.repository.codeset.CalculationTypeCode.LongTermDebt,
						com.tools20022.repository.codeset.CalculationTypeCode.CurrentLiabilities, com.tools20022.repository.codeset.CalculationTypeCode.SalesRevenue, com.tools20022.repository.codeset.CalculationTypeCode.SalesMargin,
						com.tools20022.repository.codeset.CalculationTypeCode.FundAnnualReturn, com.tools20022.repository.codeset.CalculationTypeCode.FundCumReturn,
						com.tools20022.repository.codeset.CalculationTypeCode.FundStandardDeviation, com.tools20022.repository.codeset.CalculationTypeCode.FundBenchExcessAnnualReturn,
						com.tools20022.repository.codeset.CalculationTypeCode.FundBenchExcessCumReturn, com.tools20022.repository.codeset.CalculationTypeCode.FundBenchTrackingError,
						com.tools20022.repository.codeset.CalculationTypeCode.FundPortfolioStandardDeviation, com.tools20022.repository.codeset.CalculationTypeCode.FundBenchAnnualReturn,
						com.tools20022.repository.codeset.CalculationTypeCode.FundBenchCumReturn, com.tools20022.repository.codeset.CalculationTypeCode.LifeToNextProbableCall,
						com.tools20022.repository.codeset.CalculationTypeCode.AverageLife, com.tools20022.repository.codeset.CalculationTypeCode.MacaulyDuration, com.tools20022.repository.codeset.CalculationTypeCode.ModifiedDuration,
						com.tools20022.repository.codeset.CalculationTypeCode.Duration, com.tools20022.repository.codeset.CalculationTypeCode.Yield, com.tools20022.repository.codeset.CalculationTypeCode.YieldToMaturity,
						com.tools20022.repository.codeset.CalculationTypeCode.CurrentYield, com.tools20022.repository.codeset.CalculationTypeCode.DiscountYield, com.tools20022.repository.codeset.CalculationTypeCode.DirectYield,
						com.tools20022.repository.codeset.CalculationTypeCode.YieldToNextCall, com.tools20022.repository.codeset.CalculationTypeCode.YieldToAverageLife,
						com.tools20022.repository.codeset.CalculationTypeCode.BondEquivalentYield, com.tools20022.repository.codeset.CalculationTypeCode.AfterTax, com.tools20022.repository.codeset.CalculationTypeCode.Annual,
						com.tools20022.repository.codeset.CalculationTypeCode.AtIssue, com.tools20022.repository.codeset.CalculationTypeCode.Book, com.tools20022.repository.codeset.CalculationTypeCode.ToAverageMaturity,
						com.tools20022.repository.codeset.CalculationTypeCode.ChangeSinceClose, com.tools20022.repository.codeset.CalculationTypeCode.Closing, com.tools20022.repository.codeset.CalculationTypeCode.Compound,
						com.tools20022.repository.codeset.CalculationTypeCode.TrueGross, com.tools20022.repository.codeset.CalculationTypeCode.GovernmentEquivalent, com.tools20022.repository.codeset.CalculationTypeCode.InflationAssumption,
						com.tools20022.repository.codeset.CalculationTypeCode.InverseFloater, com.tools20022.repository.codeset.CalculationTypeCode.LastClose, com.tools20022.repository.codeset.CalculationTypeCode.LastMonth,
						com.tools20022.repository.codeset.CalculationTypeCode.LastQuarter, com.tools20022.repository.codeset.CalculationTypeCode.LastYear, com.tools20022.repository.codeset.CalculationTypeCode.LongestAverageLife,
						com.tools20022.repository.codeset.CalculationTypeCode.MarkToMarket, com.tools20022.repository.codeset.CalculationTypeCode.ToNextRefund, com.tools20022.repository.codeset.CalculationTypeCode.OpenAverage,
						com.tools20022.repository.codeset.CalculationTypeCode.ToNextPut, com.tools20022.repository.codeset.CalculationTypeCode.PreviousClose, com.tools20022.repository.codeset.CalculationTypeCode.Proceeds,
						com.tools20022.repository.codeset.CalculationTypeCode.SemiAnnual, com.tools20022.repository.codeset.CalculationTypeCode.ShortestAverageLife, com.tools20022.repository.codeset.CalculationTypeCode.Simple,
						com.tools20022.repository.codeset.CalculationTypeCode.TaxEquivalent, com.tools20022.repository.codeset.CalculationTypeCode.ToTenderDate, com.tools20022.repository.codeset.CalculationTypeCode.True,
						com.tools20022.repository.codeset.CalculationTypeCode.ToWorstConvention);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Convexity.getCodeName().get(), Convexity);
		codesByName.put(Volatility.getCodeName().get(), Volatility);
		codesByName.put(Alpha.getCodeName().get(), Alpha);
		codesByName.put(Beta.getCodeName().get(), Beta);
		codesByName.put(Delta.getCodeName().get(), Delta);
		codesByName.put(Gamma.getCodeName().get(), Gamma);
		codesByName.put(Speed.getCodeName().get(), Speed);
		codesByName.put(Rho.getCodeName().get(), Rho);
		codesByName.put(Theta.getCodeName().get(), Theta);
		codesByName.put(Vega.getCodeName().get(), Vega);
		codesByName.put(PriceEarningRatio.getCodeName().get(), PriceEarningRatio);
		codesByName.put(Lambda.getCodeName().get(), Lambda);
		codesByName.put(VegaGamma.getCodeName().get(), VegaGamma);
		codesByName.put(Vanna.getCodeName().get(), Vanna);
		codesByName.put(DeltaDecay.getCodeName().get(), DeltaDecay);
		codesByName.put(Color.getCodeName().get(), Color);
		codesByName.put(PriceBookRatio.getCodeName().get(), PriceBookRatio);
		codesByName.put(PriceSalesRatio.getCodeName().get(), PriceSalesRatio);
		codesByName.put(EarningPerShare.getCodeName().get(), EarningPerShare);
		codesByName.put(EPSPercentChange.getCodeName().get(), EPSPercentChange);
		codesByName.put(NetIncomeSalesRatio.getCodeName().get(), NetIncomeSalesRatio);
		codesByName.put(PriceEarningsGrowth.getCodeName().get(), PriceEarningsGrowth);
		codesByName.put(QuickRatio.getCodeName().get(), QuickRatio);
		codesByName.put(CurrentRatio.getCodeName().get(), CurrentRatio);
		codesByName.put(DividendPayoutRatio.getCodeName().get(), DividendPayoutRatio);
		codesByName.put(DebtEquityRatio.getCodeName().get(), DebtEquityRatio);
		codesByName.put(ReturnOnEquity.getCodeName().get(), ReturnOnEquity);
		codesByName.put(ReturnOnAssets.getCodeName().get(), ReturnOnAssets);
		codesByName.put(ReturnOnInvestment.getCodeName().get(), ReturnOnInvestment);
		codesByName.put(SalesEmployee.getCodeName().get(), SalesEmployee);
		codesByName.put(CurrentAssets.getCodeName().get(), CurrentAssets);
		codesByName.put(LongTermDebt.getCodeName().get(), LongTermDebt);
		codesByName.put(CurrentLiabilities.getCodeName().get(), CurrentLiabilities);
		codesByName.put(SalesRevenue.getCodeName().get(), SalesRevenue);
		codesByName.put(SalesMargin.getCodeName().get(), SalesMargin);
		codesByName.put(FundAnnualReturn.getCodeName().get(), FundAnnualReturn);
		codesByName.put(FundCumReturn.getCodeName().get(), FundCumReturn);
		codesByName.put(FundStandardDeviation.getCodeName().get(), FundStandardDeviation);
		codesByName.put(FundBenchExcessAnnualReturn.getCodeName().get(), FundBenchExcessAnnualReturn);
		codesByName.put(FundBenchExcessCumReturn.getCodeName().get(), FundBenchExcessCumReturn);
		codesByName.put(FundBenchTrackingError.getCodeName().get(), FundBenchTrackingError);
		codesByName.put(FundPortfolioStandardDeviation.getCodeName().get(), FundPortfolioStandardDeviation);
		codesByName.put(FundBenchAnnualReturn.getCodeName().get(), FundBenchAnnualReturn);
		codesByName.put(FundBenchCumReturn.getCodeName().get(), FundBenchCumReturn);
		codesByName.put(LifeToNextProbableCall.getCodeName().get(), LifeToNextProbableCall);
		codesByName.put(AverageLife.getCodeName().get(), AverageLife);
		codesByName.put(MacaulyDuration.getCodeName().get(), MacaulyDuration);
		codesByName.put(ModifiedDuration.getCodeName().get(), ModifiedDuration);
		codesByName.put(Duration.getCodeName().get(), Duration);
		codesByName.put(Yield.getCodeName().get(), Yield);
		codesByName.put(YieldToMaturity.getCodeName().get(), YieldToMaturity);
		codesByName.put(CurrentYield.getCodeName().get(), CurrentYield);
		codesByName.put(DiscountYield.getCodeName().get(), DiscountYield);
		codesByName.put(DirectYield.getCodeName().get(), DirectYield);
		codesByName.put(YieldToNextCall.getCodeName().get(), YieldToNextCall);
		codesByName.put(YieldToAverageLife.getCodeName().get(), YieldToAverageLife);
		codesByName.put(BondEquivalentYield.getCodeName().get(), BondEquivalentYield);
		codesByName.put(AfterTax.getCodeName().get(), AfterTax);
		codesByName.put(Annual.getCodeName().get(), Annual);
		codesByName.put(AtIssue.getCodeName().get(), AtIssue);
		codesByName.put(Book.getCodeName().get(), Book);
		codesByName.put(ToAverageMaturity.getCodeName().get(), ToAverageMaturity);
		codesByName.put(ChangeSinceClose.getCodeName().get(), ChangeSinceClose);
		codesByName.put(Closing.getCodeName().get(), Closing);
		codesByName.put(Compound.getCodeName().get(), Compound);
		codesByName.put(TrueGross.getCodeName().get(), TrueGross);
		codesByName.put(GovernmentEquivalent.getCodeName().get(), GovernmentEquivalent);
		codesByName.put(InflationAssumption.getCodeName().get(), InflationAssumption);
		codesByName.put(InverseFloater.getCodeName().get(), InverseFloater);
		codesByName.put(LastClose.getCodeName().get(), LastClose);
		codesByName.put(LastMonth.getCodeName().get(), LastMonth);
		codesByName.put(LastQuarter.getCodeName().get(), LastQuarter);
		codesByName.put(LastYear.getCodeName().get(), LastYear);
		codesByName.put(LongestAverageLife.getCodeName().get(), LongestAverageLife);
		codesByName.put(MarkToMarket.getCodeName().get(), MarkToMarket);
		codesByName.put(ToNextRefund.getCodeName().get(), ToNextRefund);
		codesByName.put(OpenAverage.getCodeName().get(), OpenAverage);
		codesByName.put(ToNextPut.getCodeName().get(), ToNextPut);
		codesByName.put(PreviousClose.getCodeName().get(), PreviousClose);
		codesByName.put(Proceeds.getCodeName().get(), Proceeds);
		codesByName.put(SemiAnnual.getCodeName().get(), SemiAnnual);
		codesByName.put(ShortestAverageLife.getCodeName().get(), ShortestAverageLife);
		codesByName.put(Simple.getCodeName().get(), Simple);
		codesByName.put(TaxEquivalent.getCodeName().get(), TaxEquivalent);
		codesByName.put(ToTenderDate.getCodeName().get(), ToTenderDate);
		codesByName.put(True.getCodeName().get(), True);
		codesByName.put(ToWorstConvention.getCodeName().get(), ToWorstConvention);
	}

	public static CalculationTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CalculationTypeCode[] values() {
		CalculationTypeCode[] values = new CalculationTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CalculationTypeCode> {
		@Override
		public CalculationTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CalculationTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}