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
import com.tools20022.repository.codeset.EventConfirmationStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the status of the occurrence of an event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventConfirmationStatusCode#Confirmed
 * EventConfirmationStatusCode.mmConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventConfirmationStatusCode#Unconfirmed
 * EventConfirmationStatusCode.mmUnconfirmed}</li>
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
 * <li>"CONF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EventConfirmationStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the status of the occurrence of an event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EventConfirmationStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Occurrence of the event has been confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventConfirmationStatusCode
	 * EventConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Occurrence of the event has been confirmed."</li>
	 * </ul>
	 */
	public static final EventConfirmationStatusCode Confirmed = new EventConfirmationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Confirmed";
			definition = "Occurrence of the event has been confirmed.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventConfirmationStatusCode.mmObject();
			codeName = "CONF";
		}
	};
	/**
	 * Occurrence of the event has not been confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventConfirmationStatusCode
	 * EventConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unconfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Occurrence of the event has not been confirmed."</li>
	 * </ul>
	 */
	public static final EventConfirmationStatusCode Unconfirmed = new EventConfirmationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unconfirmed";
			definition = "Occurrence of the event has not been confirmed.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventConfirmationStatusCode.mmObject();
			codeName = "UCON";
		}
	};
	final static private LinkedHashMap<String, EventConfirmationStatusCode> codesByName = new LinkedHashMap<>();

	protected EventConfirmationStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CONF");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EventConfirmationStatusCode";
				definition = "Indicates the status of the occurrence of an event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventConfirmationStatusCode.Confirmed, com.tools20022.repository.codeset.EventConfirmationStatusCode.Unconfirmed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Confirmed.getCodeName().get(), Confirmed);
		codesByName.put(Unconfirmed.getCodeName().get(), Unconfirmed);
	}

	public static EventConfirmationStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EventConfirmationStatusCode[] values() {
		EventConfirmationStatusCode[] values = new EventConfirmationStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EventConfirmationStatusCode> {
		@Override
		public EventConfirmationStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EventConfirmationStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}