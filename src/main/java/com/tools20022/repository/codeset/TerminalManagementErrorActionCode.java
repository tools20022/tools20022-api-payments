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
import com.tools20022.repository.codeset.TerminalManagementErrorActionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Action to perform in case of error during the action in progress.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode#IgnoreError
 * TerminalManagementErrorActionCode.mmIgnoreError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode#SendStatusReport
 * TerminalManagementErrorActionCode.mmSendStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode#StopSequence
 * TerminalManagementErrorActionCode.mmStopSequence}</li>
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
 * <li>"IGNR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementErrorActionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Action to perform in case of error during the action in progress."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementErrorActionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Ignore the error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode
	 * TerminalManagementErrorActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IGNR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IgnoreError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ignore the error."</li>
	 * </ul>
	 */
	public static final TerminalManagementErrorActionCode IgnoreError = new TerminalManagementErrorActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IgnoreError";
			definition = "Ignore the error.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementErrorActionCode.mmObject();
			codeName = "IGNR";
		}
	};
	/**
	 * Send a status report immediately.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode
	 * TerminalManagementErrorActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDSR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendStatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Send a status report immediately."</li>
	 * </ul>
	 */
	public static final TerminalManagementErrorActionCode SendStatusReport = new TerminalManagementErrorActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SendStatusReport";
			definition = "Send a status report immediately.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementErrorActionCode.mmObject();
			codeName = "SDSR";
		}
	};
	/**
	 * Stop the current sequence of terminal management actions without any
	 * action, and do not notice the error with a status report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode
	 * TerminalManagementErrorActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Stop the current sequence of terminal management actions without any action, and do not notice the error with a status report."
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementErrorActionCode StopSequence = new TerminalManagementErrorActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StopSequence";
			definition = "Stop the current sequence of terminal management actions without any action, and do not notice the error with a status report.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementErrorActionCode.mmObject();
			codeName = "STOP";
		}
	};
	final static private LinkedHashMap<String, TerminalManagementErrorActionCode> codesByName = new LinkedHashMap<>();

	protected TerminalManagementErrorActionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("IGNR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementErrorActionCode";
				definition = "Action to perform in case of error during the action in progress.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementErrorActionCode.IgnoreError, com.tools20022.repository.codeset.TerminalManagementErrorActionCode.SendStatusReport,
						com.tools20022.repository.codeset.TerminalManagementErrorActionCode.StopSequence);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IgnoreError.getCodeName().get(), IgnoreError);
		codesByName.put(SendStatusReport.getCodeName().get(), SendStatusReport);
		codesByName.put(StopSequence.getCodeName().get(), StopSequence);
	}

	public static TerminalManagementErrorActionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementErrorActionCode[] values() {
		TerminalManagementErrorActionCode[] values = new TerminalManagementErrorActionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementErrorActionCode> {
		@Override
		public TerminalManagementErrorActionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementErrorActionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}