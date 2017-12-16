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
import com.tools20022.repository.codeset.WarrantStyleCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines how a warrant can be exercised.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.WarrantStyleCode#European
 * WarrantStyleCode.mmEuropean}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WarrantStyleCode#American
 * WarrantStyleCode.mmAmerican}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WarrantStyleCode#Bermudan
 * WarrantStyleCode.mmBermudan}</li>
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
 * <li>"EURO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "WarrantStyleCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines how a warrant can be exercised."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class WarrantStyleCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Option that can be exercised on expiry date only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WarrantStyleCode
	 * WarrantStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EURO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "European"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option that can be exercised on expiry date only."</li>
	 * </ul>
	 */
	public static final WarrantStyleCode European = new WarrantStyleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "European";
			definition = "Option that can be exercised on expiry date only.";
			owner_lazy = () -> com.tools20022.repository.codeset.WarrantStyleCode.mmObject();
			codeName = "EURO";
		}
	};
	/**
	 * Option can be exercised before or on expiry date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WarrantStyleCode
	 * WarrantStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "American"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option can be exercised before or on expiry date."</li>
	 * </ul>
	 */
	public static final WarrantStyleCode American = new WarrantStyleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "American";
			definition = "Option can be exercised before or on expiry date.";
			owner_lazy = () -> com.tools20022.repository.codeset.WarrantStyleCode.mmObject();
			codeName = "AMER";
		}
	};
	/**
	 * Option that can be exercised on multiple discrete dates prior to, or on
	 * expiry date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WarrantStyleCode
	 * WarrantStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BERM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bermudan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option that can be exercised on multiple discrete dates prior to, or on expiry date."
	 * </li>
	 * </ul>
	 */
	public static final WarrantStyleCode Bermudan = new WarrantStyleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bermudan";
			definition = "Option that can be exercised on multiple discrete dates prior to, or on expiry date.";
			owner_lazy = () -> com.tools20022.repository.codeset.WarrantStyleCode.mmObject();
			codeName = "BERM";
		}
	};
	final static private LinkedHashMap<String, WarrantStyleCode> codesByName = new LinkedHashMap<>();

	protected WarrantStyleCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("EURO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "WarrantStyleCode";
				definition = "Defines how a warrant can be exercised.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WarrantStyleCode.European, com.tools20022.repository.codeset.WarrantStyleCode.American, com.tools20022.repository.codeset.WarrantStyleCode.Bermudan);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(European.getCodeName().get(), European);
		codesByName.put(American.getCodeName().get(), American);
		codesByName.put(Bermudan.getCodeName().get(), Bermudan);
	}

	public static WarrantStyleCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static WarrantStyleCode[] values() {
		WarrantStyleCode[] values = new WarrantStyleCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, WarrantStyleCode> {
		@Override
		public WarrantStyleCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(WarrantStyleCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}