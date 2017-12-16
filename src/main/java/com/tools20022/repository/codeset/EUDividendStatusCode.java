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
import com.tools20022.repository.codeset.EUDividendStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the dividend is in the scope of the European directive on
 * taxation of savings income in the form of interest payments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUDividendStatusCode#DividendInScope
 * EUDividendStatusCode.mmDividendInScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUDividendStatusCode#DividendOutScope
 * EUDividendStatusCode.mmDividendOutScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUDividendStatusCode#DividendUnknown
 * EUDividendStatusCode.mmDividendUnknown}</li>
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
 * <li>"DIVI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EUDividendStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the dividend is in the scope of the European directive on taxation of savings income in the form of interest payments."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EUDividendStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dividend is in the scope of the directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUDividendStatusCode
	 * EUDividendStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendInScope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is in the scope of the directive."</li>
	 * </ul>
	 */
	public static final EUDividendStatusCode DividendInScope = new EUDividendStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendInScope";
			definition = "Dividend is in the scope of the directive.";
			owner_lazy = () -> com.tools20022.repository.codeset.EUDividendStatusCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Dividend is out of the scope of the directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUDividendStatusCode
	 * EUDividendStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOutScope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is out of the scope of the directive."</li>
	 * </ul>
	 */
	public static final EUDividendStatusCode DividendOutScope = new EUDividendStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendOutScope";
			definition = "Dividend is out of the scope of the directive.";
			owner_lazy = () -> com.tools20022.repository.codeset.EUDividendStatusCode.mmObject();
			codeName = "DIVO";
		}
	};
	/**
	 * Unknown whether the dividend is in or out of the scope of the directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUDividendStatusCode
	 * EUDividendStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unknown whether the dividend is in or out of the scope of the directive."
	 * </li>
	 * </ul>
	 */
	public static final EUDividendStatusCode DividendUnknown = new EUDividendStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendUnknown";
			definition = "Unknown whether the dividend is in or out of the scope of the directive.";
			owner_lazy = () -> com.tools20022.repository.codeset.EUDividendStatusCode.mmObject();
			codeName = "UKWN";
		}
	};
	final static private LinkedHashMap<String, EUDividendStatusCode> codesByName = new LinkedHashMap<>();

	protected EUDividendStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DIVI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EUDividendStatusCode";
				definition = "Specifies whether the dividend is in the scope of the European directive on taxation of savings income in the form of interest payments.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EUDividendStatusCode.DividendInScope, com.tools20022.repository.codeset.EUDividendStatusCode.DividendOutScope,
						com.tools20022.repository.codeset.EUDividendStatusCode.DividendUnknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DividendInScope.getCodeName().get(), DividendInScope);
		codesByName.put(DividendOutScope.getCodeName().get(), DividendOutScope);
		codesByName.put(DividendUnknown.getCodeName().get(), DividendUnknown);
	}

	public static EUDividendStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EUDividendStatusCode[] values() {
		EUDividendStatusCode[] values = new EUDividendStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EUDividendStatusCode> {
		@Override
		public EUDividendStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EUDividendStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}