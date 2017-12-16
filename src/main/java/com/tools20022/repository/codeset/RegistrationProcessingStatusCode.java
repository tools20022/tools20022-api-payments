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
import com.tools20022.repository.codeset.RegistrationProcessingStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of the registration processing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegistrationProcessingStatusCode#AcknowledgedAccepted
 * RegistrationProcessingStatusCode.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegistrationProcessingStatusCode#Rejected
 * RegistrationProcessingStatusCode.mmRejected}</li>
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
 * <li>"PACK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RegistrationProcessingStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the registration processing."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RegistrationProcessingStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Registration has been acknowledged/accepted by the issuer/registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegistrationProcessingStatusCode
	 * RegistrationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Registration has been acknowledged/accepted by the issuer/registrar."</li>
	 * </ul>
	 */
	public static final RegistrationProcessingStatusCode AcknowledgedAccepted = new RegistrationProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Registration has been acknowledged/accepted by the issuer/registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegistrationProcessingStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Registration has been rejected by the issuer/registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegistrationProcessingStatusCode
	 * RegistrationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Registration has been rejected by the issuer/registrar."</li>
	 * </ul>
	 */
	public static final RegistrationProcessingStatusCode Rejected = new RegistrationProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Registration has been rejected by the issuer/registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegistrationProcessingStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	final static private LinkedHashMap<String, RegistrationProcessingStatusCode> codesByName = new LinkedHashMap<>();

	protected RegistrationProcessingStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PACK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegistrationProcessingStatusCode";
				definition = "Specifies the status of the registration processing.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RegistrationProcessingStatusCode.AcknowledgedAccepted, com.tools20022.repository.codeset.RegistrationProcessingStatusCode.Rejected);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcknowledgedAccepted.getCodeName().get(), AcknowledgedAccepted);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
	}

	public static RegistrationProcessingStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RegistrationProcessingStatusCode[] values() {
		RegistrationProcessingStatusCode[] values = new RegistrationProcessingStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RegistrationProcessingStatusCode> {
		@Override
		public RegistrationProcessingStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RegistrationProcessingStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}