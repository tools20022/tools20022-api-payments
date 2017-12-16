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
import com.tools20022.repository.codeset.RepoCallRequestStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies additional information about the status of the repurchase agreement
 * call processed instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallRequestStatusCode#AcknowledgedAccepted
 * RepoCallRequestStatusCode.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallRequestStatusCode#Denied
 * RepoCallRequestStatusCode.mmDenied}</li>
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
 * <li>"CACK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepoCallRequestStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies additional information about the status of the repurchase agreement call processed instruction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RepoCallRequestStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Repurchase agreement call request is acknowledged/accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallRequestStatusCode
	 * RepoCallRequestStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase agreement call request is acknowledged/accepted."</li>
	 * </ul>
	 */
	public static final RepoCallRequestStatusCode AcknowledgedAccepted = new RepoCallRequestStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Repurchase agreement call request is acknowledged/accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallRequestStatusCode.mmObject();
			codeName = "CACK";
		}
	};
	/**
	 * Repuchase agreement call request is denied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallRequestStatusCode
	 * RepoCallRequestStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repuchase agreement call request is denied."</li>
	 * </ul>
	 */
	public static final RepoCallRequestStatusCode Denied = new RepoCallRequestStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Repuchase agreement call request is denied.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallRequestStatusCode.mmObject();
			codeName = "DEND";
		}
	};
	final static private LinkedHashMap<String, RepoCallRequestStatusCode> codesByName = new LinkedHashMap<>();

	protected RepoCallRequestStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CACK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RepoCallRequestStatusCode";
				definition = "Specifies additional information about the status of the repurchase agreement call processed instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepoCallRequestStatusCode.AcknowledgedAccepted, com.tools20022.repository.codeset.RepoCallRequestStatusCode.Denied);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcknowledgedAccepted.getCodeName().get(), AcknowledgedAccepted);
		codesByName.put(Denied.getCodeName().get(), Denied);
	}

	public static RepoCallRequestStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RepoCallRequestStatusCode[] values() {
		RepoCallRequestStatusCode[] values = new RepoCallRequestStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RepoCallRequestStatusCode> {
		@Override
		public RepoCallRequestStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RepoCallRequestStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}