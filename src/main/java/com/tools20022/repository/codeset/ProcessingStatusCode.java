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
import com.tools20022.repository.codeset.ProcessingStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the processing status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingStatusCode#Complete
 * ProcessingStatusCode.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingStatusCode#PreliminaryConfirmed
 * ProcessingStatusCode.PreliminaryConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingStatusCode#PreliminaryUnconfirmed
 * ProcessingStatusCode.PreliminaryUnconfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingStatusCode#ForInformationOnly
 * ProcessingStatusCode.ForInformationOnly}</li>
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
 * "ProcessingStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the processing status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProcessingStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Message contains complete details of the corporate action event at the
	 * time the event is communicated and the occurrence of the event has been
	 * confirmed by the account servicer's chosen official source. Further
	 * updates to the event are still possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingStatusCode
	 * ProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message contains complete details of the corporate action event at the time the event is communicated and the occurrence of the event has been confirmed by the account servicer's chosen official source. Further updates to the event are still possible."
	 * </li>
	 * </ul>
	 */
	public static final ProcessingStatusCode Complete = new ProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Complete";
			definition = "Message contains complete details of the corporate action event at the time the event is communicated and the occurrence of the event has been confirmed by the account servicer's chosen official source. Further updates to the event are still possible.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Message may not contain complete details of the corporate action event,
	 * however, the occurrence of the event is confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingStatusCode
	 * ProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreliminaryConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message may not contain complete details of the corporate action event,\nhowever, the occurrence of the event is confirmed."
	 * </li>
	 * </ul>
	 */
	public static final ProcessingStatusCode PreliminaryConfirmed = new ProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreliminaryConfirmed";
			definition = "Message may not contain complete details of the corporate action event,\nhowever, the occurrence of the event is confirmed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingStatusCode.mmObject();
			codeName = "PREC";
		}
	};
	/**
	 * Message may not contain complete details of the corporate action event
	 * and the occurrence of the event is not yet confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingStatusCode
	 * ProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreliminaryUnconfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message may not contain complete details of the corporate action event and\nthe occurrence of the event is not yet confirmed."
	 * </li>
	 * </ul>
	 */
	public static final ProcessingStatusCode PreliminaryUnconfirmed = new ProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreliminaryUnconfirmed";
			definition = "Message may not contain complete details of the corporate action event and\nthe occurrence of the event is not yet confirmed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingStatusCode.mmObject();
			codeName = "PREU";
		}
	};
	/**
	 * The message is for information only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingStatusCode
	 * ProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForInformationOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The message is for information only."</li>
	 * </ul>
	 */
	public static final ProcessingStatusCode ForInformationOnly = new ProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForInformationOnly";
			definition = "The message is for information only.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingStatusCode.mmObject();
			codeName = "INFO";
		}
	};
	final static private LinkedHashMap<String, ProcessingStatusCode> codesByName = new LinkedHashMap<>();

	protected ProcessingStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingStatusCode";
				definition = "Specifies the processing status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProcessingStatusCode.Complete, com.tools20022.repository.codeset.ProcessingStatusCode.PreliminaryConfirmed,
						com.tools20022.repository.codeset.ProcessingStatusCode.PreliminaryUnconfirmed, com.tools20022.repository.codeset.ProcessingStatusCode.ForInformationOnly);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Complete.getCodeName().get(), Complete);
		codesByName.put(PreliminaryConfirmed.getCodeName().get(), PreliminaryConfirmed);
		codesByName.put(PreliminaryUnconfirmed.getCodeName().get(), PreliminaryUnconfirmed);
		codesByName.put(ForInformationOnly.getCodeName().get(), ForInformationOnly);
	}

	public static ProcessingStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProcessingStatusCode[] values() {
		ProcessingStatusCode[] values = new ProcessingStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProcessingStatusCode> {
		@Override
		public ProcessingStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProcessingStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}