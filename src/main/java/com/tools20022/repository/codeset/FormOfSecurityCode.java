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
import com.tools20022.repository.codeset.FormOfSecurityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the form of the security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FormOfSecurityCode#Registered
 * FormOfSecurityCode.Registered}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FormOfSecurityCode#Bearer
 * FormOfSecurityCode.Bearer}</li>
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
 * <li>"REGD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FormOfSecurityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the form of the security."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FormOfSecurityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Shareholder name of the financial instrument appears in the
	 * corporation/funds books.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FormOfSecurityCode
	 * FormOfSecurityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Shareholder name of the financial instrument appears in the corporation/funds books."
	 * </li>
	 * </ul>
	 */
	public static final FormOfSecurityCode Registered = new FormOfSecurityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Registered";
			definition = "Shareholder name of the financial instrument appears in the corporation/funds books.";
			owner_lazy = () -> com.tools20022.repository.codeset.FormOfSecurityCode.mmObject();
			codeName = "REGD";
		}
	};
	/**
	 * The financial instrument does not specify any registration of ownership,
	 * and is payable to whomever possesses the certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FormOfSecurityCode
	 * FormOfSecurityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The financial instrument does not specify any registration of ownership, and is payable to whomever possesses the certificate."
	 * </li>
	 * </ul>
	 */
	public static final FormOfSecurityCode Bearer = new FormOfSecurityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bearer";
			definition = "The financial instrument does not specify any registration of ownership, and is payable to whomever possesses the certificate.";
			owner_lazy = () -> com.tools20022.repository.codeset.FormOfSecurityCode.mmObject();
			codeName = "BEAR";
		}
	};
	final static private LinkedHashMap<String, FormOfSecurityCode> codesByName = new LinkedHashMap<>();

	protected FormOfSecurityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("REGD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FormOfSecurityCode";
				definition = "Specifies the form of the security.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FormOfSecurityCode.Registered, com.tools20022.repository.codeset.FormOfSecurityCode.Bearer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Registered.getCodeName().get(), Registered);
		codesByName.put(Bearer.getCodeName().get(), Bearer);
	}

	public static FormOfSecurityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FormOfSecurityCode[] values() {
		FormOfSecurityCode[] values = new FormOfSecurityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FormOfSecurityCode> {
		@Override
		public FormOfSecurityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FormOfSecurityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}