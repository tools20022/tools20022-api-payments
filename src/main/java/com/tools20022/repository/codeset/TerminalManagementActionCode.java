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
import com.tools20022.repository.codeset.TerminalManagementActionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Types of terminal management action to be performed by a point of
 * interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Activate
 * TerminalManagementActionCode.mmActivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Deactivate
 * TerminalManagementActionCode.mmDeactivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Delete
 * TerminalManagementActionCode.mmDelete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Download
 * TerminalManagementActionCode.mmDownload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Install
 * TerminalManagementActionCode.mmInstall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Restart
 * TerminalManagementActionCode.mmRestart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Upload
 * TerminalManagementActionCode.mmUpload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Update
 * TerminalManagementActionCode.mmUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Create
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementActionCode extends MMCode {

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
	public static final TerminalManagementActionCode Activate = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Activate";
			definition = "Data set must be activated.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
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
	public static final TerminalManagementActionCode Deactivate = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deactivate";
			definition = "Data set must be deactivated.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
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
	public static final TerminalManagementActionCode Delete = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Delete";
			definition = "Data set must be deleted.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
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
	public static final TerminalManagementActionCode Download = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Download";
			definition = "Data set must be downloaded.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
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
	public static final TerminalManagementActionCode Install = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Install";
			definition = "Data set must be installed.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
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
	public static final TerminalManagementActionCode Restart = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restart";
			definition = "Point of interaction must be restarted.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
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
	public static final TerminalManagementActionCode Upload = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Upload";
			definition = "Data set must be uploaded.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
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
	public static final TerminalManagementActionCode Update = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Update";
			definition = "Update, or replacement of the data set.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
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
	public static final TerminalManagementActionCode Create = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Create";
			definition = "Creation or addition of a new data set.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
			codeName = "CREA";
		}
	};
	final static private LinkedHashMap<String, TerminalManagementActionCode> codesByName = new LinkedHashMap<>();

	protected TerminalManagementActionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionCode";
				definition = "Types of terminal management action to be performed by a point of interaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementActionCode.Activate, com.tools20022.repository.codeset.TerminalManagementActionCode.Deactivate,
						com.tools20022.repository.codeset.TerminalManagementActionCode.Delete, com.tools20022.repository.codeset.TerminalManagementActionCode.Download, com.tools20022.repository.codeset.TerminalManagementActionCode.Install,
						com.tools20022.repository.codeset.TerminalManagementActionCode.Restart, com.tools20022.repository.codeset.TerminalManagementActionCode.Upload, com.tools20022.repository.codeset.TerminalManagementActionCode.Update,
						com.tools20022.repository.codeset.TerminalManagementActionCode.Create);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Activate.getCodeName().get(), Activate);
		codesByName.put(Deactivate.getCodeName().get(), Deactivate);
		codesByName.put(Delete.getCodeName().get(), Delete);
		codesByName.put(Download.getCodeName().get(), Download);
		codesByName.put(Install.getCodeName().get(), Install);
		codesByName.put(Restart.getCodeName().get(), Restart);
		codesByName.put(Upload.getCodeName().get(), Upload);
		codesByName.put(Update.getCodeName().get(), Update);
		codesByName.put(Create.getCodeName().get(), Create);
	}

	public static TerminalManagementActionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementActionCode[] values() {
		TerminalManagementActionCode[] values = new TerminalManagementActionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementActionCode> {
		@Override
		public TerminalManagementActionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementActionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}