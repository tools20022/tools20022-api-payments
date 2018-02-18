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
import com.tools20022.repository.codeset.ExposureTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Short sale exposure.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#CrossCurrencyIRS
 * ExposureTypeCode.CrossCurrencyIRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#Commodities
 * ExposureTypeCode.Commodities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#CreditDefaultSwap
 * ExposureTypeCode.CreditDefaultSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#CrossProduct
 * ExposureTypeCode.CrossProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#CreditSupport
 * ExposureTypeCode.CreditSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#CreditLine
 * ExposureTypeCode.CreditLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#EquityOption
 * ExposureTypeCode.EquityOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#EquitySwap
 * ExposureTypeCode.EquitySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#ExoticOption
 * ExposureTypeCode.ExoticOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#ExchangeTradedDerivatives
 * ExposureTypeCode.ExchangeTradedDerivatives}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#FixedIncome
 * ExposureTypeCode.FixedIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#ForwardForeignExchange
 * ExposureTypeCode.ForwardForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#ForeignExchange
 * ExposureTypeCode.ForeignExchange}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureTypeCode#Futures
 * ExposureTypeCode.Futures}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureTypeCode#Liquidity
 * ExposureTypeCode.Liquidity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureTypeCode#FXOption
 * ExposureTypeCode.FXOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#OTCDerivatives
 * ExposureTypeCode.OTCDerivatives}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#CashSettlement
 * ExposureTypeCode.CashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#RepurchaseAgreement
 * ExposureTypeCode.RepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#SecuritiesBuySellSellBuyBack
 * ExposureTypeCode.SecuritiesBuySellSellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#SingleCurrencyIRSExotic
 * ExposureTypeCode.SingleCurrencyIRSExotic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#SingleCurrencyIRS
 * ExposureTypeCode.SingleCurrencyIRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#SecuritiesCrossProducts
 * ExposureTypeCode.SecuritiesCrossProducts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#SecuritiesLendingAndBorrowing
 * ExposureTypeCode.SecuritiesLendingAndBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#SecuredLoan
 * ExposureTypeCode.SecuredLoan}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureTypeCode#Swaption
 * ExposureTypeCode.Swaption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#TreasuryCorssProduct
 * ExposureTypeCode.TreasuryCorssProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#BondForward
 * ExposureTypeCode.BondForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#ReverseRepurchaseAgreement
 * ExposureTypeCode.ReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#ToBeAnnounced
 * ExposureTypeCode.ToBeAnnounced}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureTypeCode#ShortSell
 * ExposureTypeCode.ShortSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#CCPCollateral
 * ExposureTypeCode.CCPCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureTypeCode#Equity
 * ExposureTypeCode.Equity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode#TreasuryBonds
 * ExposureTypeCode.TreasuryBonds}</li>
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
 * <li>"CCIR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExposureTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Short sale exposure."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExposureTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cross currency interest rate swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCIR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossCurrencyIRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cross currency interest rate swap."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode CrossCurrencyIRS = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossCurrencyIRS";
			definition = "Cross currency interest rate swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "CCIR";
		}
	};
	/**
	 * Trading of exchanged traded commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading of exchanged traded commodities."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode Commodities = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodities";
			definition = "Trading of exchanged traded commodities.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Trading of credit default swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDefaultSwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading of credit default swap."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode CreditDefaultSwap = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDefaultSwap";
			definition = "Trading of credit default swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "CRDS";
		}
	};
	/**
	 * Combination of various types of trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Combination of various types of trades."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode CrossProduct = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossProduct";
			definition = "Combination of various types of trades.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "CRPR";
		}
	};
	/**
	 * Cash lending/borrowing; letter of credit; signing of master agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash lending/borrowing; letter of credit; signing of master agreement."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode CreditSupport = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditSupport";
			definition = "Cash lending/borrowing; letter of credit; signing of master agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "CRSP";
		}
	};
	/**
	 * Opening of a credit line before trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Opening of a credit line before trading."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode CreditLine = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditLine";
			definition = "Opening of a credit line before trading.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "CRTL";
		}
	};
	/**
	 * Trading of equity option (also known as stock options).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading of equity option (also known as stock options)."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode EquityOption = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityOption";
			definition = "Trading of equity option (also known as stock options).";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "EQPT";
		}
	};
	/**
	 * Equity swap trades where the return of an equity is exchanged for either
	 * a fixed or a floating rate of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquitySwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Equity swap trades where the return of an equity is exchanged for either a fixed or a floating rate of interest."
	 * </li>
	 * </ul>
	 */
	public static final ExposureTypeCode EquitySwap = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquitySwap";
			definition = "Equity swap trades where the return of an equity is exchanged for either a fixed or a floating rate of interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "EQUS";
		}
	};
	/**
	 * Trading of exotic option, for example, a non standard option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExoticOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trading of exotic option, for example, a non standard option."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode ExoticOption = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExoticOption";
			definition = "Trading of exotic option, for example, a non standard option.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "EXPT";
		}
	};
	/**
	 * Trading of exchanged traded derivatives in general.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedDerivatives"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading of exchanged traded derivatives in general."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode ExchangeTradedDerivatives = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedDerivatives";
			definition = "Trading of exchanged traded derivatives in general.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "EXTD";
		}
	};
	/**
	 * Trading of fixed income instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIXI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading of fixed income instruments."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode FixedIncome = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedIncome";
			definition = "Trading of fixed income instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "FIXI";
		}
	};
	/**
	 * Forward foreign exchange trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardForeignExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Forward foreign exchange trades."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode ForwardForeignExchange = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardForeignExchange";
			definition = "Forward foreign exchange trades.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "FORW";
		}
	};
	/**
	 * Foreign exchange trades in general.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Foreign exchange trades in general."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode ForeignExchange = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchange";
			definition = "Foreign exchange trades in general.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "FORX";
		}
	};
	/**
	 * Related to futures trading activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Futures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related to futures trading activity."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode Futures = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			definition = "Related to futures trading activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "FUTR";
		}
	};
	/**
	 * In support of settlement via an RTGS or other clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In support of settlement via an RTGS or other clearing system."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode Liquidity = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidity";
			definition = "In support of settlement via an RTGS or other clearing system.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "LIQU";
		}
	};
	/**
	 * Related to options trading activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related to options trading activity."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode FXOption = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXOption";
			definition = "Related to options trading activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * OTC derivatives trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OTCDerivatives"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "OTC derivatives trading."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode OTCDerivatives = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OTCDerivatives";
			definition = "OTC derivatives trading.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "OTCD";
		}
	};
	/**
	 * In support of any type of cash settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAYM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "In support of any type of cash settlement."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode CashSettlement = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "In support of any type of cash settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "PAYM";
		}
	};
	/**
	 * Relates to repurchase agreement trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to repurchase agreement trading."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode RepurchaseAgreement = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAgreement";
			definition = "Relates to repurchase agreement trading.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Securities buy sell back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBuySellSellBuyBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities buy sell back."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode SecuritiesBuySellSellBuyBack = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBuySellSellBuyBack";
			definition = "Securities buy sell back.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "SBSC";
		}
	};
	/**
	 * Exotic single currency interest rate swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCIE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCurrencyIRSExotic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exotic single currency interest rate swap."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode SingleCurrencyIRSExotic = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCurrencyIRSExotic";
			definition = "Exotic single currency interest rate swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "SCIE";
		}
	};
	/**
	 * Single currency interest rate swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCIR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCurrencyIRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Single currency interest rate swap."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode SingleCurrencyIRS = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCurrencyIRS";
			definition = "Single currency interest rate swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "SCIR";
		}
	};
	/**
	 * Combination of securities related exposure types.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCrossProducts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Combination of securities related exposure types."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode SecuritiesCrossProducts = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCrossProducts";
			definition = "Combination of securities related exposure types.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "SCRP";
		}
	};
	/**
	 * Exposure is linked to a securities lending or borrowing activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLEB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLendingAndBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exposure is linked to a securities lending or borrowing activity."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode SecuritiesLendingAndBorrowing = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLendingAndBorrowing";
			definition = "Exposure is linked to a securities lending or borrowing activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "SLEB";
		}
	};
	/**
	 * Exposure is linked to a secured loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exposure is linked to a secured loan."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode SecuredLoan = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredLoan";
			definition = "Exposure is linked to a secured loan.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "SLOA";
		}
	};
	/**
	 * Option on interest rate swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swaption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option on interest rate swap."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode Swaption = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swaption";
			definition = "Option on interest rate swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "SWPT";
		}
	};
	/**
	 * Combination of treasury related exposure types.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryCorssProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Combination of treasury related exposure types."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode TreasuryCorssProduct = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryCorssProduct";
			definition = "Combination of treasury related exposure types.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "TRCP";
		}
	};
	/**
	 * Any securities traded out beyond 3 days which include treasury notes,
	 * Japanese Government Bonds (JGBs) and Gilts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BFWD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any securities traded out beyond 3 days which include treasury notes, Japanese Government Bonds (JGBs) and Gilts."
	 * </li>
	 * </ul>
	 */
	public static final ExposureTypeCode BondForward = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondForward";
			definition = "Any securities traded out beyond 3 days which include treasury notes, Japanese Government Bonds (JGBs) and Gilts.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "BFWD";
		}
	};
	/**
	 * In support of a reverse repurchase agreement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "In support of a reverse repurchase agreement transaction."
	 * </li>
	 * </ul>
	 */
	public static final ExposureTypeCode ReverseRepurchaseAgreement = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepurchaseAgreement";
			definition = "In support of a reverse repurchase agreement transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "RVPO";
		}
	};
	/**
	 * To be announced (TBA) related collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TBAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToBeAnnounced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "To be announced (TBA) related collateral."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode ToBeAnnounced = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToBeAnnounced";
			definition = "To be announced (TBA) related collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "TBAS";
		}
	};
	/**
	 * Short sale exposure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHSL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortSell"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short sale exposure."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode ShortSell = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortSell";
			definition = "Short sale exposure.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "SHSL";
		}
	};
	/**
	 * Collateral covering the initial margin requirements for OTC trades
	 * cleared through a CCP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral covering the initial margin requirements for OTC trades cleared through a CCP."
	 * </li>
	 * </ul>
	 */
	public static final ExposureTypeCode CCPCollateral = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPCollateral";
			definition = "Collateral covering the initial margin requirements for OTC trades cleared through a CCP.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "CCPC";
		}
	};
	/**
	 * Trading of equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQUI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading of equity."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode Equity = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			definition = "Trading of equity.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "EQUI";
		}
	};
	/**
	 * Trading of treasury bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryBonds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading of treasury bonds."</li>
	 * </ul>
	 */
	public static final ExposureTypeCode TreasuryBonds = new ExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryBonds";
			definition = "Trading of treasury bonds.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeCode.mmObject();
			codeName = "TRBD";
		}
	};
	final static private LinkedHashMap<String, ExposureTypeCode> codesByName = new LinkedHashMap<>();

	protected ExposureTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CCIR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExposureTypeCode";
				definition = "Short sale exposure.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExposureTypeCode.CrossCurrencyIRS, com.tools20022.repository.codeset.ExposureTypeCode.Commodities,
						com.tools20022.repository.codeset.ExposureTypeCode.CreditDefaultSwap, com.tools20022.repository.codeset.ExposureTypeCode.CrossProduct, com.tools20022.repository.codeset.ExposureTypeCode.CreditSupport,
						com.tools20022.repository.codeset.ExposureTypeCode.CreditLine, com.tools20022.repository.codeset.ExposureTypeCode.EquityOption, com.tools20022.repository.codeset.ExposureTypeCode.EquitySwap,
						com.tools20022.repository.codeset.ExposureTypeCode.ExoticOption, com.tools20022.repository.codeset.ExposureTypeCode.ExchangeTradedDerivatives, com.tools20022.repository.codeset.ExposureTypeCode.FixedIncome,
						com.tools20022.repository.codeset.ExposureTypeCode.ForwardForeignExchange, com.tools20022.repository.codeset.ExposureTypeCode.ForeignExchange, com.tools20022.repository.codeset.ExposureTypeCode.Futures,
						com.tools20022.repository.codeset.ExposureTypeCode.Liquidity, com.tools20022.repository.codeset.ExposureTypeCode.FXOption, com.tools20022.repository.codeset.ExposureTypeCode.OTCDerivatives,
						com.tools20022.repository.codeset.ExposureTypeCode.CashSettlement, com.tools20022.repository.codeset.ExposureTypeCode.RepurchaseAgreement,
						com.tools20022.repository.codeset.ExposureTypeCode.SecuritiesBuySellSellBuyBack, com.tools20022.repository.codeset.ExposureTypeCode.SingleCurrencyIRSExotic,
						com.tools20022.repository.codeset.ExposureTypeCode.SingleCurrencyIRS, com.tools20022.repository.codeset.ExposureTypeCode.SecuritiesCrossProducts,
						com.tools20022.repository.codeset.ExposureTypeCode.SecuritiesLendingAndBorrowing, com.tools20022.repository.codeset.ExposureTypeCode.SecuredLoan, com.tools20022.repository.codeset.ExposureTypeCode.Swaption,
						com.tools20022.repository.codeset.ExposureTypeCode.TreasuryCorssProduct, com.tools20022.repository.codeset.ExposureTypeCode.BondForward, com.tools20022.repository.codeset.ExposureTypeCode.ReverseRepurchaseAgreement,
						com.tools20022.repository.codeset.ExposureTypeCode.ToBeAnnounced, com.tools20022.repository.codeset.ExposureTypeCode.ShortSell, com.tools20022.repository.codeset.ExposureTypeCode.CCPCollateral,
						com.tools20022.repository.codeset.ExposureTypeCode.Equity, com.tools20022.repository.codeset.ExposureTypeCode.TreasuryBonds);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CrossCurrencyIRS.getCodeName().get(), CrossCurrencyIRS);
		codesByName.put(Commodities.getCodeName().get(), Commodities);
		codesByName.put(CreditDefaultSwap.getCodeName().get(), CreditDefaultSwap);
		codesByName.put(CrossProduct.getCodeName().get(), CrossProduct);
		codesByName.put(CreditSupport.getCodeName().get(), CreditSupport);
		codesByName.put(CreditLine.getCodeName().get(), CreditLine);
		codesByName.put(EquityOption.getCodeName().get(), EquityOption);
		codesByName.put(EquitySwap.getCodeName().get(), EquitySwap);
		codesByName.put(ExoticOption.getCodeName().get(), ExoticOption);
		codesByName.put(ExchangeTradedDerivatives.getCodeName().get(), ExchangeTradedDerivatives);
		codesByName.put(FixedIncome.getCodeName().get(), FixedIncome);
		codesByName.put(ForwardForeignExchange.getCodeName().get(), ForwardForeignExchange);
		codesByName.put(ForeignExchange.getCodeName().get(), ForeignExchange);
		codesByName.put(Futures.getCodeName().get(), Futures);
		codesByName.put(Liquidity.getCodeName().get(), Liquidity);
		codesByName.put(FXOption.getCodeName().get(), FXOption);
		codesByName.put(OTCDerivatives.getCodeName().get(), OTCDerivatives);
		codesByName.put(CashSettlement.getCodeName().get(), CashSettlement);
		codesByName.put(RepurchaseAgreement.getCodeName().get(), RepurchaseAgreement);
		codesByName.put(SecuritiesBuySellSellBuyBack.getCodeName().get(), SecuritiesBuySellSellBuyBack);
		codesByName.put(SingleCurrencyIRSExotic.getCodeName().get(), SingleCurrencyIRSExotic);
		codesByName.put(SingleCurrencyIRS.getCodeName().get(), SingleCurrencyIRS);
		codesByName.put(SecuritiesCrossProducts.getCodeName().get(), SecuritiesCrossProducts);
		codesByName.put(SecuritiesLendingAndBorrowing.getCodeName().get(), SecuritiesLendingAndBorrowing);
		codesByName.put(SecuredLoan.getCodeName().get(), SecuredLoan);
		codesByName.put(Swaption.getCodeName().get(), Swaption);
		codesByName.put(TreasuryCorssProduct.getCodeName().get(), TreasuryCorssProduct);
		codesByName.put(BondForward.getCodeName().get(), BondForward);
		codesByName.put(ReverseRepurchaseAgreement.getCodeName().get(), ReverseRepurchaseAgreement);
		codesByName.put(ToBeAnnounced.getCodeName().get(), ToBeAnnounced);
		codesByName.put(ShortSell.getCodeName().get(), ShortSell);
		codesByName.put(CCPCollateral.getCodeName().get(), CCPCollateral);
		codesByName.put(Equity.getCodeName().get(), Equity);
		codesByName.put(TreasuryBonds.getCodeName().get(), TreasuryBonds);
	}

	public static ExposureTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExposureTypeCode[] values() {
		ExposureTypeCode[] values = new ExposureTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExposureTypeCode> {
		@Override
		public ExposureTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExposureTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}