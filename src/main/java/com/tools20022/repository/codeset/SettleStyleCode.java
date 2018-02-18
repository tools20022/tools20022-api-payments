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
import com.tools20022.repository.codeset.SettleStyleCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies when the option contract settles.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettleStyleCode#SettleOnOpen
 * SettleStyleCode.SettleOnOpen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettleStyleCode#SettleOnClose
 * SettleStyleCode.SettleOnClose}</li>
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
 * <li>"SETO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettleStyleCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies when the option contract settles."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettleStyleCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement is only allowed on the opening of the future contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettleStyleCode
	 * SettleStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettleOnOpen"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement is only allowed on the opening of the future contract."</li>
	 * </ul>
	 */
	public static final SettleStyleCode SettleOnOpen = new SettleStyleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettleOnOpen";
			definition = "Settlement is only allowed on the opening of the future contract.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettleStyleCode.mmObject();
			codeName = "SETO";
		}
	};
	/**
	 * Settlement is only allowed on the closing of the future contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettleStyleCode
	 * SettleStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettleOnClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement is only allowed on the closing of the future contract."</li>
	 * </ul>
	 */
	public static final SettleStyleCode SettleOnClose = new SettleStyleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettleOnClose";
			definition = "Settlement is only allowed on the closing of the future contract.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettleStyleCode.mmObject();
			codeName = "SETC";
		}
	};
	final static private LinkedHashMap<String, SettleStyleCode> codesByName = new LinkedHashMap<>();

	protected SettleStyleCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SETO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettleStyleCode";
				definition = "Specifies when the option contract settles.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettleStyleCode.SettleOnOpen, com.tools20022.repository.codeset.SettleStyleCode.SettleOnClose);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SettleOnOpen.getCodeName().get(), SettleOnOpen);
		codesByName.put(SettleOnClose.getCodeName().get(), SettleOnClose);
	}

	public static SettleStyleCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettleStyleCode[] values() {
		SettleStyleCode[] values = new SettleStyleCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettleStyleCode> {
		@Override
		public SettleStyleCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettleStyleCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}