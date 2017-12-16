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
import com.tools20022.repository.codeset.OptionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates whether it is a Call option (right to purchase a specific
 * underlying asset) or a Put option (right to sell a specific underlying
 * asset).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionTypeCode#Call
 * OptionTypeCode.mmCall}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionTypeCode#Put
 * OptionTypeCode.mmPut}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OptionDefinitionTypeCode
 * OptionDefinitionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CALL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionTypeCode
	 * OptionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Call"</li>
	 * </ul>
	 */
	public static final OptionTypeCode Call = new OptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Call";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionTypeCode.mmObject();
			codeName = OptionDefinitionTypeCode.Call.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionTypeCode
	 * OptionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Put"</li>
	 * </ul>
	 */
	public static final OptionTypeCode Put = new OptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Put";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionTypeCode.mmObject();
			codeName = OptionDefinitionTypeCode.Put.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OptionTypeCode> codesByName = new LinkedHashMap<>();

	protected OptionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CALL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionTypeCode";
				definition = "Indicates whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset).";
				trace_lazy = () -> OptionDefinitionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionTypeCode.Call, com.tools20022.repository.codeset.OptionTypeCode.Put);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Call.getCodeName().get(), Call);
		codesByName.put(Put.getCodeName().get(), Put);
	}

	public static OptionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionTypeCode[] values() {
		OptionTypeCode[] values = new OptionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionTypeCode> {
		@Override
		public OptionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}