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
import com.tools20022.repository.codeset.ProxyTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of proxy person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ProxyTypeCode#Chairman
 * ProxyTypeCode.mmChairman}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProxyTypeCode#Discretionary
 * ProxyTypeCode.mmDiscretionary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProxyTypeCode#SecurityHolder
 * ProxyTypeCode.mmSecurityHolder}</li>
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
 * <li>"CHRM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProxyTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of proxy person."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProxyTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Chairman of the meeting is the proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyTypeCode
	 * ProxyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHRM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Chairman"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Chairman of the meeting is the proxy."</li>
	 * </ul>
	 */
	public static final ProxyTypeCode Chairman = new ProxyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Chairman";
			definition = "Chairman of the meeting is the proxy.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProxyTypeCode.mmObject();
			codeName = "CHRM";
		}
	};
	/**
	 * Any type of proxy is allowed
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyTypeCode
	 * ProxyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discretionary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Any type of proxy is allowed"</li>
	 * </ul>
	 */
	public static final ProxyTypeCode Discretionary = new ProxyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Discretionary";
			definition = "Any type of proxy is allowed";
			owner_lazy = () -> com.tools20022.repository.codeset.ProxyTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Proxy can only be a security holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyTypeCode
	 * ProxyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HLDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proxy can only be a security holder."</li>
	 * </ul>
	 */
	public static final ProxyTypeCode SecurityHolder = new ProxyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityHolder";
			definition = "Proxy can only be a security holder.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProxyTypeCode.mmObject();
			codeName = "HLDR";
		}
	};
	final static private LinkedHashMap<String, ProxyTypeCode> codesByName = new LinkedHashMap<>();

	protected ProxyTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CHRM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProxyTypeCode";
				definition = "Specifies the type of proxy person.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProxyTypeCode.Chairman, com.tools20022.repository.codeset.ProxyTypeCode.Discretionary, com.tools20022.repository.codeset.ProxyTypeCode.SecurityHolder);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Chairman.getCodeName().get(), Chairman);
		codesByName.put(Discretionary.getCodeName().get(), Discretionary);
		codesByName.put(SecurityHolder.getCodeName().get(), SecurityHolder);
	}

	public static ProxyTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProxyTypeCode[] values() {
		ProxyTypeCode[] values = new ProxyTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProxyTypeCode> {
		@Override
		public ProxyTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProxyTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}