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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additional process to perform before starting or after completing a terminal
 * management action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode#mmManualConfirmation
 * TerminalManagementAdditionalProcessCode.mmManualConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode#mmReconciliation
 * TerminalManagementAdditionalProcessCode.mmReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode#mmRestartSystem
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
public class TerminalManagementAdditionalProcessCode {

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
	public static final MMCode mmManualConfirmation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManualConfirmation";
			definition = "Manual confirmation of the merchant before the terminal management action.";
			owner_lazy = () -> TerminalManagementAdditionalProcessCode.mmObject();
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
	public static final MMCode mmReconciliation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Acquirer reconciliation to be performed before the terminal management action.";
			owner_lazy = () -> TerminalManagementAdditionalProcessCode.mmObject();
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
	public static final MMCode mmRestartSystem = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RestartSystem";
			definition = "Restart the system after performing the terminal management action.";
			owner_lazy = () -> TerminalManagementAdditionalProcessCode.mmObject();
			codeName = "RSRT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MANC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAdditionalProcessCode";
				definition = "Additional process to perform before starting or after completing a terminal management action.";
				code_lazy = () -> Arrays.asList(TerminalManagementAdditionalProcessCode.mmManualConfirmation, TerminalManagementAdditionalProcessCode.mmReconciliation, TerminalManagementAdditionalProcessCode.mmRestartSystem);
			}
		});
		return mmObject_lazy.get();
	}
}