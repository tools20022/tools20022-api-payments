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
import com.tools20022.repository.codeset.DividendPolicyCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the dividend policy of the financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendPolicyCode#DailyAccruingDividend
 * DividendPolicyCode.DailyAccruingDividend}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DividendPolicyCode#Cash
 * DividendPolicyCode.Cash}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DividendPolicyCode#Units
 * DividendPolicyCode.Units}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DividendPolicyCode#Both
 * DividendPolicyCode.Both}</li>
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
 * <li>"DACR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DividendPolicyCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the dividend policy of the financial instrument."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DividendPolicyCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dividend is paid daily and can be accrued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendPolicyCode
	 * DividendPolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DACR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DailyAccruingDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is paid daily and can be accrued."</li>
	 * </ul>
	 */
	public static final DividendPolicyCode DailyAccruingDividend = new DividendPolicyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DailyAccruingDividend";
			definition = "Dividend is paid daily and can be accrued.";
			owner_lazy = () -> com.tools20022.repository.codeset.DividendPolicyCode.mmObject();
			codeName = "DACR";
		}
	};
	/**
	 * Dividend is paid in cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendPolicyCode
	 * DividendPolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is paid in cash."</li>
	 * </ul>
	 */
	public static final DividendPolicyCode Cash = new DividendPolicyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Dividend is paid in cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.DividendPolicyCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Dividend is paid in units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendPolicyCode
	 * DividendPolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Units"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is paid in units."</li>
	 * </ul>
	 */
	public static final DividendPolicyCode Units = new DividendPolicyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Units";
			definition = "Dividend is paid in units.";
			owner_lazy = () -> com.tools20022.repository.codeset.DividendPolicyCode.mmObject();
			codeName = "UNIT";
		}
	};
	/**
	 * Dividend is paid in both Cash and Units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendPolicyCode
	 * DividendPolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Both"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is paid in both Cash and Units."</li>
	 * </ul>
	 */
	public static final DividendPolicyCode Both = new DividendPolicyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Both";
			definition = "Dividend is paid in both Cash and Units.";
			owner_lazy = () -> com.tools20022.repository.codeset.DividendPolicyCode.mmObject();
			codeName = "BOTH";
		}
	};
	final static private LinkedHashMap<String, DividendPolicyCode> codesByName = new LinkedHashMap<>();

	protected DividendPolicyCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DACR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DividendPolicyCode";
				definition = "Specifies the dividend policy of the financial instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DividendPolicyCode.DailyAccruingDividend, com.tools20022.repository.codeset.DividendPolicyCode.Cash,
						com.tools20022.repository.codeset.DividendPolicyCode.Units, com.tools20022.repository.codeset.DividendPolicyCode.Both);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DailyAccruingDividend.getCodeName().get(), DailyAccruingDividend);
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(Units.getCodeName().get(), Units);
		codesByName.put(Both.getCodeName().get(), Both);
	}

	public static DividendPolicyCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DividendPolicyCode[] values() {
		DividendPolicyCode[] values = new DividendPolicyCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DividendPolicyCode> {
		@Override
		public DividendPolicyCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DividendPolicyCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}