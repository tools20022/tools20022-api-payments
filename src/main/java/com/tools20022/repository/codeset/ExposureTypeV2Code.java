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
import com.tools20022.repository.codeset.ExposureTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the underlying business area/type of trade causing the collateral
 * movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#CrossCurrencyIRS
 * ExposureTypeV2Code.CrossCurrencyIRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#Commodities
 * ExposureTypeV2Code.Commodities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#CreditDefaultSwap
 * ExposureTypeV2Code.CreditDefaultSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#CrossProduct
 * ExposureTypeV2Code.CrossProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#CreditSupport
 * ExposureTypeV2Code.CreditSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#CreditLine
 * ExposureTypeV2Code.CreditLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#EquityOption
 * ExposureTypeV2Code.EquityOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#EquitySwap
 * ExposureTypeV2Code.EquitySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#ExoticOption
 * ExposureTypeV2Code.ExoticOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#ExchangeTradedDerivatives
 * ExposureTypeV2Code.ExchangeTradedDerivatives}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#FixedIncome
 * ExposureTypeV2Code.FixedIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#ForwardForeignExchange
 * ExposureTypeV2Code.ForwardForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#ForeignExchange
 * ExposureTypeV2Code.ForeignExchange}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#Futures
 * ExposureTypeV2Code.Futures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#Liquidity
 * ExposureTypeV2Code.Liquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#FXOption
 * ExposureTypeV2Code.FXOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#OTCDerivatives
 * ExposureTypeV2Code.OTCDerivatives}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#CashSettlement
 * ExposureTypeV2Code.CashSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#Repo
 * ExposureTypeV2Code.Repo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#SecuritiesBuySellSellBuyBack
 * ExposureTypeV2Code.SecuritiesBuySellSellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#SingleCurrencyIRSExotic
 * ExposureTypeV2Code.SingleCurrencyIRSExotic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#SingleCurrencyIRS
 * ExposureTypeV2Code.SingleCurrencyIRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#SecuritiesCrossProducts
 * ExposureTypeV2Code.SecuritiesCrossProducts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#SecuritiesLendingAndBorrowing
 * ExposureTypeV2Code.SecuritiesLendingAndBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#SecuredLoan
 * ExposureTypeV2Code.SecuredLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#Swaption
 * ExposureTypeV2Code.Swaption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#TreasuryCrossProduct
 * ExposureTypeV2Code.TreasuryCrossProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#BondForward
 * ExposureTypeV2Code.BondForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#ReverseRepurchaseAgreement
 * ExposureTypeV2Code.ReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code#ToBeAnnounced
 * ExposureTypeV2Code.ToBeAnnounced}</li>
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
 * "ExposureTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying business area/type of trade causing the collateral movement."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExposureTypeV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cross currency agreement between two parties (known as counterparties)
	 * where one stream of future interest payments is exchanged for another
	 * based on a specified principal amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	 * definition} =
	 * "Cross currency agreement between two parties (known as counterparties) where one stream of future interest payments is exchanged for another based on a specified principal amount."
	 * </li>
	 * </ul>
	 */
	public static final ExposureTypeV2Code CrossCurrencyIRS = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossCurrencyIRS";
			definition = "Cross currency agreement between two parties (known as counterparties) where one stream of future interest payments is exchanged for another based on a specified principal amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "CCIR";
		}
	};
	/**
	 * Any good exchanged during commerce, which includes goods traded on a
	 * commodity exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	 * definition} =
	 * "Any good exchanged during commerce, which includes goods traded on a commodity exchange."
	 * </li>
	 * </ul>
	 */
	public static final ExposureTypeV2Code Commodities = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodities";
			definition = "Any good exchanged during commerce, which includes goods traded on a commodity exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Swap designed to transfer the credit exposure of fixed income products
	 * between parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	 * definition} =
	 * "Swap designed to transfer the credit exposure of fixed income products between parties."
	 * </li>
	 * </ul>
	 */
	public static final ExposureTypeV2Code CreditDefaultSwap = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDefaultSwap";
			definition = "Swap designed to transfer the credit exposure of fixed income products between parties.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "CRDS";
		}
	};
	/**
	 * Combination of various types of trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code CrossProduct = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossProduct";
			definition = "Combination of various types of trades.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "CRPR";
		}
	};
	/**
	 * Cash lending/borrowing; letter of credit; signing of master agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code CreditSupport = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditSupport";
			definition = "Cash lending/borrowing; letter of credit; signing of master agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "CRSP";
		}
	};
	/**
	 * Opening of a credit line before trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code CreditLine = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditLine";
			definition = "Opening of a credit line before trading.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "CRTL";
		}
	};
	/**
	 * Trading of equity option (also known as stock options).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code EquityOption = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityOption";
			definition = "Trading of equity option (also known as stock options).";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code EquitySwap = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquitySwap";
			definition = "Equity swap trades where the return of an equity is exchanged for either a fixed or a floating rate of interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "EQUS";
		}
	};
	/**
	 * Trading of exotic option, for example, a non standard option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code ExoticOption = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExoticOption";
			definition = "Trading of exotic option, for example, a non standard option.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "EXPT";
		}
	};
	/**
	 * Trading of exchanged traded derivatives in general.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code ExchangeTradedDerivatives = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedDerivatives";
			definition = "Trading of exchanged traded derivatives in general.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "EXTD";
		}
	};
	/**
	 * Trading of fixed income instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code FixedIncome = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedIncome";
			definition = "Trading of fixed income instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "FIXI";
		}
	};
	/**
	 * Forward FX trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	 * definition} = "Forward FX trades."</li>
	 * </ul>
	 */
	public static final ExposureTypeV2Code ForwardForeignExchange = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardForeignExchange";
			definition = "Forward FX trades.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "FORW";
		}
	};
	/**
	 * FX trades in general.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	 * definition} = "FX trades in general."</li>
	 * </ul>
	 */
	public static final ExposureTypeV2Code ForeignExchange = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchange";
			definition = "FX trades in general.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "FORX";
		}
	};
	/**
	 * Agreement to buy or sell a specific amount of a commodity or financial
	 * instrument at a particular price on a stipulated future date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	 * definition} =
	 * "Agreement to buy or sell a specific amount of a commodity or financial instrument at a particular price on a stipulated future date."
	 * </li>
	 * </ul>
	 */
	public static final ExposureTypeV2Code Futures = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			definition = "Agreement to buy or sell a specific amount of a commodity or financial instrument at a particular price on a stipulated future date.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "FUTR";
		}
	};
	/**
	 * In support of settlement via an RTGS or other clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code Liquidity = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidity";
			definition = "In support of settlement via an RTGS or other clearing system.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "LIQU";
		}
	};
	/**
	 * A contract that grants the holder the right, but not the obligation, to
	 * buy or sell currency at a specified exchange rate during a specified
	 * period of time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	 * definition} =
	 * "A contract that grants the holder the right, but not the obligation, to buy or sell currency at a specified exchange rate during a specified period of time."
	 * </li>
	 * </ul>
	 */
	public static final ExposureTypeV2Code FXOption = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXOption";
			definition = "A contract that grants the holder the right, but not the obligation, to buy or sell currency at a specified exchange rate during a specified period of time.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * OTC derivatives trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code OTCDerivatives = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OTCDerivatives";
			definition = "OTC derivatives trading.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "OTCD";
		}
	};
	/**
	 * In support of any type of cash settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code CashSettlement = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "In support of any type of cash settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "PAYM";
		}
	};
	/**
	 * Relates to repurchase agreement trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to repurchase agreement trading."</li>
	 * </ul>
	 */
	public static final ExposureTypeV2Code Repo = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			definition = "Relates to repurchase agreement trading.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Securities buy sell back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code SecuritiesBuySellSellBuyBack = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBuySellSellBuyBack";
			definition = "Securities buy sell back.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "SBSC";
		}
	};
	/**
	 * Exotic single currency interest rate swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code SingleCurrencyIRSExotic = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCurrencyIRSExotic";
			definition = "Exotic single currency interest rate swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "SCIE";
		}
	};
	/**
	 * Single currency interest rate swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code SingleCurrencyIRS = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCurrencyIRS";
			definition = "Single currency interest rate swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "SCIR";
		}
	};
	/**
	 * Combination of securities related exposure types.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code SecuritiesCrossProducts = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCrossProducts";
			definition = "Combination of securities related exposure types.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "SCRP";
		}
	};
	/**
	 * Exposure is linked to a securities lending or borrowing activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code SecuritiesLendingAndBorrowing = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLendingAndBorrowing";
			definition = "Exposure is linked to a securities lending or borrowing activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "SLEB";
		}
	};
	/**
	 * Exposure is linked to a secured loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code SecuredLoan = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredLoan";
			definition = "Exposure is linked to a secured loan.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "SLOA";
		}
	};
	/**
	 * Option on interest rate swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code Swaption = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swaption";
			definition = "Option on interest rate swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "SWPT";
		}
	};
	/**
	 * Combination of treasury related exposure types.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryCrossProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Combination of treasury related exposure types."</li>
	 * </ul>
	 */
	public static final ExposureTypeV2Code TreasuryCrossProduct = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryCrossProduct";
			definition = "Combination of treasury related exposure types.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "TRCP";
		}
	};
	/**
	 * Any securities traded out beyond 3 days which include treasury notes,
	 * Japanese Governement Bonds (JGBs) and Gilts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	 * "Any securities traded out beyond 3 days which include treasury notes, Japanese Governement Bonds (JGBs) and Gilts."
	 * </li>
	 * </ul>
	 */
	public static final ExposureTypeV2Code BondForward = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondForward";
			definition = "Any securities traded out beyond 3 days which include treasury notes, Japanese Governement Bonds (JGBs) and Gilts.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "BFWD";
		}
	};
	/**
	 * In support of a reverse repurchase agreement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code ReverseRepurchaseAgreement = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepurchaseAgreement";
			definition = "In support of a reverse repurchase agreement transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "RVPO";
		}
	};
	/**
	 * To be announced (TBA) related collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
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
	public static final ExposureTypeV2Code ToBeAnnounced = new ExposureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToBeAnnounced";
			definition = "To be announced (TBA) related collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureTypeV2Code.mmObject();
			codeName = "TBAS";
		}
	};
	final static private LinkedHashMap<String, ExposureTypeV2Code> codesByName = new LinkedHashMap<>();

	protected ExposureTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CCIR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExposureTypeV2Code";
				definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExposureTypeV2Code.CrossCurrencyIRS, com.tools20022.repository.codeset.ExposureTypeV2Code.Commodities,
						com.tools20022.repository.codeset.ExposureTypeV2Code.CreditDefaultSwap, com.tools20022.repository.codeset.ExposureTypeV2Code.CrossProduct, com.tools20022.repository.codeset.ExposureTypeV2Code.CreditSupport,
						com.tools20022.repository.codeset.ExposureTypeV2Code.CreditLine, com.tools20022.repository.codeset.ExposureTypeV2Code.EquityOption, com.tools20022.repository.codeset.ExposureTypeV2Code.EquitySwap,
						com.tools20022.repository.codeset.ExposureTypeV2Code.ExoticOption, com.tools20022.repository.codeset.ExposureTypeV2Code.ExchangeTradedDerivatives, com.tools20022.repository.codeset.ExposureTypeV2Code.FixedIncome,
						com.tools20022.repository.codeset.ExposureTypeV2Code.ForwardForeignExchange, com.tools20022.repository.codeset.ExposureTypeV2Code.ForeignExchange, com.tools20022.repository.codeset.ExposureTypeV2Code.Futures,
						com.tools20022.repository.codeset.ExposureTypeV2Code.Liquidity, com.tools20022.repository.codeset.ExposureTypeV2Code.FXOption, com.tools20022.repository.codeset.ExposureTypeV2Code.OTCDerivatives,
						com.tools20022.repository.codeset.ExposureTypeV2Code.CashSettlement, com.tools20022.repository.codeset.ExposureTypeV2Code.Repo, com.tools20022.repository.codeset.ExposureTypeV2Code.SecuritiesBuySellSellBuyBack,
						com.tools20022.repository.codeset.ExposureTypeV2Code.SingleCurrencyIRSExotic, com.tools20022.repository.codeset.ExposureTypeV2Code.SingleCurrencyIRS,
						com.tools20022.repository.codeset.ExposureTypeV2Code.SecuritiesCrossProducts, com.tools20022.repository.codeset.ExposureTypeV2Code.SecuritiesLendingAndBorrowing,
						com.tools20022.repository.codeset.ExposureTypeV2Code.SecuredLoan, com.tools20022.repository.codeset.ExposureTypeV2Code.Swaption, com.tools20022.repository.codeset.ExposureTypeV2Code.TreasuryCrossProduct,
						com.tools20022.repository.codeset.ExposureTypeV2Code.BondForward, com.tools20022.repository.codeset.ExposureTypeV2Code.ReverseRepurchaseAgreement, com.tools20022.repository.codeset.ExposureTypeV2Code.ToBeAnnounced);
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
		codesByName.put(Repo.getCodeName().get(), Repo);
		codesByName.put(SecuritiesBuySellSellBuyBack.getCodeName().get(), SecuritiesBuySellSellBuyBack);
		codesByName.put(SingleCurrencyIRSExotic.getCodeName().get(), SingleCurrencyIRSExotic);
		codesByName.put(SingleCurrencyIRS.getCodeName().get(), SingleCurrencyIRS);
		codesByName.put(SecuritiesCrossProducts.getCodeName().get(), SecuritiesCrossProducts);
		codesByName.put(SecuritiesLendingAndBorrowing.getCodeName().get(), SecuritiesLendingAndBorrowing);
		codesByName.put(SecuredLoan.getCodeName().get(), SecuredLoan);
		codesByName.put(Swaption.getCodeName().get(), Swaption);
		codesByName.put(TreasuryCrossProduct.getCodeName().get(), TreasuryCrossProduct);
		codesByName.put(BondForward.getCodeName().get(), BondForward);
		codesByName.put(ReverseRepurchaseAgreement.getCodeName().get(), ReverseRepurchaseAgreement);
		codesByName.put(ToBeAnnounced.getCodeName().get(), ToBeAnnounced);
	}

	public static ExposureTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExposureTypeV2Code[] values() {
		ExposureTypeV2Code[] values = new ExposureTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExposureTypeV2Code> {
		@Override
		public ExposureTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExposureTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}