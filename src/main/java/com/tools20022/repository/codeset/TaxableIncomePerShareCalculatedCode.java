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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the fund calculates a taxable interest per share (TIS).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode#FundCalculates
 * TaxableIncomePerShareCalculatedCode.FundCalculates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode#FundDoesNotCalculate
 * TaxableIncomePerShareCalculatedCode.FundDoesNotCalculate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode#FundCalculatesUnknown
 * TaxableIncomePerShareCalculatedCode.FundCalculatesUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode#Other
 * TaxableIncomePerShareCalculatedCode.Other}</li>
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
public class TaxableIncomePerShareCalculatedCode {

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
	public static final MMCode FundCalculates = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundCalculates";
			definition = "Fund is calculating the taxable interest per share with the NAV.";
			owner_lazy = () -> TaxableIncomePerShareCalculatedCode.mmObject();
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
	public static final MMCode FundDoesNotCalculate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundDoesNotCalculate";
			definition = "Fund is not calculating the taxable interest per share with the NAV.";
			owner_lazy = () -> TaxableIncomePerShareCalculatedCode.mmObject();
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
	public static final MMCode FundCalculatesUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundCalculatesUnknown";
			definition = "Unknown whether the fund is calculating the taxable interest per share with the NAV.";
			owner_lazy = () -> TaxableIncomePerShareCalculatedCode.mmObject();
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
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of taxable income per share.";
			owner_lazy = () -> TaxableIncomePerShareCalculatedCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("TSIY");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxableIncomePerShareCalculatedCode";
				definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.FundCalculates, com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.FundDoesNotCalculate,
						com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.FundCalculatesUnknown, com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}