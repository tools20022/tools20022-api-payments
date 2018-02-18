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
import com.tools20022.repository.codeset.CommunicationMethod2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Communication method used for the transmission of documents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod2Code#Email
 * CommunicationMethod2Code.Email}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod2Code#Fax
 * CommunicationMethod2Code.Fax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod2Code#File
 * CommunicationMethod2Code.File}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod2Code#Online
 * CommunicationMethod2Code.Online}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod2Code#PostalService
 * CommunicationMethod2Code.PostalService}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
 * CommunicationMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EMAL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommunicationMethod2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Communication method used for the transmission of documents."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CommunicationMethod2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod2Code
	 * CommunicationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Email"</li>
	 * </ul>
	 */
	public static final CommunicationMethod2Code Email = new CommunicationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Email";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod2Code.mmObject();
			codeName = CommunicationMethodCode.Email.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod2Code
	 * CommunicationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fax"</li>
	 * </ul>
	 */
	public static final CommunicationMethod2Code Fax = new CommunicationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fax";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod2Code.mmObject();
			codeName = CommunicationMethodCode.Fax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod2Code
	 * CommunicationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "File"</li>
	 * </ul>
	 */
	public static final CommunicationMethod2Code File = new CommunicationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "File";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod2Code.mmObject();
			codeName = CommunicationMethodCode.File.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod2Code
	 * CommunicationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Online"</li>
	 * </ul>
	 */
	public static final CommunicationMethod2Code Online = new CommunicationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Online";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod2Code.mmObject();
			codeName = CommunicationMethodCode.Online.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod2Code
	 * CommunicationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalService"</li>
	 * </ul>
	 */
	public static final CommunicationMethod2Code PostalService = new CommunicationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalService";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod2Code.mmObject();
			codeName = CommunicationMethodCode.PostalService.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CommunicationMethod2Code> codesByName = new LinkedHashMap<>();

	protected CommunicationMethod2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EMAL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommunicationMethod2Code";
				definition = "Communication method used for the transmission of documents.";
				trace_lazy = () -> CommunicationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CommunicationMethod2Code.Email, com.tools20022.repository.codeset.CommunicationMethod2Code.Fax,
						com.tools20022.repository.codeset.CommunicationMethod2Code.File, com.tools20022.repository.codeset.CommunicationMethod2Code.Online, com.tools20022.repository.codeset.CommunicationMethod2Code.PostalService);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Email.getCodeName().get(), Email);
		codesByName.put(Fax.getCodeName().get(), Fax);
		codesByName.put(File.getCodeName().get(), File);
		codesByName.put(Online.getCodeName().get(), Online);
		codesByName.put(PostalService.getCodeName().get(), PostalService);
	}

	public static CommunicationMethod2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CommunicationMethod2Code[] values() {
		CommunicationMethod2Code[] values = new CommunicationMethod2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CommunicationMethod2Code> {
		@Override
		public CommunicationMethod2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CommunicationMethod2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}