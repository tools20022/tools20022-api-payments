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
import com.tools20022.repository.codeset.NotificationStatus3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of the notification in a coded form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationStatus3Code#ReceivedButDifferent
 * NotificationStatus3Code.mmReceivedButDifferent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationStatus3Code#Received
 * NotificationStatus3Code.mmReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationStatus3Code#NotReceived
 * NotificationStatus3Code.mmNotReceived}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode
 * NotificationToReceiveStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RCBD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationStatus3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the notification in a coded form."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NotificationStatus3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationStatus3Code
	 * NotificationStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedButDifferent"</li>
	 * </ul>
	 */
	public static final NotificationStatus3Code ReceivedButDifferent = new NotificationStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedButDifferent";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationStatus3Code.mmObject();
			codeName = NotificationToReceiveStatusCode.ReceivedButDifferent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationStatus3Code
	 * NotificationStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * </ul>
	 */
	public static final NotificationStatus3Code Received = new NotificationStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationStatus3Code.mmObject();
			codeName = NotificationToReceiveStatusCode.Received.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationStatus3Code
	 * NotificationStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReceived"</li>
	 * </ul>
	 */
	public static final NotificationStatus3Code NotReceived = new NotificationStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotReceived";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationStatus3Code.mmObject();
			codeName = NotificationToReceiveStatusCode.NotReceived.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NotificationStatus3Code> codesByName = new LinkedHashMap<>();

	protected NotificationStatus3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("RCBD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NotificationStatus3Code";
				definition = "Specifies the status of the notification in a coded form.";
				trace_lazy = () -> NotificationToReceiveStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NotificationStatus3Code.ReceivedButDifferent, com.tools20022.repository.codeset.NotificationStatus3Code.Received,
						com.tools20022.repository.codeset.NotificationStatus3Code.NotReceived);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReceivedButDifferent.getCodeName().get(), ReceivedButDifferent);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(NotReceived.getCodeName().get(), NotReceived);
	}

	public static NotificationStatus3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NotificationStatus3Code[] values() {
		NotificationStatus3Code[] values = new NotificationStatus3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NotificationStatus3Code> {
		@Override
		public NotificationStatus3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NotificationStatus3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}