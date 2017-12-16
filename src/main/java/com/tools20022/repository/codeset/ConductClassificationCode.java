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
import com.tools20022.repository.codeset.ConductClassificationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the classification of the conduct.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConductClassificationCode#Standard
 * ConductClassificationCode.mmStandard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConductClassificationCode#NonStandard
 * ConductClassificationCode.mmNonStandard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConductClassificationCode#Reluctant
 * ConductClassificationCode.mmReluctant}</li>
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
 * <li>"STAN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConductClassificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the classification of the conduct."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ConductClassificationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Standard.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConductClassificationCode
	 * ConductClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standard."</li>
	 * </ul>
	 */
	public static final ConductClassificationCode Standard = new ConductClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standard";
			definition = "Standard.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConductClassificationCode.mmObject();
			codeName = "STAN";
		}
	};
	/**
	 * Non standard or unusual.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConductClassificationCode
	 * ConductClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Non standard or unusual."</li>
	 * </ul>
	 */
	public static final ConductClassificationCode NonStandard = new ConductClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandard";
			definition = "Non standard or unusual.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConductClassificationCode.mmObject();
			codeName = "NSTA";
		}
	};
	/**
	 * Reluctant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConductClassificationCode
	 * ConductClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reluctant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reluctant."</li>
	 * </ul>
	 */
	public static final ConductClassificationCode Reluctant = new ConductClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reluctant";
			definition = "Reluctant.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConductClassificationCode.mmObject();
			codeName = "RCLT";
		}
	};
	final static private LinkedHashMap<String, ConductClassificationCode> codesByName = new LinkedHashMap<>();

	protected ConductClassificationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("STAN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConductClassificationCode";
				definition = "Specifies the classification of the conduct.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConductClassificationCode.Standard, com.tools20022.repository.codeset.ConductClassificationCode.NonStandard,
						com.tools20022.repository.codeset.ConductClassificationCode.Reluctant);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Standard.getCodeName().get(), Standard);
		codesByName.put(NonStandard.getCodeName().get(), NonStandard);
		codesByName.put(Reluctant.getCodeName().get(), Reluctant);
	}

	public static ConductClassificationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ConductClassificationCode[] values() {
		ConductClassificationCode[] values = new ConductClassificationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ConductClassificationCode> {
		@Override
		public ConductClassificationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ConductClassificationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}