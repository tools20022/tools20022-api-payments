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
import com.tools20022.repository.codeset.OptionDefinitionTypeCode.InternalXmlAdapter;
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
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionDefinitionTypeCode#Call
 * OptionDefinitionTypeCode.mmCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionDefinitionTypeCode#Put
 * OptionDefinitionTypeCode.mmPut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionDefinitionTypeCode#Other
 * OptionDefinitionTypeCode.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionTypeCode
 * OptionTypeCode}</li>
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
 * <li>"CALL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionDefinitionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionDefinitionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Right to buy a quantity of an asset for an agreed price at exercise date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionDefinitionTypeCode
	 * OptionDefinitionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Call"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Right to buy a quantity of an asset for an agreed price at exercise date."
	 * </li>
	 * </ul>
	 */
	public static final OptionDefinitionTypeCode Call = new OptionDefinitionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Call";
			definition = "Right to buy a quantity of an asset for an agreed price at exercise date.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionDefinitionTypeCode.mmObject();
			codeName = "CALL";
		}
	};
	/**
	 * Right to sell a quantity of an asset for an agreed price at exercise
	 * date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionDefinitionTypeCode
	 * OptionDefinitionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Put"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Right to sell a quantity of an asset for an agreed price at exercise date."
	 * </li>
	 * </ul>
	 */
	public static final OptionDefinitionTypeCode Put = new OptionDefinitionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Put";
			definition = "Right to sell a quantity of an asset for an agreed price at exercise date.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionDefinitionTypeCode.mmObject();
			codeName = "PUTO";
		}
	};
	/**
	 * Right where the holder of the option decides whether the option is put or
	 * call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionDefinitionTypeCode
	 * OptionDefinitionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Right where the holder of the option decides whether the option is put or call."
	 * </li>
	 * </ul>
	 */
	public static final OptionDefinitionTypeCode Other = new OptionDefinitionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Right where the holder of the option decides whether the option is put or call.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionDefinitionTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, OptionDefinitionTypeCode> codesByName = new LinkedHashMap<>();

	protected OptionDefinitionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CALL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionDefinitionTypeCode";
				definition = "Indicates whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset).";
				derivation_lazy = () -> Arrays.asList(OptionTypeCode.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionDefinitionTypeCode.Call, com.tools20022.repository.codeset.OptionDefinitionTypeCode.Put,
						com.tools20022.repository.codeset.OptionDefinitionTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Call.getCodeName().get(), Call);
		codesByName.put(Put.getCodeName().get(), Put);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static OptionDefinitionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionDefinitionTypeCode[] values() {
		OptionDefinitionTypeCode[] values = new OptionDefinitionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionDefinitionTypeCode> {
		@Override
		public OptionDefinitionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionDefinitionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}