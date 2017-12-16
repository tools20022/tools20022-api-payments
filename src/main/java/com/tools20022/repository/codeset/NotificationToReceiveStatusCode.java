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
import com.tools20022.repository.codeset.NotificationToReceiveStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether or not the event as mentioned in the notification occurred.
 * Details of the event can be different from the details as per notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode#ReceivedButDifferent
 * NotificationToReceiveStatusCode.mmReceivedButDifferent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode#Received
 * NotificationToReceiveStatusCode.mmReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode#NotReceived
 * NotificationToReceiveStatusCode.mmNotReceived}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.NotificationStatus3Code
 * NotificationStatus3Code}</li>
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
 * <li>"RCBD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationToReceiveStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether or not the event as mentioned in the notification occurred. Details of the event can be different from the details as per notification."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NotificationToReceiveStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event(s) as described in the notification to receive occurred but details
	 * are different.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode
	 * NotificationToReceiveStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedButDifferent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event(s) as described in the notification to receive occurred but details are different."
	 * </li>
	 * </ul>
	 */
	public static final NotificationToReceiveStatusCode ReceivedButDifferent = new NotificationToReceiveStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedButDifferent";
			definition = "Event(s) as described in the notification to receive occurred but details are different.";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationToReceiveStatusCode.mmObject();
			codeName = "RCBD";
		}
	};
	/**
	 * Event(s) as described in the notification to receive occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode
	 * NotificationToReceiveStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCVD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event(s) as described in the notification to receive occurred."</li>
	 * </ul>
	 */
	public static final NotificationToReceiveStatusCode Received = new NotificationToReceiveStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Event(s) as described in the notification to receive occurred.";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationToReceiveStatusCode.mmObject();
			codeName = "RCVD";
		}
	};
	/**
	 * Event(s) as described in the notification to receive did not occur.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode
	 * NotificationToReceiveStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event(s) as described in the notification to receive did not occur."</li>
	 * </ul>
	 */
	public static final NotificationToReceiveStatusCode NotReceived = new NotificationToReceiveStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotReceived";
			definition = "Event(s) as described in the notification to receive did not occur.";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationToReceiveStatusCode.mmObject();
			codeName = "NRCD";
		}
	};
	final static private LinkedHashMap<String, NotificationToReceiveStatusCode> codesByName = new LinkedHashMap<>();

	protected NotificationToReceiveStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("RCBD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NotificationToReceiveStatusCode";
				definition = "Specifies whether or not the event as mentioned in the notification occurred. Details of the event can be different from the details as per notification.";
				derivation_lazy = () -> Arrays.asList(NotificationStatus3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NotificationToReceiveStatusCode.ReceivedButDifferent, com.tools20022.repository.codeset.NotificationToReceiveStatusCode.Received,
						com.tools20022.repository.codeset.NotificationToReceiveStatusCode.NotReceived);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReceivedButDifferent.getCodeName().get(), ReceivedButDifferent);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(NotReceived.getCodeName().get(), NotReceived);
	}

	public static NotificationToReceiveStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NotificationToReceiveStatusCode[] values() {
		NotificationToReceiveStatusCode[] values = new NotificationToReceiveStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NotificationToReceiveStatusCode> {
		@Override
		public NotificationToReceiveStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NotificationToReceiveStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}