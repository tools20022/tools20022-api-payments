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
import com.tools20022.repository.codeset.ChoiceCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if the separation of the security is optional or mandatory.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ChoiceCode#Optional
 * ChoiceCode.mmOptional}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChoiceCode#Mandatory
 * ChoiceCode.mmMandatory}</li>
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
 * <li>"OPTI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChoiceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if the separation of the security is optional or mandatory."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChoiceCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Separation is optional.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChoiceCode ChoiceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Optional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Separation is optional."</li>
	 * </ul>
	 */
	public static final ChoiceCode Optional = new ChoiceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Optional";
			definition = "Separation is optional.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChoiceCode.mmObject();
			codeName = "OPTI";
		}
	};
	/**
	 * Separation is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChoiceCode ChoiceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandatory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Separation is mandatory."</li>
	 * </ul>
	 */
	public static final ChoiceCode Mandatory = new ChoiceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mandatory";
			definition = "Separation is mandatory.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChoiceCode.mmObject();
			codeName = "MAND";
		}
	};
	final static private LinkedHashMap<String, ChoiceCode> codesByName = new LinkedHashMap<>();

	protected ChoiceCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("OPTI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChoiceCode";
				definition = "Specifies if the separation of the security is optional or mandatory.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChoiceCode.Optional, com.tools20022.repository.codeset.ChoiceCode.Mandatory);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Optional.getCodeName().get(), Optional);
		codesByName.put(Mandatory.getCodeName().get(), Mandatory);
	}

	public static ChoiceCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChoiceCode[] values() {
		ChoiceCode[] values = new ChoiceCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChoiceCode> {
		@Override
		public ChoiceCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChoiceCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}