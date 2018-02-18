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
import com.tools20022.repository.codeset.TerminalManagementActionTriggerCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Event to start a terminal management action by the point of interaction
 * (POI).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTriggerCode#DateTime
 * TerminalManagementActionTriggerCode.DateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTriggerCode#HostEvent
 * TerminalManagementActionTriggerCode.HostEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTriggerCode#Manual
 * TerminalManagementActionTriggerCode.Manual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTriggerCode#SaleEvent
 * TerminalManagementActionTriggerCode.SaleEvent}</li>
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
 * <li>"DATE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementActionTriggerCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Event to start a terminal management action by the point of interaction (POI)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementActionTriggerCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time trigger the terminal management action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTriggerCode
	 * TerminalManagementActionTriggerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time trigger the terminal management action."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionTriggerCode DateTime = new TerminalManagementActionTriggerCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DateTime";
			definition = "Date and time trigger the terminal management action.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionTriggerCode.mmObject();
			codeName = "DATE";
		}
	};
	/**
	 * Acquirer triggers the terminal management action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTriggerCode
	 * TerminalManagementActionTriggerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer triggers the terminal management action."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionTriggerCode HostEvent = new TerminalManagementActionTriggerCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HostEvent";
			definition = "Acquirer triggers the terminal management action.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionTriggerCode.mmObject();
			codeName = "HOST";
		}
	};
	/**
	 * Acceptor triggers the terminal management action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTriggerCode
	 * TerminalManagementActionTriggerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MANU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptor triggers the terminal management action."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionTriggerCode Manual = new TerminalManagementActionTriggerCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Manual";
			definition = "Acceptor triggers the terminal management action.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionTriggerCode.mmObject();
			codeName = "MANU";
		}
	};
	/**
	 * Sale system triggers the terminal management action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTriggerCode
	 * TerminalManagementActionTriggerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SALE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sale system triggers the terminal management action."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionTriggerCode SaleEvent = new TerminalManagementActionTriggerCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SaleEvent";
			definition = "Sale system triggers the terminal management action.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionTriggerCode.mmObject();
			codeName = "SALE";
		}
	};
	final static private LinkedHashMap<String, TerminalManagementActionTriggerCode> codesByName = new LinkedHashMap<>();

	protected TerminalManagementActionTriggerCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DATE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionTriggerCode";
				definition = "Event to start a terminal management action by the point of interaction (POI).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementActionTriggerCode.DateTime, com.tools20022.repository.codeset.TerminalManagementActionTriggerCode.HostEvent,
						com.tools20022.repository.codeset.TerminalManagementActionTriggerCode.Manual, com.tools20022.repository.codeset.TerminalManagementActionTriggerCode.SaleEvent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DateTime.getCodeName().get(), DateTime);
		codesByName.put(HostEvent.getCodeName().get(), HostEvent);
		codesByName.put(Manual.getCodeName().get(), Manual);
		codesByName.put(SaleEvent.getCodeName().get(), SaleEvent);
	}

	public static TerminalManagementActionTriggerCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementActionTriggerCode[] values() {
		TerminalManagementActionTriggerCode[] values = new TerminalManagementActionTriggerCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementActionTriggerCode> {
		@Override
		public TerminalManagementActionTriggerCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementActionTriggerCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}