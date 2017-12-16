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
import com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Additional process to perform before starting or after completing a terminal
 * management action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode#ManualConfirmation
 * TerminalManagementAdditionalProcessCode.mmManualConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode#Reconciliation
 * TerminalManagementAdditionalProcessCode.mmReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode#RestartSystem
 * TerminalManagementAdditionalProcessCode.mmRestartSystem}</li>
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
 * <li>"MANC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementAdditionalProcessCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional process to perform before starting or after completing a terminal management action."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementAdditionalProcessCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Manual confirmation of the merchant before the terminal management
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode
	 * TerminalManagementAdditionalProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Manual confirmation of the merchant before the terminal management action."
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementAdditionalProcessCode ManualConfirmation = new TerminalManagementAdditionalProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManualConfirmation";
			definition = "Manual confirmation of the merchant before the terminal management action.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode.mmObject();
			codeName = "MANC";
		}
	};
	/**
	 * Acquirer reconciliation to be performed before the terminal management
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode
	 * TerminalManagementAdditionalProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCNC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer reconciliation to be performed before the terminal management action."
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementAdditionalProcessCode Reconciliation = new TerminalManagementAdditionalProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Acquirer reconciliation to be performed before the terminal management action.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode.mmObject();
			codeName = "RCNC";
		}
	};
	/**
	 * Restart the system after performing the terminal management action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode
	 * TerminalManagementAdditionalProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestartSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restart the system after performing the terminal management action."</li>
	 * </ul>
	 */
	public static final TerminalManagementAdditionalProcessCode RestartSystem = new TerminalManagementAdditionalProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RestartSystem";
			definition = "Restart the system after performing the terminal management action.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode.mmObject();
			codeName = "RSRT";
		}
	};
	final static private LinkedHashMap<String, TerminalManagementAdditionalProcessCode> codesByName = new LinkedHashMap<>();

	protected TerminalManagementAdditionalProcessCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MANC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAdditionalProcessCode";
				definition = "Additional process to perform before starting or after completing a terminal management action.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode.ManualConfirmation, com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode.Reconciliation,
						com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode.RestartSystem);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ManualConfirmation.getCodeName().get(), ManualConfirmation);
		codesByName.put(Reconciliation.getCodeName().get(), Reconciliation);
		codesByName.put(RestartSystem.getCodeName().get(), RestartSystem);
	}

	public static TerminalManagementAdditionalProcessCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementAdditionalProcessCode[] values() {
		TerminalManagementAdditionalProcessCode[] values = new TerminalManagementAdditionalProcessCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementAdditionalProcessCode> {
		@Override
		public TerminalManagementAdditionalProcessCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementAdditionalProcessCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}