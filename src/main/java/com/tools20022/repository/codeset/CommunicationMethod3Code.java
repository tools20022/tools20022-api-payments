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
import com.tools20022.repository.codeset.CommunicationMethod3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod3Code#Email
 * CommunicationMethod3Code.mmEmail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod3Code#Fax
 * CommunicationMethod3Code.mmFax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod3Code#PostalService
 * CommunicationMethod3Code.mmPostalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod3Code#Phone
 * CommunicationMethod3Code.mmPhone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod3Code#File
 * CommunicationMethod3Code.mmFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod3Code#Online
 * CommunicationMethod3Code.mmOnline}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
 * CommunicationMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
 * "CommunicationMethod3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Communication method used for the transmission of documents."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CommunicationMethod3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod3Code
	 * CommunicationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Email"</li>
	 * </ul>
	 */
	public static final CommunicationMethod3Code Email = new CommunicationMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Email";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod3Code.mmObject();
			codeName = CommunicationMethodCode.Email.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod3Code
	 * CommunicationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fax"</li>
	 * </ul>
	 */
	public static final CommunicationMethod3Code Fax = new CommunicationMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fax";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod3Code.mmObject();
			codeName = CommunicationMethodCode.Fax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod3Code
	 * CommunicationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalService"</li>
	 * </ul>
	 */
	public static final CommunicationMethod3Code PostalService = new CommunicationMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalService";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod3Code.mmObject();
			codeName = CommunicationMethodCode.PostalService.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod3Code
	 * CommunicationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Phone"</li>
	 * </ul>
	 */
	public static final CommunicationMethod3Code Phone = new CommunicationMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Phone";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod3Code.mmObject();
			codeName = CommunicationMethodCode.Phone.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod3Code
	 * CommunicationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "File"</li>
	 * </ul>
	 */
	public static final CommunicationMethod3Code File = new CommunicationMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "File";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod3Code.mmObject();
			codeName = CommunicationMethodCode.File.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod3Code
	 * CommunicationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Online"</li>
	 * </ul>
	 */
	public static final CommunicationMethod3Code Online = new CommunicationMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Online";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod3Code.mmObject();
			codeName = CommunicationMethodCode.Online.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CommunicationMethod3Code> codesByName = new LinkedHashMap<>();

	protected CommunicationMethod3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("EMAL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommunicationMethod3Code";
				definition = "Communication method used for the transmission of documents.";
				trace_lazy = () -> CommunicationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CommunicationMethod3Code.Email, com.tools20022.repository.codeset.CommunicationMethod3Code.Fax,
						com.tools20022.repository.codeset.CommunicationMethod3Code.PostalService, com.tools20022.repository.codeset.CommunicationMethod3Code.Phone, com.tools20022.repository.codeset.CommunicationMethod3Code.File,
						com.tools20022.repository.codeset.CommunicationMethod3Code.Online);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Email.getCodeName().get(), Email);
		codesByName.put(Fax.getCodeName().get(), Fax);
		codesByName.put(PostalService.getCodeName().get(), PostalService);
		codesByName.put(Phone.getCodeName().get(), Phone);
		codesByName.put(File.getCodeName().get(), File);
		codesByName.put(Online.getCodeName().get(), Online);
	}

	public static CommunicationMethod3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CommunicationMethod3Code[] values() {
		CommunicationMethod3Code[] values = new CommunicationMethod3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CommunicationMethod3Code> {
		@Override
		public CommunicationMethod3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CommunicationMethod3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}