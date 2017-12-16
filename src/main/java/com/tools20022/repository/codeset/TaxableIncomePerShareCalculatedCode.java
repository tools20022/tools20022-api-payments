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
import com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the fund calculates a taxable interest per share (TIS).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode#FundCalculates
 * TaxableIncomePerShareCalculatedCode.mmFundCalculates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode#FundDoesNotCalculate
 * TaxableIncomePerShareCalculatedCode.mmFundDoesNotCalculate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode#FundCalculatesUnknown
 * TaxableIncomePerShareCalculatedCode.mmFundCalculatesUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode#Other
 * TaxableIncomePerShareCalculatedCode.mmOther}</li>
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
 * <li>"TSIY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxableIncomePerShareCalculatedCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the fund calculates a taxable interest per share (TIS)."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxableIncomePerShareCalculatedCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Fund is calculating the taxable interest per share with the NAV.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode
	 * TaxableIncomePerShareCalculatedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TSIY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCalculates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fund is calculating the taxable interest per share with the NAV."</li>
	 * </ul>
	 */
	public static final TaxableIncomePerShareCalculatedCode FundCalculates = new TaxableIncomePerShareCalculatedCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundCalculates";
			definition = "Fund is calculating the taxable interest per share with the NAV.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.mmObject();
			codeName = "TSIY";
		}
	};
	/**
	 * Fund is not calculating the taxable interest per share with the NAV.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode
	 * TaxableIncomePerShareCalculatedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TSIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDoesNotCalculate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fund is not calculating the taxable interest per share with the NAV."</li>
	 * </ul>
	 */
	public static final TaxableIncomePerShareCalculatedCode FundDoesNotCalculate = new TaxableIncomePerShareCalculatedCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundDoesNotCalculate";
			definition = "Fund is not calculating the taxable interest per share with the NAV.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.mmObject();
			codeName = "TSIN";
		}
	};
	/**
	 * Unknown whether the fund is calculating the taxable interest per share
	 * with the NAV.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode
	 * TaxableIncomePerShareCalculatedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCalculatesUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unknown whether the fund is calculating the taxable interest per share with the NAV."
	 * </li>
	 * </ul>
	 */
	public static final TaxableIncomePerShareCalculatedCode FundCalculatesUnknown = new TaxableIncomePerShareCalculatedCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundCalculatesUnknown";
			definition = "Unknown whether the fund is calculating the taxable interest per share with the NAV.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Another type of taxable income per share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode
	 * TaxableIncomePerShareCalculatedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Another type of taxable income per share."</li>
	 * </ul>
	 */
	public static final TaxableIncomePerShareCalculatedCode Other = new TaxableIncomePerShareCalculatedCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of taxable income per share.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, TaxableIncomePerShareCalculatedCode> codesByName = new LinkedHashMap<>();

	protected TaxableIncomePerShareCalculatedCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("TSIY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxableIncomePerShareCalculatedCode";
				definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.FundCalculates, com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.FundDoesNotCalculate,
						com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.FundCalculatesUnknown, com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FundCalculates.getCodeName().get(), FundCalculates);
		codesByName.put(FundDoesNotCalculate.getCodeName().get(), FundDoesNotCalculate);
		codesByName.put(FundCalculatesUnknown.getCodeName().get(), FundCalculatesUnknown);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static TaxableIncomePerShareCalculatedCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxableIncomePerShareCalculatedCode[] values() {
		TaxableIncomePerShareCalculatedCode[] values = new TaxableIncomePerShareCalculatedCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxableIncomePerShareCalculatedCode> {
		@Override
		public TaxableIncomePerShareCalculatedCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxableIncomePerShareCalculatedCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}