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
import com.tools20022.repository.codeset.WaivingInstructionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the form of the rebate when commission is waived.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WaivingInstructionCode#WaiveInCash
 * WaivingInstructionCode.mmWaiveInCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WaivingInstructionCode#WaiveInUnits
 * WaivingInstructionCode.mmWaiveInUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WaivingInstructionCode#Other
 * WaivingInstructionCode.mmOther}</li>
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
 * <li>"WICA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "WaivingInstructionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the form of the rebate when commission is waived."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class WaivingInstructionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Form of commission waived is cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WaivingInstructionCode
	 * WaivingInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WICA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaiveInCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Form of commission waived is cash."</li>
	 * </ul>
	 */
	public static final WaivingInstructionCode WaiveInCash = new WaivingInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WaiveInCash";
			definition = "Form of commission waived is cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.WaivingInstructionCode.mmObject();
			codeName = "WICA";
		}
	};
	/**
	 * Form of commission waived is additional units of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WaivingInstructionCode
	 * WaivingInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WIUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaiveInUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form of commission waived is additional units of a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final WaivingInstructionCode WaiveInUnits = new WaivingInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WaiveInUnits";
			definition = "Form of commission waived is additional units of a financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.WaivingInstructionCode.mmObject();
			codeName = "WIUN";
		}
	};
	/**
	 * Another type of commission waiving.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WaivingInstructionCode
	 * WaivingInstructionCode}</li>
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
	 * definition} = "Another type of commission waiving."</li>
	 * </ul>
	 */
	public static final WaivingInstructionCode Other = new WaivingInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of commission waiving.";
			owner_lazy = () -> com.tools20022.repository.codeset.WaivingInstructionCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, WaivingInstructionCode> codesByName = new LinkedHashMap<>();

	protected WaivingInstructionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("WICA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "WaivingInstructionCode";
				definition = "Specifies the form of the rebate when commission is waived.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WaivingInstructionCode.WaiveInCash, com.tools20022.repository.codeset.WaivingInstructionCode.WaiveInUnits,
						com.tools20022.repository.codeset.WaivingInstructionCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(WaiveInCash.getCodeName().get(), WaiveInCash);
		codesByName.put(WaiveInUnits.getCodeName().get(), WaiveInUnits);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static WaivingInstructionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static WaivingInstructionCode[] values() {
		WaivingInstructionCode[] values = new WaivingInstructionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, WaivingInstructionCode> {
		@Override
		public WaivingInstructionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(WaivingInstructionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}