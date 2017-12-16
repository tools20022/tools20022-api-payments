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
import com.tools20022.repository.codeset.CSCManagementCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode#CSCPresent
 * CSCManagementCode.mmCSCPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode#CSCByPass
 * CSCManagementCode.mmCSCByPass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode#CSCUnread
 * CSCManagementCode.mmCSCUnread}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCManagementCode#NoCSC
 * CSCManagementCode.mmNoCSC}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCManagement1Code
 * CSCManagement1Code}</li>
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
 * <li>"PRST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CSCManagementCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "CSC (Card Security Code) management associated with the transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CSCManagementCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card security code present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode
	 * CSCManagementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCPresent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card security code present."</li>
	 * </ul>
	 */
	public static final CSCManagementCode CSCPresent = new CSCManagementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCPresent";
			definition = "Card security code present.";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCManagementCode.mmObject();
			codeName = "PRST";
		}
	};
	/**
	 * Card security code by-passed or not provided by the merchant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode
	 * CSCManagementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BYPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCByPass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card security code by-passed or not provided by the merchant."</li>
	 * </ul>
	 */
	public static final CSCManagementCode CSCByPass = new CSCManagementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCByPass";
			definition = "Card security code by-passed or not provided by the merchant.";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCManagementCode.mmObject();
			codeName = "BYPS";
		}
	};
	/**
	 * Card security code unreadable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode
	 * CSCManagementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCUnread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card security code unreadable."</li>
	 * </ul>
	 */
	public static final CSCManagementCode CSCUnread = new CSCManagementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCUnread";
			definition = "Card security code unreadable.";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCManagementCode.mmObject();
			codeName = "UNRD";
		}
	};
	/**
	 * No card security code imprint.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode
	 * CSCManagementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No card security code imprint."</li>
	 * </ul>
	 */
	public static final CSCManagementCode NoCSC = new CSCManagementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoCSC";
			definition = "No card security code imprint.";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCManagementCode.mmObject();
			codeName = "NCSC";
		}
	};
	final static private LinkedHashMap<String, CSCManagementCode> codesByName = new LinkedHashMap<>();

	protected CSCManagementCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PRST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CSCManagementCode";
				definition = "CSC (Card Security Code) management associated with the transaction.";
				derivation_lazy = () -> Arrays.asList(CSCManagement1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CSCManagementCode.CSCPresent, com.tools20022.repository.codeset.CSCManagementCode.CSCByPass, com.tools20022.repository.codeset.CSCManagementCode.CSCUnread,
						com.tools20022.repository.codeset.CSCManagementCode.NoCSC);
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

	public static CSCManagementCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CSCManagementCode[] values() {
		CSCManagementCode[] values = new CSCManagementCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CSCManagementCode> {
		@Override
		public CSCManagementCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CSCManagementCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}