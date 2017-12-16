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
import com.tools20022.repository.codeset.ExposureConventionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Determines how the variation margin requirement will be calculated, either
 * net or gross.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureConventionTypeCode#Gross
 * ExposureConventionTypeCode.mmGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureConventionTypeCode#Net
 * ExposureConventionTypeCode.mmNet}</li>
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
 * <li>"GROS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExposureConventionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Determines how the variation margin requirement will be calculated, either net or gross."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExposureConventionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the exposed amount to party A and B will be netted
	 * together for the variation margin calculation, and then two separate
	 * variation margin requirements will be determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureConventionTypeCode
	 * ExposureConventionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GROS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the exposed amount to party A and B will be netted together for the variation margin calculation, and then two separate variation margin requirements will be determined."
	 * </li>
	 * </ul>
	 */
	public static final ExposureConventionTypeCode Gross = new ExposureConventionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gross";
			definition = "Indicates that the exposed amount to party A and B will be netted together for the variation margin calculation, and then two separate variation margin requirements will be determined.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureConventionTypeCode.mmObject();
			codeName = "GROS";
		}
	};
	/**
	 * Indicates that the exposed amount to party A and B will be netted
	 * together for the variation margin calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureConventionTypeCode
	 * ExposureConventionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NET1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Net"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the exposed amount to party A and B will be netted together for the variation margin calculation."
	 * </li>
	 * </ul>
	 */
	public static final ExposureConventionTypeCode Net = new ExposureConventionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Net";
			definition = "Indicates that the exposed amount to party A and B will be netted together for the variation margin calculation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureConventionTypeCode.mmObject();
			codeName = "NET1";
		}
	};
	final static private LinkedHashMap<String, ExposureConventionTypeCode> codesByName = new LinkedHashMap<>();

	protected ExposureConventionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("GROS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExposureConventionTypeCode";
				definition = "Determines how the variation margin requirement will be calculated, either net or gross.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExposureConventionTypeCode.Gross, com.tools20022.repository.codeset.ExposureConventionTypeCode.Net);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Gross.getCodeName().get(), Gross);
		codesByName.put(Net.getCodeName().get(), Net);
	}

	public static ExposureConventionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExposureConventionTypeCode[] values() {
		ExposureConventionTypeCode[] values = new ExposureConventionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExposureConventionTypeCode> {
		@Override
		public ExposureConventionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExposureConventionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}