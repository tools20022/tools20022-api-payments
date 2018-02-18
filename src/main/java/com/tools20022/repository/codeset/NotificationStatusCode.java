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
import com.tools20022.repository.codeset.NotificationStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if the occurrence of the event contained in the notification is
 * confirmed or unconfirmed. Details of the event can be complete or incomplete.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationStatusCode#Complete
 * NotificationStatusCode.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationStatusCode#PreliminaryEventConfirmed
 * NotificationStatusCode.PreliminaryEventConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationStatusCode#PreliminaryEventUnconfirmed
 * NotificationStatusCode.PreliminaryEventUnconfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationStatusCode#EventConfirmed
 * NotificationStatusCode.EventConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationStatusCode#EventUnconfirmed
 * NotificationStatusCode.EventUnconfirmed}</li>
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
 * <li>"COMP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if the occurrence of the event contained in the notification is confirmed or unconfirmed. Details of the event can be complete or incomplete."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NotificationStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The notification contains all the details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationStatusCode
	 * NotificationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The notification contains all the details."</li>
	 * </ul>
	 */
	public static final NotificationStatusCode Complete = new NotificationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			definition = "The notification contains all the details.";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Notification may not contain complete details, however, the occurrence of
	 * the event has been confirmed by the issuer or other official source.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationStatusCode
	 * NotificationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreliminaryEventConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notification may not contain complete details, however, the occurrence of the event has been confirmed by the issuer or other official source."
	 * </li>
	 * </ul>
	 */
	public static final NotificationStatusCode PreliminaryEventConfirmed = new NotificationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreliminaryEventConfirmed";
			definition = "Notification may not contain complete details, however, the occurrence of the event has been confirmed by the issuer or other official source.";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationStatusCode.mmObject();
			codeName = "PREC";
		}
	};
	/**
	 * Notification may not contain complete details as the occurrence of the
	 * event has not been confirmed by the issuer or other official source at
	 * the time the notification was sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationStatusCode
	 * NotificationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreliminaryEventUnconfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notification may not contain complete details as the occurrence of the event has not been confirmed by the issuer or other official source at the time the notification was sent."
	 * </li>
	 * </ul>
	 */
	public static final NotificationStatusCode PreliminaryEventUnconfirmed = new NotificationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreliminaryEventUnconfirmed";
			definition = "Notification may not contain complete details as the occurrence of the event has not been confirmed by the issuer or other official source at the time the notification was sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationStatusCode.mmObject();
			codeName = "PREU";
		}
	};
	/**
	 * Notification may not contain complete details, however, the occurrence of
	 * the event has been confirmed by the issuer or other official source.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationStatusCode
	 * NotificationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notification may not contain complete details, however, the occurrence of the event has been confirmed by the issuer or other official source."
	 * </li>
	 * </ul>
	 */
	public static final NotificationStatusCode EventConfirmed = new NotificationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventConfirmed";
			definition = "Notification may not contain complete details, however, the occurrence of the event has been confirmed by the issuer or other official source.";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationStatusCode.mmObject();
			codeName = "ECON";
		}
	};
	/**
	 * The occurrence of the event has not been confirmed by the issuer or other
	 * official source at the time the notification was sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationStatusCode
	 * NotificationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUNC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventUnconfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The occurrence of the event has not been confirmed by the issuer or other official source at the time the notification was sent."
	 * </li>
	 * </ul>
	 */
	public static final NotificationStatusCode EventUnconfirmed = new NotificationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventUnconfirmed";
			definition = "The occurrence of the event has not been confirmed by the issuer or other official source at the time the notification was sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationStatusCode.mmObject();
			codeName = "EUNC";
		}
	};
	final static private LinkedHashMap<String, NotificationStatusCode> codesByName = new LinkedHashMap<>();

	protected NotificationStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NotificationStatusCode";
				definition = "Specifies if the occurrence of the event contained in the notification is confirmed or unconfirmed. Details of the event can be complete or incomplete.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NotificationStatusCode.Complete, com.tools20022.repository.codeset.NotificationStatusCode.PreliminaryEventConfirmed,
						com.tools20022.repository.codeset.NotificationStatusCode.PreliminaryEventUnconfirmed, com.tools20022.repository.codeset.NotificationStatusCode.EventConfirmed,
						com.tools20022.repository.codeset.NotificationStatusCode.EventUnconfirmed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Complete.getCodeName().get(), Complete);
		codesByName.put(PreliminaryEventConfirmed.getCodeName().get(), PreliminaryEventConfirmed);
		codesByName.put(PreliminaryEventUnconfirmed.getCodeName().get(), PreliminaryEventUnconfirmed);
		codesByName.put(EventConfirmed.getCodeName().get(), EventConfirmed);
		codesByName.put(EventUnconfirmed.getCodeName().get(), EventUnconfirmed);
	}

	public static NotificationStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NotificationStatusCode[] values() {
		NotificationStatusCode[] values = new NotificationStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NotificationStatusCode> {
		@Override
		public NotificationStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NotificationStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}