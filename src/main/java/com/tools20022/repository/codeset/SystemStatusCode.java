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
import com.tools20022.repository.codeset.SystemStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SystemStatusCode#Suspended
 * SystemStatusCode.mmSuspended}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SystemStatusCode#Active
 * SystemStatusCode.mmActive}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SystemStatusCode#Closed
 * SystemStatusCode.mmClosed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SystemStatusCode#Closing
 * SystemStatusCode.mmClosing}</li>
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
 * <li>"SUSP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a system."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SystemStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * System is suspended, ie, not operational.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemStatusCode
	 * SystemStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System is suspended, ie, not operational."</li>
	 * </ul>
	 */
	public static final SystemStatusCode Suspended = new SystemStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Suspended";
			definition = "System is suspended, ie, not operational.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemStatusCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * System is functioning normally, ie, operational.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemStatusCode
	 * SystemStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Active"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System is functioning normally, ie, operational."</li>
	 * </ul>
	 */
	public static final SystemStatusCode Active = new SystemStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Active";
			definition = "System is functioning normally, ie, operational.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemStatusCode.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * System is closed (eg. normal closure of an RTGS)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemStatusCode
	 * SystemStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System is closed (eg. normal closure of an RTGS)"</li>
	 * </ul>
	 */
	public static final SystemStatusCode Closed = new SystemStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Closed";
			definition = "System is closed (eg. normal closure of an RTGS)";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemStatusCode.mmObject();
			codeName = "CLSD";
		}
	};
	/**
	 * System needs to wait for completion of intermediate internal activities
	 * before going to a status Closed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemStatusCode
	 * SystemStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLSG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System needs to wait for completion of intermediate internal activities before going to a status Closed."
	 * </li>
	 * </ul>
	 */
	public static final SystemStatusCode Closing = new SystemStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Closing";
			definition = "System needs to wait for completion of intermediate internal activities before going to a status Closed.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemStatusCode.mmObject();
			codeName = "CLSG";
		}
	};
	final static private LinkedHashMap<String, SystemStatusCode> codesByName = new LinkedHashMap<>();

	protected SystemStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SUSP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemStatusCode";
				definition = "Specifies the status of a system.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemStatusCode.Suspended, com.tools20022.repository.codeset.SystemStatusCode.Active, com.tools20022.repository.codeset.SystemStatusCode.Closed,
						com.tools20022.repository.codeset.SystemStatusCode.Closing);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Suspended.getCodeName().get(), Suspended);
		codesByName.put(Active.getCodeName().get(), Active);
		codesByName.put(Closed.getCodeName().get(), Closed);
		codesByName.put(Closing.getCodeName().get(), Closing);
	}

	public static SystemStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SystemStatusCode[] values() {
		SystemStatusCode[] values = new SystemStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SystemStatusCode> {
		@Override
		public SystemStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SystemStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}