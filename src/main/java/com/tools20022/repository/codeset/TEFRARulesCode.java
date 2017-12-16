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
import com.tools20022.repository.codeset.TEFRARulesCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the Tax Equity and Fiscal Responsibility Act (TEFRA) rule levied by
 * the Internal Revenue Service under which the security is issued.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TEFRARulesCode#C
 * TEFRARulesCode.mmC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TEFRARulesCode#D
 * TEFRARulesCode.mmD}</li>
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
 * <li>"RULC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TEFRARulesCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the Tax Equity and Fiscal Responsibility Act (TEFRA) rule levied by the Internal Revenue Service under which the security is issued."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TEFRARulesCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the security is issued under the TEFRA rule C.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TEFRARulesCode
	 * TEFRARulesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RULC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "C"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the security is issued under the TEFRA rule C."</li>
	 * </ul>
	 */
	public static final TEFRARulesCode C = new TEFRARulesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "C";
			definition = "Indicates that the security is issued under the TEFRA rule C.";
			owner_lazy = () -> com.tools20022.repository.codeset.TEFRARulesCode.mmObject();
			codeName = "RULC";
		}
	};
	/**
	 * Indicates that the security is issued under the TEFRA rule D.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TEFRARulesCode
	 * TEFRARulesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RULD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "D"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the security is issued under the TEFRA rule D."</li>
	 * </ul>
	 */
	public static final TEFRARulesCode D = new TEFRARulesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "D";
			definition = "Indicates that the security is issued under the TEFRA rule D.";
			owner_lazy = () -> com.tools20022.repository.codeset.TEFRARulesCode.mmObject();
			codeName = "RULD";
		}
	};
	final static private LinkedHashMap<String, TEFRARulesCode> codesByName = new LinkedHashMap<>();

	protected TEFRARulesCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("RULC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TEFRARulesCode";
				definition = "Indicates the Tax Equity and Fiscal Responsibility Act (TEFRA) rule levied by the Internal Revenue Service under which the security is issued.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TEFRARulesCode.C, com.tools20022.repository.codeset.TEFRARulesCode.D);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(C.getCodeName().get(), C);
		codesByName.put(D.getCodeName().get(), D);
	}

	public static TEFRARulesCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TEFRARulesCode[] values() {
		TEFRARulesCode[] values = new TEFRARulesCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TEFRARulesCode> {
		@Override
		public TEFRARulesCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TEFRARulesCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}