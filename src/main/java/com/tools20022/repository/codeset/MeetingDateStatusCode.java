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
import com.tools20022.repository.codeset.MeetingDateStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the possible statuses of a meeting date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatusCode#Tentative
 * MeetingDateStatusCode.mmTentative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatusCode#Confirmed
 * MeetingDateStatusCode.mmConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatusCode#Cancelled
 * MeetingDateStatusCode.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatusCode#NoQuorum
 * MeetingDateStatusCode.mmNoQuorum}</li>
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
 * <li>"TNTA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingDateStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the possible statuses of a meeting date."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MeetingDateStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting date is tentative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatusCode
	 * MeetingDateStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TNTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tentative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting date is tentative."</li>
	 * </ul>
	 */
	public static final MeetingDateStatusCode Tentative = new MeetingDateStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tentative";
			definition = "Meeting date is tentative.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingDateStatusCode.mmObject();
			codeName = "TNTA";
		}
	};
	/**
	 * Meeting date is confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatusCode
	 * MeetingDateStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting date is confirmed."</li>
	 * </ul>
	 */
	public static final MeetingDateStatusCode Confirmed = new MeetingDateStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmed";
			definition = "Meeting date is confirmed.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingDateStatusCode.mmObject();
			codeName = "CNFR";
		}
	};
	/**
	 * Meeting date has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatusCode
	 * MeetingDateStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting date has been cancelled."</li>
	 * </ul>
	 */
	public static final MeetingDateStatusCode Cancelled = new MeetingDateStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Meeting date has been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingDateStatusCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Meeting could not take place as the quorum was not reached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatusCode
	 * MeetingDateStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOQO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoQuorum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting could not take place as the quorum was not reached."</li>
	 * </ul>
	 */
	public static final MeetingDateStatusCode NoQuorum = new MeetingDateStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoQuorum";
			definition = "Meeting could not take place as the quorum was not reached.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingDateStatusCode.mmObject();
			codeName = "NOQO";
		}
	};
	final static private LinkedHashMap<String, MeetingDateStatusCode> codesByName = new LinkedHashMap<>();

	protected MeetingDateStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("TNTA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingDateStatusCode";
				definition = "Identifies the possible statuses of a meeting date.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingDateStatusCode.Tentative, com.tools20022.repository.codeset.MeetingDateStatusCode.Confirmed,
						com.tools20022.repository.codeset.MeetingDateStatusCode.Cancelled, com.tools20022.repository.codeset.MeetingDateStatusCode.NoQuorum);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Tentative.getCodeName().get(), Tentative);
		codesByName.put(Confirmed.getCodeName().get(), Confirmed);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(NoQuorum.getCodeName().get(), NoQuorum);
	}

	public static MeetingDateStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MeetingDateStatusCode[] values() {
		MeetingDateStatusCode[] values = new MeetingDateStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MeetingDateStatusCode> {
		@Override
		public MeetingDateStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MeetingDateStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}