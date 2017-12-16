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
import com.tools20022.repository.codeset.TaxRecordPeriod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the period related to the tax payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#FirstMonth
 * TaxRecordPeriod1Code.mmFirstMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#SecondMonth
 * TaxRecordPeriod1Code.mmSecondMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#ThirdMonth
 * TaxRecordPeriod1Code.mmThirdMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#FourthMonth
 * TaxRecordPeriod1Code.mmFourthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#FifthMonth
 * TaxRecordPeriod1Code.mmFifthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#SixthMonth
 * TaxRecordPeriod1Code.mmSixthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#SeventhMonth
 * TaxRecordPeriod1Code.mmSeventhMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#EighthMonth
 * TaxRecordPeriod1Code.mmEighthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#NinthMonth
 * TaxRecordPeriod1Code.mmNinthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#TenthMonth
 * TaxRecordPeriod1Code.mmTenthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#EleventhMonth
 * TaxRecordPeriod1Code.mmEleventhMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#TwelfthMonth
 * TaxRecordPeriod1Code.mmTwelfthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#FirstQuarter
 * TaxRecordPeriod1Code.mmFirstQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#SecondQuarter
 * TaxRecordPeriod1Code.mmSecondQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#ThirdQuarter
 * TaxRecordPeriod1Code.mmThirdQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#FourthQuarter
 * TaxRecordPeriod1Code.mmFourthQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#FirstHalf
 * TaxRecordPeriod1Code.mmFirstHalf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#SecondHalf
 * TaxRecordPeriod1Code.mmSecondHalf}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
 * TaxRecordPeriodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MM01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxRecordPeriod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the period related to the tax payment."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxRecordPeriod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code FirstMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.FirstMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code SecondMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.SecondMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code ThirdMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.ThirdMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code FourthMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourthMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.FourthMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FifthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code FifthMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FifthMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.FifthMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SixthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code SixthMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SixthMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.SixthMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeventhMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code SeventhMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeventhMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.SeventhMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EighthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code EighthMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EighthMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.EighthMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NinthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code NinthMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NinthMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.NinthMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code TenthMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenthMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.TenthMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EleventhMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code EleventhMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EleventhMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.EleventhMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwelfthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code TwelfthMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwelfthMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.TwelfthMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstQuarter"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code FirstQuarter = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstQuarter";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.FirstQuarter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondQuarter"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code SecondQuarter = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondQuarter";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.SecondQuarter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdQuarter"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code ThirdQuarter = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdQuarter";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.ThirdQuarter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourthQuarter"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code FourthQuarter = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourthQuarter";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.FourthQuarter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstHalf"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code FirstHalf = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstHalf";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.FirstHalf.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondHalf"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code SecondHalf = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondHalf";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject();
			codeName = TaxRecordPeriodCode.SecondHalf.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxRecordPeriod1Code> codesByName = new LinkedHashMap<>();

	protected TaxRecordPeriod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MM01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxRecordPeriod1Code";
				definition = "Specifies the period related to the tax payment.";
				trace_lazy = () -> TaxRecordPeriodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxRecordPeriod1Code.FirstMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.SecondMonth,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.ThirdMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.FourthMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.FifthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.SixthMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.SeventhMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.EighthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.NinthMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.TenthMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.EleventhMonth,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.TwelfthMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.FirstQuarter, com.tools20022.repository.codeset.TaxRecordPeriod1Code.SecondQuarter,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.ThirdQuarter, com.tools20022.repository.codeset.TaxRecordPeriod1Code.FourthQuarter, com.tools20022.repository.codeset.TaxRecordPeriod1Code.FirstHalf,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.SecondHalf);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FirstMonth.getCodeName().get(), FirstMonth);
		codesByName.put(SecondMonth.getCodeName().get(), SecondMonth);
		codesByName.put(ThirdMonth.getCodeName().get(), ThirdMonth);
		codesByName.put(FourthMonth.getCodeName().get(), FourthMonth);
		codesByName.put(FifthMonth.getCodeName().get(), FifthMonth);
		codesByName.put(SixthMonth.getCodeName().get(), SixthMonth);
		codesByName.put(SeventhMonth.getCodeName().get(), SeventhMonth);
		codesByName.put(EighthMonth.getCodeName().get(), EighthMonth);
		codesByName.put(NinthMonth.getCodeName().get(), NinthMonth);
		codesByName.put(TenthMonth.getCodeName().get(), TenthMonth);
		codesByName.put(EleventhMonth.getCodeName().get(), EleventhMonth);
		codesByName.put(TwelfthMonth.getCodeName().get(), TwelfthMonth);
		codesByName.put(FirstQuarter.getCodeName().get(), FirstQuarter);
		codesByName.put(SecondQuarter.getCodeName().get(), SecondQuarter);
		codesByName.put(ThirdQuarter.getCodeName().get(), ThirdQuarter);
		codesByName.put(FourthQuarter.getCodeName().get(), FourthQuarter);
		codesByName.put(FirstHalf.getCodeName().get(), FirstHalf);
		codesByName.put(SecondHalf.getCodeName().get(), SecondHalf);
	}

	public static TaxRecordPeriod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxRecordPeriod1Code[] values() {
		TaxRecordPeriod1Code[] values = new TaxRecordPeriod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxRecordPeriod1Code> {
		@Override
		public TaxRecordPeriod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxRecordPeriod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}