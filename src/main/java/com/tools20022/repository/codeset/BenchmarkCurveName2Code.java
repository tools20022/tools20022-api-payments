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
import com.tools20022.repository.codeset.BenchmarkCurveName2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a benchmark curve name.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#WIBOR
 * BenchmarkCurveName2Code.mmWIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#Treasury
 * BenchmarkCurveName2Code.mmTreasury}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#TIBOR
 * BenchmarkCurveName2Code.mmTIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#TELBOR
 * BenchmarkCurveName2Code.mmTELBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#SWAP
 * BenchmarkCurveName2Code.mmSWAP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#STIBOR
 * BenchmarkCurveName2Code.mmSTIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#PRIBOR
 * BenchmarkCurveName2Code.mmPRIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#Pfandbriefe
 * BenchmarkCurveName2Code.mmPfandbriefe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#NIBOR
 * BenchmarkCurveName2Code.mmNIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#MuniAAA
 * BenchmarkCurveName2Code.mmMuniAAA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#MOSPRIM
 * BenchmarkCurveName2Code.mmMOSPRIM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#LIBOR
 * BenchmarkCurveName2Code.mmLIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#LIBID
 * BenchmarkCurveName2Code.mmLIBID}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#JIBAR
 * BenchmarkCurveName2Code.mmJIBAR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#ISDAFIX
 * BenchmarkCurveName2Code.mmISDAFIX}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#GCFRepo
 * BenchmarkCurveName2Code.mmGCFRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#FutureSWAP
 * BenchmarkCurveName2Code.mmFutureSWAP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#EuroSwiss
 * BenchmarkCurveName2Code.mmEuroSwiss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#EURODOLLAR
 * BenchmarkCurveName2Code.mmEURODOLLAR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#Euribor
 * BenchmarkCurveName2Code.mmEuribor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#EONIASwaps
 * BenchmarkCurveName2Code.mmEONIASwaps}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#EONIA
 * BenchmarkCurveName2Code.mmEONIA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#CIBOR
 * BenchmarkCurveName2Code.mmCIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#CDOR
 * BenchmarkCurveName2Code.mmCDOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#BUBOR
 * BenchmarkCurveName2Code.mmBUBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code#BBSW
 * BenchmarkCurveName2Code.mmBBSW}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
 * BenchmarkCurveNameCode}</li>
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
 * "BenchmarkCurveName2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a benchmark curve name."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BenchmarkCurveName2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WIBOR"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code WIBOR = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WIBOR";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.WIBOR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Treasury"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code Treasury = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Treasury";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.Treasury.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TIBOR"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code TIBOR = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TIBOR";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.TIBOR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TELBOR"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code TELBOR = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TELBOR";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.TELBOR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SWAP"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code SWAP = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SWAP";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.SWAP.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "STIBOR"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code STIBOR = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "STIBOR";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.STIBOR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PRIBOR"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code PRIBOR = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PRIBOR";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.PRIBOR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pfandbriefe"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code Pfandbriefe = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pfandbriefe";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.Pfandbriefe.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NIBOR"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code NIBOR = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NIBOR";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.NIBOR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniAAA"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code MuniAAA = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniAAA";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.MuniAAA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MOSPRIM"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code MOSPRIM = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MOSPRIM";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.MOSPRIM.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LIBOR"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code LIBOR = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LIBOR";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.LIBOR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LIBID"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code LIBID = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LIBID";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.LIBID.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JIBAR"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code JIBAR = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JIBAR";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.JIBAR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISDAFIX"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code ISDAFIX = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISDAFIX";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.ISDAFIX.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GCFRepo"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code GCFRepo = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GCFRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.GCFRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureSWAP"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code FutureSWAP = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureSWAP";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.FutureSWAP.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EuroSwiss"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code EuroSwiss = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EuroSwiss";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.EuroSwiss.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EURODOLLAR"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code EURODOLLAR = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EURODOLLAR";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.EURODOLLAR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Euribor"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code Euribor = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Euribor";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.Euribor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EONIASwaps"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code EONIASwaps = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EONIASwaps";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.EONIASwaps.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EONIA"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code EONIA = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EONIA";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.EONIA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CIBOR"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code CIBOR = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CIBOR";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.CIBOR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CDOR"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code CDOR = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CDOR";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.CDOR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BUBOR"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code BUBOR = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BUBOR";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.BUBOR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BBSW"</li>
	 * </ul>
	 */
	public static final BenchmarkCurveName2Code BBSW = new BenchmarkCurveName2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BBSW";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName2Code.mmObject();
			codeName = BenchmarkCurveNameCode.BBSW.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BenchmarkCurveName2Code> codesByName = new LinkedHashMap<>();

	protected BenchmarkCurveName2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BenchmarkCurveName2Code";
				definition = "Specifies a benchmark curve name.";
				trace_lazy = () -> BenchmarkCurveNameCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BenchmarkCurveName2Code.WIBOR, com.tools20022.repository.codeset.BenchmarkCurveName2Code.Treasury,
						com.tools20022.repository.codeset.BenchmarkCurveName2Code.TIBOR, com.tools20022.repository.codeset.BenchmarkCurveName2Code.TELBOR, com.tools20022.repository.codeset.BenchmarkCurveName2Code.SWAP,
						com.tools20022.repository.codeset.BenchmarkCurveName2Code.STIBOR, com.tools20022.repository.codeset.BenchmarkCurveName2Code.PRIBOR, com.tools20022.repository.codeset.BenchmarkCurveName2Code.Pfandbriefe,
						com.tools20022.repository.codeset.BenchmarkCurveName2Code.NIBOR, com.tools20022.repository.codeset.BenchmarkCurveName2Code.MuniAAA, com.tools20022.repository.codeset.BenchmarkCurveName2Code.MOSPRIM,
						com.tools20022.repository.codeset.BenchmarkCurveName2Code.LIBOR, com.tools20022.repository.codeset.BenchmarkCurveName2Code.LIBID, com.tools20022.repository.codeset.BenchmarkCurveName2Code.JIBAR,
						com.tools20022.repository.codeset.BenchmarkCurveName2Code.ISDAFIX, com.tools20022.repository.codeset.BenchmarkCurveName2Code.GCFRepo, com.tools20022.repository.codeset.BenchmarkCurveName2Code.FutureSWAP,
						com.tools20022.repository.codeset.BenchmarkCurveName2Code.EuroSwiss, com.tools20022.repository.codeset.BenchmarkCurveName2Code.EURODOLLAR, com.tools20022.repository.codeset.BenchmarkCurveName2Code.Euribor,
						com.tools20022.repository.codeset.BenchmarkCurveName2Code.EONIASwaps, com.tools20022.repository.codeset.BenchmarkCurveName2Code.EONIA, com.tools20022.repository.codeset.BenchmarkCurveName2Code.CIBOR,
						com.tools20022.repository.codeset.BenchmarkCurveName2Code.CDOR, com.tools20022.repository.codeset.BenchmarkCurveName2Code.BUBOR, com.tools20022.repository.codeset.BenchmarkCurveName2Code.BBSW);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(WIBOR.getCodeName().get(), WIBOR);
		codesByName.put(Treasury.getCodeName().get(), Treasury);
		codesByName.put(TIBOR.getCodeName().get(), TIBOR);
		codesByName.put(TELBOR.getCodeName().get(), TELBOR);
		codesByName.put(SWAP.getCodeName().get(), SWAP);
		codesByName.put(STIBOR.getCodeName().get(), STIBOR);
		codesByName.put(PRIBOR.getCodeName().get(), PRIBOR);
		codesByName.put(Pfandbriefe.getCodeName().get(), Pfandbriefe);
		codesByName.put(NIBOR.getCodeName().get(), NIBOR);
		codesByName.put(MuniAAA.getCodeName().get(), MuniAAA);
		codesByName.put(MOSPRIM.getCodeName().get(), MOSPRIM);
		codesByName.put(LIBOR.getCodeName().get(), LIBOR);
		codesByName.put(LIBID.getCodeName().get(), LIBID);
		codesByName.put(JIBAR.getCodeName().get(), JIBAR);
		codesByName.put(ISDAFIX.getCodeName().get(), ISDAFIX);
		codesByName.put(GCFRepo.getCodeName().get(), GCFRepo);
		codesByName.put(FutureSWAP.getCodeName().get(), FutureSWAP);
		codesByName.put(EuroSwiss.getCodeName().get(), EuroSwiss);
		codesByName.put(EURODOLLAR.getCodeName().get(), EURODOLLAR);
		codesByName.put(Euribor.getCodeName().get(), Euribor);
		codesByName.put(EONIASwaps.getCodeName().get(), EONIASwaps);
		codesByName.put(EONIA.getCodeName().get(), EONIA);
		codesByName.put(CIBOR.getCodeName().get(), CIBOR);
		codesByName.put(CDOR.getCodeName().get(), CDOR);
		codesByName.put(BUBOR.getCodeName().get(), BUBOR);
		codesByName.put(BBSW.getCodeName().get(), BBSW);
	}

	public static BenchmarkCurveName2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BenchmarkCurveName2Code[] values() {
		BenchmarkCurveName2Code[] values = new BenchmarkCurveName2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BenchmarkCurveName2Code> {
		@Override
		public BenchmarkCurveName2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BenchmarkCurveName2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}