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
import com.tools20022.repository.codeset.TaxRecordPeriodCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#FirstMonth
 * TaxRecordPeriodCode.mmFirstMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#SecondMonth
 * TaxRecordPeriodCode.mmSecondMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#ThirdMonth
 * TaxRecordPeriodCode.mmThirdMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#FourthMonth
 * TaxRecordPeriodCode.mmFourthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#FifthMonth
 * TaxRecordPeriodCode.mmFifthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#SixthMonth
 * TaxRecordPeriodCode.mmSixthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#SeventhMonth
 * TaxRecordPeriodCode.mmSeventhMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#EighthMonth
 * TaxRecordPeriodCode.mmEighthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#NinthMonth
 * TaxRecordPeriodCode.mmNinthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#TenthMonth
 * TaxRecordPeriodCode.mmTenthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#EleventhMonth
 * TaxRecordPeriodCode.mmEleventhMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#TwelfthMonth
 * TaxRecordPeriodCode.mmTwelfthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#FirstQuarter
 * TaxRecordPeriodCode.mmFirstQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#SecondQuarter
 * TaxRecordPeriodCode.mmSecondQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#ThirdQuarter
 * TaxRecordPeriodCode.mmThirdQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#FourthQuarter
 * TaxRecordPeriodCode.mmFourthQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#FirstHalf
 * TaxRecordPeriodCode.mmFirstHalf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#SecondHalf
 * TaxRecordPeriodCode.mmSecondHalf}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
 * TaxRecordPeriod1Code}</li>
 * </ul>
 * </li>
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
 * "TaxRecordPeriodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the period related to the tax payment."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxRecordPeriodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax is related to the second month of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the second month of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode FirstMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstMonth";
			definition = "Tax is related to the second month of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "MM01";
		}
	};
	/**
	 * Tax is related to the first month of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the first month of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode SecondMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecondMonth";
			definition = "Tax is related to the first month of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "MM02";
		}
	};
	/**
	 * Tax is related to the third month of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the third month of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode ThirdMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ThirdMonth";
			definition = "Tax is related to the third month of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "MM03";
		}
	};
	/**
	 * Tax is related to the fourth month of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourthMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the fourth month of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode FourthMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FourthMonth";
			definition = "Tax is related to the fourth month of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "MM04";
		}
	};
	/**
	 * Tax is related to the fifth month of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FifthMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the fifth month of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode FifthMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FifthMonth";
			definition = "Tax is related to the fifth month of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "MM05";
		}
	};
	/**
	 * Tax is related to the sixth month of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SixthMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the sixth month of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode SixthMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SixthMonth";
			definition = "Tax is related to the sixth month of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "MM06";
		}
	};
	/**
	 * Tax is related to the seventh month of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM07"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeventhMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the seventh month of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode SeventhMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SeventhMonth";
			definition = "Tax is related to the seventh month of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "MM07";
		}
	};
	/**
	 * Tax is related to the eighth month of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM08"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EighthMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the eighth month of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode EighthMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EighthMonth";
			definition = "Tax is related to the eighth month of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "MM08";
		}
	};
	/**
	 * Tax is related to the ninth month of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM09"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NinthMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the ninth month of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode NinthMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NinthMonth";
			definition = "Tax is related to the ninth month of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "MM09";
		}
	};
	/**
	 * Tax is related to the tenth month of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM10"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenthMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the tenth month of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode TenthMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TenthMonth";
			definition = "Tax is related to the tenth month of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "MM10";
		}
	};
	/**
	 * Tax is related to the eleventh month of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM11"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EleventhMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the eleventh month of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode EleventhMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EleventhMonth";
			definition = "Tax is related to the eleventh month of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "MM11";
		}
	};
	/**
	 * Tax is related to the twelfth month of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM12"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwelfthMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the twelfth month of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode TwelfthMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TwelfthMonth";
			definition = "Tax is related to the twelfth month of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "MM12";
		}
	};
	/**
	 * Tax is related to the first quarter of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QTR1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstQuarter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the first quarter of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode FirstQuarter = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstQuarter";
			definition = "Tax is related to the first quarter of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "QTR1";
		}
	};
	/**
	 * Tax is related to the second quarter of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QTR2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondQuarter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the second quarter of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode SecondQuarter = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecondQuarter";
			definition = "Tax is related to the second quarter of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "QTR2";
		}
	};
	/**
	 * Tax is related to the third quarter of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QTR3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdQuarter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the third quarter of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode ThirdQuarter = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ThirdQuarter";
			definition = "Tax is related to the third quarter of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "QTR3";
		}
	};
	/**
	 * Tax is related to the forth quarter of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QTR4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourthQuarter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the forth quarter of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode FourthQuarter = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FourthQuarter";
			definition = "Tax is related to the forth quarter of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "QTR4";
		}
	};
	/**
	 * Tax is related to the first half of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HLF1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstHalf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the first half of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode FirstHalf = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstHalf";
			definition = "Tax is related to the first half of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "HLF1";
		}
	};
	/**
	 * Tax is related to the second half of the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HLF2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondHalf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is related to the second half of the period."</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode SecondHalf = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecondHalf";
			definition = "Tax is related to the second half of the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject();
			codeName = "HLF2";
		}
	};
	final static private LinkedHashMap<String, TaxRecordPeriodCode> codesByName = new LinkedHashMap<>();

	protected TaxRecordPeriodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MM01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxRecordPeriodCode";
				definition = "Specifies the period related to the tax payment.";
				derivation_lazy = () -> Arrays.asList(TaxRecordPeriod1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxRecordPeriodCode.FirstMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.SecondMonth,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.ThirdMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.FourthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.FifthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.SixthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.SeventhMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.EighthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.NinthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.TenthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.EleventhMonth,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.TwelfthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.FirstQuarter, com.tools20022.repository.codeset.TaxRecordPeriodCode.SecondQuarter,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.ThirdQuarter, com.tools20022.repository.codeset.TaxRecordPeriodCode.FourthQuarter, com.tools20022.repository.codeset.TaxRecordPeriodCode.FirstHalf,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.SecondHalf);
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

	public static TaxRecordPeriodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxRecordPeriodCode[] values() {
		TaxRecordPeriodCode[] values = new TaxRecordPeriodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxRecordPeriodCode> {
		@Override
		public TaxRecordPeriodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxRecordPeriodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}