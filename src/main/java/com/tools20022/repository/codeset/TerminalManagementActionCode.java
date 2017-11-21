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
 * Types of terminal management action to be performed by a point of
 * interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#mmActivate
 * TerminalManagementActionCode.mmActivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#mmDeactivate
 * TerminalManagementActionCode.mmDeactivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#mmDelete
 * TerminalManagementActionCode.mmDelete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#mmDownload
 * TerminalManagementActionCode.mmDownload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#mmInstall
 * TerminalManagementActionCode.mmInstall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#mmRestart
 * TerminalManagementActionCode.mmRestart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#mmUpload
 * TerminalManagementActionCode.mmUpload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#mmUpdate
 * TerminalManagementActionCode.mmUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#mmCreate
 * TerminalManagementActionCode.mmCreate}</li>
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
 * <li>"ACTV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementActionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Types of terminal management action to be performed by a point of interaction."
 * </li>
 * </ul>
 */
public class TerminalManagementActionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Data set must be activated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
	 * TerminalManagementActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Activate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set must be activated."</li>
	 * </ul>
	 */
	public static final MMCode mmActivate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Activate";
			definition = "Data set must be activated.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * Data set must be deactivated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
	 * TerminalManagementActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set must be deactivated."</li>
	 * </ul>
	 */
	public static final MMCode mmDeactivate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deactivate";
			definition = "Data set must be deactivated.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "DCTV";
		}
	};
	/**
	 * Data set must be deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
	 * TerminalManagementActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set must be deleted."</li>
	 * </ul>
	 */
	public static final MMCode mmDelete = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Delete";
			definition = "Data set must be deleted.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "DELT";
		}
	};
	/**
	 * Data set must be downloaded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
	 * TerminalManagementActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DWNL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Download"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set must be downloaded."</li>
	 * </ul>
	 */
	public static final MMCode mmDownload = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Download";
			definition = "Data set must be downloaded.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "DWNL";
		}
	};
	/**
	 * Data set must be installed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
	 * TerminalManagementActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Install"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set must be installed."</li>
	 * </ul>
	 */
	public static final MMCode mmInstall = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Install";
			definition = "Data set must be installed.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "INST";
		}
	};
	/**
	 * Point of interaction must be restarted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
	 * TerminalManagementActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Point of interaction must be restarted."</li>
	 * </ul>
	 */
	public static final MMCode mmRestart = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restart";
			definition = "Point of interaction must be restarted.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "RSTR";
		}
	};
	/**
	 * Data set must be uploaded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
	 * TerminalManagementActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UPLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Upload"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set must be uploaded."</li>
	 * </ul>
	 */
	public static final MMCode mmUpload = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Upload";
			definition = "Data set must be uploaded.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "UPLD";
		}
	};
	/**
	 * Update, or replacement of the data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
	 * TerminalManagementActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UPDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Update"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Update, or replacement of the data set."</li>
	 * </ul>
	 */
	public static final MMCode mmUpdate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Update";
			definition = "Update, or replacement of the data set.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "UPDT";
		}
	};
	/**
	 * Creation or addition of a new data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
	 * TerminalManagementActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Create"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creation or addition of a new data set."</li>
	 * </ul>
	 */
	public static final MMCode mmCreate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Create";
			definition = "Creation or addition of a new data set.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "CREA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionCode";
				definition = "Types of terminal management action to be performed by a point of interaction.";
				code_lazy = () -> Arrays.asList(TerminalManagementActionCode.mmActivate, TerminalManagementActionCode.mmDeactivate, TerminalManagementActionCode.mmDelete, TerminalManagementActionCode.mmDownload,
						TerminalManagementActionCode.mmInstall, TerminalManagementActionCode.mmRestart, TerminalManagementActionCode.mmUpload, TerminalManagementActionCode.mmUpdate, TerminalManagementActionCode.mmCreate);
			}
		});
		return mmObject_lazy.get();
	}
}