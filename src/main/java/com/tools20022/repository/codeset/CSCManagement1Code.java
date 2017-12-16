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
import com.tools20022.repository.codeset.CSCManagement1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * CSC (Card Security Code) management associated with the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code#CSCPresent
 * CSCManagement1Code.mmCSCPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code#CSCByPass
 * CSCManagement1Code.mmCSCByPass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code#CSCUnread
 * CSCManagement1Code.mmCSCUnread}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCManagement1Code#NoCSC
 * CSCManagement1Code.mmNoCSC}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode
 * CSCManagementCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PRST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CSCManagement1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "CSC (Card Security Code) management associated with the transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CSCManagement1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code
	 * CSCManagement1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCPresent"</li>
	 * </ul>
	 */
	public static final CSCManagement1Code CSCPresent = new CSCManagement1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCPresent";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCManagement1Code.mmObject();
			codeName = CSCManagementCode.CSCPresent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code
	 * CSCManagement1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCByPass"</li>
	 * </ul>
	 */
	public static final CSCManagement1Code CSCByPass = new CSCManagement1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCByPass";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCManagement1Code.mmObject();
			codeName = CSCManagementCode.CSCByPass.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code
	 * CSCManagement1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCUnread"</li>
	 * </ul>
	 */
	public static final CSCManagement1Code CSCUnread = new CSCManagement1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCUnread";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCManagement1Code.mmObject();
			codeName = CSCManagementCode.CSCUnread.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code
	 * CSCManagement1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCSC"</li>
	 * </ul>
	 */
	public static final CSCManagement1Code NoCSC = new CSCManagement1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCSC";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCManagement1Code.mmObject();
			codeName = CSCManagementCode.NoCSC.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CSCManagement1Code> codesByName = new LinkedHashMap<>();

	protected CSCManagement1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PRST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CSCManagement1Code";
				definition = "CSC (Card Security Code) management associated with the transaction.";
				trace_lazy = () -> CSCManagementCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CSCManagement1Code.CSCPresent, com.tools20022.repository.codeset.CSCManagement1Code.CSCByPass,
						com.tools20022.repository.codeset.CSCManagement1Code.CSCUnread, com.tools20022.repository.codeset.CSCManagement1Code.NoCSC);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CSCPresent.getCodeName().get(), CSCPresent);
		codesByName.put(CSCByPass.getCodeName().get(), CSCByPass);
		codesByName.put(CSCUnread.getCodeName().get(), CSCUnread);
		codesByName.put(NoCSC.getCodeName().get(), NoCSC);
	}

	public static CSCManagement1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CSCManagement1Code[] values() {
		CSCManagement1Code[] values = new CSCManagement1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CSCManagement1Code> {
		@Override
		public CSCManagement1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CSCManagement1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}