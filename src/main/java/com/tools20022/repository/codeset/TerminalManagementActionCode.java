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
 * TerminalManagementActionCode.Activate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Deactivate
 * TerminalManagementActionCode.Deactivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Delete
 * TerminalManagementActionCode.Delete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Download
 * TerminalManagementActionCode.Download}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Install
 * TerminalManagementActionCode.Install}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Restart
 * TerminalManagementActionCode.Restart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Upload
 * TerminalManagementActionCode.Upload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Update
 * TerminalManagementActionCode.Update}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Create
 * TerminalManagementActionCode.Create}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Bind
 * TerminalManagementActionCode.Bind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Unbind
 * TerminalManagementActionCode.Unbind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode#Rebind
 * TerminalManagementActionCode.Rebind}</li>
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
	 * Request to activate the element identified inside the message exchange.
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
	 * definition} =
	 * "Request to activate the element identified inside the message exchange."
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionCode Activate = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Activate";
			definition = "Request to activate the element identified inside the message exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * Request to deactivate the element identified inside the message exchange.
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
	 * definition} =
	 * "Request to deactivate the element identified inside the message exchange."
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionCode Deactivate = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deactivate";
			definition = "Request to deactivate the element identified inside the message exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
			codeName = "DCTV";
		}
	};
	/**
	 * Request to delete the element identified inside the message exchange.
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
	 * definition} =
	 * "Request to delete the element identified inside the message exchange."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionCode Delete = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Delete";
			definition = "Request to delete the element identified inside the message exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
			codeName = "DELT";
		}
	};
	/**
	 * Request to download the element identified inside the message exchange.
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
	 * definition} =
	 * "Request to download the element identified inside the message exchange."
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionCode Download = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Download";
			definition = "Request to download the element identified inside the message exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
			codeName = "DWNL";
		}
	};
	/**
	 * Request to install the element identified inside the message exchange.
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
	 * definition} =
	 * "Request to install the element identified inside the message exchange."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionCode Install = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Install";
			definition = "Request to install the element identified inside the message exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
			codeName = "INST";
		}
	};
	/**
	 * Request to restart the element identified inside the message exchange.
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
	 * definition} =
	 * "Request to restart the element identified inside the message exchange."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionCode Restart = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restart";
			definition = "Request to restart the element identified inside the message exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
			codeName = "RSTR";
		}
	};
	/**
	 * Request to upload the element identified inside the message exchange.
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
	 * definition} =
	 * "Request to upload the element identified inside the message exchange."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionCode Upload = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Upload";
			definition = "Request to upload the element identified inside the message exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
			codeName = "UPLD";
		}
	};
	/**
	 * Request to update the element identified inside the message exchange.
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
	 * definition} =
	 * "Request to update the element identified inside the message exchange."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionCode Update = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Update";
			definition = "Request to update the element identified inside the message exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
			codeName = "UPDT";
		}
	};
	/**
	 * Request to create or add the element identified inside the message
	 * exchange.
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
	 * definition} =
	 * "Request to create or add the element identified inside the message exchange."
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionCode Create = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Create";
			definition = "Request to create or add the element identified inside the message exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
			codeName = "CREA";
		}
	};
	/**
	 * Request sent to a POI to bind with a server.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
	 * TerminalManagementActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request sent to a POI to bind with a server."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionCode Bind = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bind";
			definition = "Request sent to a POI to bind with a server.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
			codeName = "BIND";
		}
	};
	/**
	 * Request sent to a POI to unbind with a server.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
	 * TerminalManagementActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UBND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unbind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request sent to a POI to unbind with a server."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionCode Unbind = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unbind";
			definition = "Request sent to a POI to unbind with a server.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
			codeName = "UBND";
		}
	};
	/**
	 * Request sent to a POI to rebind with a server.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
	 * TerminalManagementActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RBND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rebind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request sent to a POI to rebind with a server."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionCode Rebind = new TerminalManagementActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rebind";
			definition = "Request sent to a POI to rebind with a server.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionCode.mmObject();
			codeName = "RBND";
		}
	};
	final static private LinkedHashMap<String, TerminalManagementActionCode> codesByName = new LinkedHashMap<>();

	protected TerminalManagementActionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionCode";
				definition = "Types of terminal management action to be performed by a point of interaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementActionCode.Activate, com.tools20022.repository.codeset.TerminalManagementActionCode.Deactivate,
						com.tools20022.repository.codeset.TerminalManagementActionCode.Delete, com.tools20022.repository.codeset.TerminalManagementActionCode.Download, com.tools20022.repository.codeset.TerminalManagementActionCode.Install,
						com.tools20022.repository.codeset.TerminalManagementActionCode.Restart, com.tools20022.repository.codeset.TerminalManagementActionCode.Upload, com.tools20022.repository.codeset.TerminalManagementActionCode.Update,
						com.tools20022.repository.codeset.TerminalManagementActionCode.Create, com.tools20022.repository.codeset.TerminalManagementActionCode.Bind, com.tools20022.repository.codeset.TerminalManagementActionCode.Unbind,
						com.tools20022.repository.codeset.TerminalManagementActionCode.Rebind);
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
		codesByName.put(Bind.getCodeName().get(), Bind);
		codesByName.put(Unbind.getCodeName().get(), Unbind);
		codesByName.put(Rebind.getCodeName().get(), Rebind);
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