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
import com.tools20022.repository.codeset.BenchmarkCurveNameCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies a benchmark curve name.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#MuniAAA
 * BenchmarkCurveNameCode.MuniAAA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#FutureSWAP
 * BenchmarkCurveNameCode.FutureSWAP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#LIBID
 * BenchmarkCurveNameCode.LIBID}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#LIBOR
 * BenchmarkCurveNameCode.LIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#SWAP
 * BenchmarkCurveNameCode.SWAP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#Treasury
 * BenchmarkCurveNameCode.Treasury}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#Euribor
 * BenchmarkCurveNameCode.Euribor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#Pfandbriefe
 * BenchmarkCurveNameCode.Pfandbriefe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#EONIA
 * BenchmarkCurveNameCode.EONIA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#EONIASwaps
 * BenchmarkCurveNameCode.EONIASwaps}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#EURODOLLAR
 * BenchmarkCurveNameCode.EURODOLLAR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#EuroSwiss
 * BenchmarkCurveNameCode.EuroSwiss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#TIBOR
 * BenchmarkCurveNameCode.TIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#ISDAFIX
 * BenchmarkCurveNameCode.ISDAFIX}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#GCFRepo
 * BenchmarkCurveNameCode.GCFRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#STIBOR
 * BenchmarkCurveNameCode.STIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#BBSW
 * BenchmarkCurveNameCode.BBSW}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#JIBAR
 * BenchmarkCurveNameCode.JIBAR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#BUBOR
 * BenchmarkCurveNameCode.BUBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#CDOR
 * BenchmarkCurveNameCode.CDOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#CIBOR
 * BenchmarkCurveNameCode.CIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#MOSPRIM
 * BenchmarkCurveNameCode.MOSPRIM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#NIBOR
 * BenchmarkCurveNameCode.NIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#PRIBOR
 * BenchmarkCurveNameCode.PRIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#TELBOR
 * BenchmarkCurveNameCode.TELBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode#WIBOR
 * BenchmarkCurveNameCode.WIBOR}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
 * BenchmarkCurveName2Code}</li>
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
 * <li>"MAAA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BenchmarkCurveNameCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies a benchmark curve name."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BenchmarkCurveNameCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Benchmark curve used for municipals based on the best credit rating for
	 * municipal market debt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAAA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniAAA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Benchmark curve used for municipals based on the best credit rating for municipal market debt."
	 * </li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode MuniAAA = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MuniAAA";
			definition = "Benchmark curve used for municipals based on the best credit rating for municipal market debt.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "MAAA";
		}
	};
	/**
	 * Portion of a synthetic curve that is composed of Eurodollar or Treasury
	 * or similar Futures and Swap rates. The term usually begins at 3 months to
	 * 2 years for the futures strip component with the Swaps filling in the
	 * points to 10 years and beyond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUSW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureSWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of a synthetic curve that is composed of Eurodollar or Treasury or similar Futures and Swap rates. The term usually begins at 3 months to 2 years for the futures strip component with the Swaps filling in the points to 10 years and beyond."
	 * </li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode FutureSWAP = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FutureSWAP";
			definition = "Portion of a synthetic curve that is composed of Eurodollar or Treasury or similar Futures and Swap rates. The term usually begins at 3 months to 2 years for the futures strip component with the Swaps filling in the points to 10 years and beyond.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "FUSW";
		}
	};
	/**
	 * Rate at which major international banks are willing to take deposits from
	 * one another, is normally 1/8 percent below LIBOR.<br>
	 * <br>
	 * London InterBank Bid Rate, the rate bid by banks on Eurocurrency
	 * deposits; the international rate that banks lend to other banks.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIBI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LIBID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which major international banks are willing to take deposits from one another, is normally 1/8 percent below LIBOR.\r\n\r\nLondon InterBank Bid Rate, the rate bid by banks on Eurocurrency deposits; the international rate that banks lend to other banks."
	 * </li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode LIBID = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LIBID";
			definition = "Rate at which major international banks are willing to take deposits from one another, is normally 1/8 percent below LIBOR.\r\n\r\nLondon InterBank Bid Rate, the rate bid by banks on Eurocurrency deposits; the international rate that banks lend to other banks.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "LIBI";
		}
	};
	/**
	 * London Interbank Offered Rate, the interest rate that major international
	 * banks in London charge each other for borrowing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LIBOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "London Interbank Offered Rate, the interest rate that major international banks in London charge each other for borrowing."
	 * </li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode LIBOR = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LIBOR";
			definition = "London Interbank Offered Rate, the interest rate that major international banks in London charge each other for borrowing.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "LIBO";
		}
	};
	/**
	 * In curve construction, Swap is the long portion of the curve constituting
	 * about 3 years to 30 years term.
	 * 
	 * The exchange of one security, currency or interest rate for another to
	 * change the maturity (bonds), or quality of issues (stocks or bonds), or
	 * because investment objectives have changed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In curve construction, Swap is the long portion of the curve constituting about 3 years to 30 years term.\n\nThe exchange of one security, currency or interest rate for another to change the maturity (bonds), or quality of issues (stocks or bonds), or because investment objectives have changed."
	 * </li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode SWAP = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SWAP";
			definition = "In curve construction, Swap is the long portion of the curve constituting about 3 years to 30 years term.\n\nThe exchange of one security, currency or interest rate for another to change the maturity (bonds), or quality of issues (stocks or bonds), or because investment objectives have changed.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "SWAP";
		}
	};
	/**
	 * Treasury benchmark that comes in three types: the yield curve, the par
	 * curve, and the spot curve. All curves also have a constituent time
	 * series.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Treasury"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Treasury benchmark that comes in three types: the yield curve, the par curve, and the spot curve. All curves also have a constituent time series."
	 * </li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode Treasury = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Treasury";
			definition = "Treasury benchmark that comes in three types: the yield curve, the par curve, and the spot curve. All curves also have a constituent time series.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "TREA";
		}
	};
	/**
	 * Euro Interbank Offer Rate is the rate at which Euro inter-bank term
	 * deposits within the Euro zone are offered by one prime bank to another
	 * prime bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EURI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Euribor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Euro Interbank Offer Rate is the rate at which Euro inter-bank term deposits within the Euro zone are offered by one prime bank to another prime bank."
	 * </li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode Euribor = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Euribor";
			definition = "Euro Interbank Offer Rate is the rate at which Euro inter-bank term deposits within the Euro zone are offered by one prime bank to another prime bank.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "EURI";
		}
	};
	/**
	 * Pfandbriefe security is a collateralised bullet bond backed by either
	 * mortgage loans or loans to the public sector. Pfandbriefe differ from
	 * traditional asset-backed securities in significant ways. The most
	 * important difference is that Pfandbriefe carry no pre-payment risk since
	 * they remain on the balance sheet of the issuing institution. Therefore,
	 * their spreads over sovereign bonds are attributable to liquidity and
	 * credit quality alone. New indices have been created and existing indices
	 * have been modified in response to the growing importance of the
	 * Pfandbriefe market. The Deutsche Borse has three synthetic indices called
	 * REX, JEX, and PEX. The Pfandbriefe curve is used as a reference for
	 * credit as well as mortgage market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PFAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pfandbriefe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pfandbriefe security is a collateralised bullet bond backed by either mortgage loans or loans to the public sector. Pfandbriefe differ from traditional asset-backed securities in significant ways. The most important difference is that Pfandbriefe carry no pre-payment risk since they remain on the balance sheet of the issuing institution. Therefore, their spreads over sovereign bonds are attributable to liquidity and credit quality alone. New indices have been created and existing indices have been modified in response to the growing importance of the Pfandbriefe market. The Deutsche Borse has three synthetic indices called REX, JEX, and PEX. The Pfandbriefe curve is used as a reference for credit as well as mortgage market."
	 * </li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode Pfandbriefe = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pfandbriefe";
			definition = "Pfandbriefe security is a collateralised bullet bond backed by either mortgage loans or loans to the public sector. Pfandbriefe differ from traditional asset-backed securities in significant ways. The most important difference is that Pfandbriefe carry no pre-payment risk since they remain on the balance sheet of the issuing institution. Therefore, their spreads over sovereign bonds are attributable to liquidity and credit quality alone. New indices have been created and existing indices have been modified in response to the growing importance of the Pfandbriefe market. The Deutsche Borse has three synthetic indices called REX, JEX, and PEX. The Pfandbriefe curve is used as a reference for credit as well as mortgage market.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "PFAN";
		}
	};
	/**
	 * Euro OverNight Index Average rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EONA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EONIA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Euro OverNight Index Average rate."</li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode EONIA = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EONIA";
			definition = "Euro OverNight Index Average rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "EONA";
		}
	};
	/**
	 * Euro OverNight Index Average swap rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EONS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EONIASwaps"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Euro OverNight Index Average swap rate."</li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode EONIASwaps = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EONIASwaps";
			definition = "Euro OverNight Index Average swap rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "EONS";
		}
	};
	/**
	 * Rate for the eurodollars, time deposits denominated in U.S. dollars at
	 * banks outside the United States, and thus are not under the jurisdiction
	 * of the Federal Reserve.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EURODOLLAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate for the eurodollars, time deposits denominated in U.S. dollars at banks outside the United States, and thus are not under the jurisdiction of the Federal Reserve."
	 * </li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode EURODOLLAR = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EURODOLLAR";
			definition = "Rate for the eurodollars, time deposits denominated in U.S. dollars at banks outside the United States, and thus are not under the jurisdiction of the Federal Reserve.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "EUUS";
		}
	};
	/**
	 * Swiss Franc LIBOR rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EuroSwiss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Swiss Franc LIBOR rate."</li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode EuroSwiss = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EuroSwiss";
			definition = "Swiss Franc LIBOR rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "EUCH";
		}
	};
	/**
	 * Tokyo Interbank Offered Rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TIBOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tokyo Interbank Offered Rate."</li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode TIBOR = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TIBOR";
			definition = "Tokyo Interbank Offered Rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "TIBO";
		}
	};
	/**
	 * Worldwide common reference rate value for fixed interest rate swap rates,
	 * as defined by the International Swaps and Derivatives Association (ISDA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISDAFIX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Worldwide common reference rate value for fixed interest rate swap rates, as defined by the International Swaps and Derivatives Association (ISDA)."
	 * </li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode ISDAFIX = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISDAFIX";
			definition = "Worldwide common reference rate value for fixed interest rate swap rates, as defined by the International Swaps and Derivatives Association (ISDA).";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "ISDA";
		}
	};
	/**
	 * GCF Repo Index, the Depository Trust &amp; Clearing Corporation (DTCC)
	 * general collateral finance repurchase agreements index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GCFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GCFRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GCF Repo Index, the Depository Trust &amp; Clearing Corporation (DTCC) general collateral finance repurchase agreements index."
	 * </li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode GCFRepo = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GCFRepo";
			definition = "GCF Repo Index, the Depository Trust & Clearing Corporation (DTCC) general collateral finance repurchase agreements index.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "GCFR";
		}
	};
	/**
	 * Stockholm Interbank Offered Rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "STIBOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stockholm Interbank Offered Rate."</li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode STIBOR = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "STIBOR";
			definition = "Stockholm Interbank Offered Rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "STBO";
		}
	};
	/**
	 * Australian Financial Markets Association (AFMA) Bank-Bill Reference Rate
	 * (BBSW).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BBSW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BBSW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Australian Financial Markets Association (AFMA) Bank-Bill Reference Rate (BBSW)."
	 * </li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode BBSW = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BBSW";
			definition = "Australian Financial Markets Association (AFMA) Bank-Bill Reference Rate (BBSW).";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "BBSW";
		}
	};
	/**
	 * Johannesburg Interbank Agreed Rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JIBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JIBAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Johannesburg Interbank Agreed Rate."</li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode JIBAR = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JIBAR";
			definition = "Johannesburg Interbank Agreed Rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "JIBA";
		}
	};
	/**
	 * Budapest Interbank Offered Rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BUBOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Budapest Interbank Offered Rate."</li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode BUBOR = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BUBOR";
			definition = "Budapest Interbank Offered Rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "BUBO";
		}
	};
	/**
	 * Canadian Dollar Offered Rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CDOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Canadian Dollar Offered Rate."</li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode CDOR = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CDOR";
			definition = "Canadian Dollar Offered Rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "CDOR";
		}
	};
	/**
	 * Copenhagen Interbank Offered Rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CIBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CIBOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Copenhagen Interbank Offered Rate."</li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode CIBOR = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CIBOR";
			definition = "Copenhagen Interbank Offered Rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "CIBO";
		}
	};
	/**
	 * Moscow Prime Offered Rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MOSPRIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Moscow Prime Offered Rate."</li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode MOSPRIM = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MOSPRIM";
			definition = "Moscow Prime Offered Rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "MOSP";
		}
	};
	/**
	 * Norwegian Interbank Offered Rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NIBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NIBOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Norwegian Interbank Offered Rate."</li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode NIBOR = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NIBOR";
			definition = "Norwegian Interbank Offered Rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "NIBO";
		}
	};
	/**
	 * Czech Fixing of Interest Rates on Interbank Deposits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PRIBOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Czech Fixing of Interest Rates on Interbank Deposits."</li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode PRIBOR = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PRIBOR";
			definition = "Czech Fixing of Interest Rates on Interbank Deposits.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "PRBO";
		}
	};
	/**
	 * Tel Aviv Interbank Offered Rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TLBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TELBOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tel Aviv Interbank Offered Rate."</li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode TELBOR = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TELBOR";
			definition = "Tel Aviv Interbank Offered Rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "TLBO";
		}
	};
	/**
	 * Warsaw Interbank Offered Rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WIBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WIBOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Warsaw Interbank Offered Rate."</li>
	 * </ul>
	 */
	public static final BenchmarkCurveNameCode WIBOR = new BenchmarkCurveNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WIBOR";
			definition = "Warsaw Interbank Offered Rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveNameCode.mmObject();
			codeName = "WIBO";
		}
	};
	final static private LinkedHashMap<String, BenchmarkCurveNameCode> codesByName = new LinkedHashMap<>();

	protected BenchmarkCurveNameCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MAAA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BenchmarkCurveNameCode";
				definition = "Identifies a benchmark curve name.";
				derivation_lazy = () -> Arrays.asList(BenchmarkCurveName2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BenchmarkCurveNameCode.MuniAAA, com.tools20022.repository.codeset.BenchmarkCurveNameCode.FutureSWAP,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.LIBID, com.tools20022.repository.codeset.BenchmarkCurveNameCode.LIBOR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.SWAP,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.Treasury, com.tools20022.repository.codeset.BenchmarkCurveNameCode.Euribor, com.tools20022.repository.codeset.BenchmarkCurveNameCode.Pfandbriefe,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.EONIA, com.tools20022.repository.codeset.BenchmarkCurveNameCode.EONIASwaps, com.tools20022.repository.codeset.BenchmarkCurveNameCode.EURODOLLAR,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.EuroSwiss, com.tools20022.repository.codeset.BenchmarkCurveNameCode.TIBOR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.ISDAFIX,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.GCFRepo, com.tools20022.repository.codeset.BenchmarkCurveNameCode.STIBOR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.BBSW,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.JIBAR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.BUBOR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.CDOR,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.CIBOR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.MOSPRIM, com.tools20022.repository.codeset.BenchmarkCurveNameCode.NIBOR,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.PRIBOR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.TELBOR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.WIBOR);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MuniAAA.getCodeName().get(), MuniAAA);
		codesByName.put(FutureSWAP.getCodeName().get(), FutureSWAP);
		codesByName.put(LIBID.getCodeName().get(), LIBID);
		codesByName.put(LIBOR.getCodeName().get(), LIBOR);
		codesByName.put(SWAP.getCodeName().get(), SWAP);
		codesByName.put(Treasury.getCodeName().get(), Treasury);
		codesByName.put(Euribor.getCodeName().get(), Euribor);
		codesByName.put(Pfandbriefe.getCodeName().get(), Pfandbriefe);
		codesByName.put(EONIA.getCodeName().get(), EONIA);
		codesByName.put(EONIASwaps.getCodeName().get(), EONIASwaps);
		codesByName.put(EURODOLLAR.getCodeName().get(), EURODOLLAR);
		codesByName.put(EuroSwiss.getCodeName().get(), EuroSwiss);
		codesByName.put(TIBOR.getCodeName().get(), TIBOR);
		codesByName.put(ISDAFIX.getCodeName().get(), ISDAFIX);
		codesByName.put(GCFRepo.getCodeName().get(), GCFRepo);
		codesByName.put(STIBOR.getCodeName().get(), STIBOR);
		codesByName.put(BBSW.getCodeName().get(), BBSW);
		codesByName.put(JIBAR.getCodeName().get(), JIBAR);
		codesByName.put(BUBOR.getCodeName().get(), BUBOR);
		codesByName.put(CDOR.getCodeName().get(), CDOR);
		codesByName.put(CIBOR.getCodeName().get(), CIBOR);
		codesByName.put(MOSPRIM.getCodeName().get(), MOSPRIM);
		codesByName.put(NIBOR.getCodeName().get(), NIBOR);
		codesByName.put(PRIBOR.getCodeName().get(), PRIBOR);
		codesByName.put(TELBOR.getCodeName().get(), TELBOR);
		codesByName.put(WIBOR.getCodeName().get(), WIBOR);
	}

	public static BenchmarkCurveNameCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BenchmarkCurveNameCode[] values() {
		BenchmarkCurveNameCode[] values = new BenchmarkCurveNameCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BenchmarkCurveNameCode> {
		@Override
		public BenchmarkCurveNameCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BenchmarkCurveNameCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}