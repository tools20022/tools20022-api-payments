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
import com.tools20022.repository.codeset.RequestStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the coded status of invoice financing request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RequestStatusCode#Financed
 * RequestStatusCode.mmFinanced}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RequestStatusCode#Pending
 * RequestStatusCode.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestStatusCode#NotFinanced
 * RequestStatusCode.mmNotFinanced}</li>
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
 * <li>"FNCD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the coded status of invoice financing request."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RequestStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Single Invoice/Instalment financing request has been financed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestStatusCode
	 * RequestStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FNCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Financed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Single Invoice/Instalment financing request has been financed."</li>
	 * </ul>
	 */
	public static final RequestStatusCode Financed = new RequestStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Financed";
			definition = "Single Invoice/Instalment financing request has been financed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestStatusCode.mmObject();
			codeName = "FNCD";
		}
	};
	/**
	 * Single Invoice/Instalment financing request is in a pending status and
	 * more checks are ongoing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestStatusCode
	 * RequestStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Single Invoice/Instalment financing request is in a pending status and more checks are ongoing."
	 * </li>
	 * </ul>
	 */
	public static final RequestStatusCode Pending = new RequestStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Single Invoice/Instalment financing request is in a pending status and more checks are ongoing.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestStatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Single Invoice/Instalment financing request has not been financed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestStatusCode
	 * RequestStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NTFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotFinanced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Single Invoice/Instalment financing request has not been financed."</li>
	 * </ul>
	 */
	public static final RequestStatusCode NotFinanced = new RequestStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotFinanced";
			definition = "Single Invoice/Instalment financing request has not been financed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestStatusCode.mmObject();
			codeName = "NTFD";
		}
	};
	final static private LinkedHashMap<String, RequestStatusCode> codesByName = new LinkedHashMap<>();

	protected RequestStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FNCD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestStatusCode";
				definition = "Specifies the coded status of invoice financing request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RequestStatusCode.Financed, com.tools20022.repository.codeset.RequestStatusCode.Pending, com.tools20022.repository.codeset.RequestStatusCode.NotFinanced);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Financed.getCodeName().get(), Financed);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(NotFinanced.getCodeName().get(), NotFinanced);
	}

	public static RequestStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RequestStatusCode[] values() {
		RequestStatusCode[] values = new RequestStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RequestStatusCode> {
		@Override
		public RequestStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RequestStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}