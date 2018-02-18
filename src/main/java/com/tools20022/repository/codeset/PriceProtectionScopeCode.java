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
import com.tools20022.repository.codeset.PriceProtectionScopeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the type of price protection the customer requires on their order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScopeCode#Local
 * PriceProtectionScopeCode.Local}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScopeCode#National
 * PriceProtectionScopeCode.National}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScopeCode#Global
 * PriceProtectionScopeCode.Global}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScopeCode#NationalExcludingLocal
 * PriceProtectionScopeCode.NationalExcludingLocal}</li>
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
 * <li>"LOCA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceProtectionScopeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the type of price protection the customer requires on their order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PriceProtectionScopeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price protection is local (for example, Exchange, ECN, ATS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScopeCode
	 * PriceProtectionScopeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Local"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price protection is local (for example, Exchange, ECN, ATS)."</li>
	 * </ul>
	 */
	public static final PriceProtectionScopeCode Local = new PriceProtectionScopeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Local";
			definition = "Price protection is local (for example, Exchange, ECN, ATS).";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceProtectionScopeCode.mmObject();
			codeName = "LOCA";
		}
	};
	/**
	 * Price protection is national (across all national markets).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScopeCode
	 * PriceProtectionScopeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NATI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "National"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price protection is national (across all national markets)."</li>
	 * </ul>
	 */
	public static final PriceProtectionScopeCode National = new PriceProtectionScopeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "National";
			definition = "Price protection is national (across all national markets).";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceProtectionScopeCode.mmObject();
			codeName = "NATI";
		}
	};
	/**
	 * Price protection is global (across all markets).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScopeCode
	 * PriceProtectionScopeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GLOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Global"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price protection is global (across all markets)."</li>
	 * </ul>
	 */
	public static final PriceProtectionScopeCode Global = new PriceProtectionScopeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Global";
			definition = "Price protection is global (across all markets).";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceProtectionScopeCode.mmObject();
			codeName = "GLOB";
		}
	};
	/**
	 * Price protection is national (across all national markets) excluding
	 * local price protection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScopeCode
	 * PriceProtectionScopeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAEL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalExcludingLocal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price protection is national (across all national markets) excluding local price protection."
	 * </li>
	 * </ul>
	 */
	public static final PriceProtectionScopeCode NationalExcludingLocal = new PriceProtectionScopeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalExcludingLocal";
			definition = "Price protection is national (across all national markets) excluding local price protection.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceProtectionScopeCode.mmObject();
			codeName = "NAEL";
		}
	};
	final static private LinkedHashMap<String, PriceProtectionScopeCode> codesByName = new LinkedHashMap<>();

	protected PriceProtectionScopeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LOCA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceProtectionScopeCode";
				definition = "Defines the type of price protection the customer requires on their order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceProtectionScopeCode.Local, com.tools20022.repository.codeset.PriceProtectionScopeCode.National,
						com.tools20022.repository.codeset.PriceProtectionScopeCode.Global, com.tools20022.repository.codeset.PriceProtectionScopeCode.NationalExcludingLocal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Local.getCodeName().get(), Local);
		codesByName.put(National.getCodeName().get(), National);
		codesByName.put(Global.getCodeName().get(), Global);
		codesByName.put(NationalExcludingLocal.getCodeName().get(), NationalExcludingLocal);
	}

	public static PriceProtectionScopeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PriceProtectionScopeCode[] values() {
		PriceProtectionScopeCode[] values = new PriceProtectionScopeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PriceProtectionScopeCode> {
		@Override
		public PriceProtectionScopeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PriceProtectionScopeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}