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
import com.tools20022.repository.codeset.CommunicationMethod4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a communication method used for the transmission of documents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code#Email
 * CommunicationMethod4Code.Email}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code#Fax
 * CommunicationMethod4Code.Fax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code#File
 * CommunicationMethod4Code.File}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code#Online
 * CommunicationMethod4Code.Online}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code#Phone
 * CommunicationMethod4Code.Phone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code#PostalService
 * CommunicationMethod4Code.PostalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code#Proprietary
 * CommunicationMethod4Code.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code#SWIFTMT
 * CommunicationMethod4Code.SWIFTMT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code#SWIFTMX
 * CommunicationMethod4Code.SWIFTMX}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommunicationMethod4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a communication method used for the transmission of documents."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CommunicationMethod4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code
	 * CommunicationMethod4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Email"</li>
	 * </ul>
	 */
	public static final CommunicationMethod4Code Email = new CommunicationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Email";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod4Code.mmObject();
			codeName = CommunicationMethodCode.Email.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code
	 * CommunicationMethod4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fax"</li>
	 * </ul>
	 */
	public static final CommunicationMethod4Code Fax = new CommunicationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fax";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod4Code.mmObject();
			codeName = CommunicationMethodCode.Fax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code
	 * CommunicationMethod4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "File"</li>
	 * </ul>
	 */
	public static final CommunicationMethod4Code File = new CommunicationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "File";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod4Code.mmObject();
			codeName = CommunicationMethodCode.File.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code
	 * CommunicationMethod4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Online"</li>
	 * </ul>
	 */
	public static final CommunicationMethod4Code Online = new CommunicationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Online";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod4Code.mmObject();
			codeName = CommunicationMethodCode.Online.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code
	 * CommunicationMethod4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Phone"</li>
	 * </ul>
	 */
	public static final CommunicationMethod4Code Phone = new CommunicationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Phone";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod4Code.mmObject();
			codeName = CommunicationMethodCode.Phone.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code
	 * CommunicationMethod4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalService"</li>
	 * </ul>
	 */
	public static final CommunicationMethod4Code PostalService = new CommunicationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalService";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod4Code.mmObject();
			codeName = CommunicationMethodCode.PostalService.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code
	 * CommunicationMethod4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * </ul>
	 */
	public static final CommunicationMethod4Code Proprietary = new CommunicationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod4Code.mmObject();
			codeName = CommunicationMethodCode.Proprietary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code
	 * CommunicationMethod4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SWIFTMT"</li>
	 * </ul>
	 */
	public static final CommunicationMethod4Code SWIFTMT = new CommunicationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SWIFTMT";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod4Code.mmObject();
			codeName = CommunicationMethodCode.SWIFTMT.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code
	 * CommunicationMethod4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SWIFTMX"</li>
	 * </ul>
	 */
	public static final CommunicationMethod4Code SWIFTMX = new CommunicationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SWIFTMX";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod4Code.mmObject();
			codeName = CommunicationMethodCode.SWIFTMX.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CommunicationMethod4Code> codesByName = new LinkedHashMap<>();

	protected CommunicationMethod4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommunicationMethod4Code";
				definition = "Specifies a communication method used for the transmission of documents.";
				trace_lazy = () -> CommunicationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CommunicationMethod4Code.Email, com.tools20022.repository.codeset.CommunicationMethod4Code.Fax,
						com.tools20022.repository.codeset.CommunicationMethod4Code.File, com.tools20022.repository.codeset.CommunicationMethod4Code.Online, com.tools20022.repository.codeset.CommunicationMethod4Code.Phone,
						com.tools20022.repository.codeset.CommunicationMethod4Code.PostalService, com.tools20022.repository.codeset.CommunicationMethod4Code.Proprietary, com.tools20022.repository.codeset.CommunicationMethod4Code.SWIFTMT,
						com.tools20022.repository.codeset.CommunicationMethod4Code.SWIFTMX);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Email.getCodeName().get(), Email);
		codesByName.put(Fax.getCodeName().get(), Fax);
		codesByName.put(File.getCodeName().get(), File);
		codesByName.put(Online.getCodeName().get(), Online);
		codesByName.put(Phone.getCodeName().get(), Phone);
		codesByName.put(PostalService.getCodeName().get(), PostalService);
		codesByName.put(Proprietary.getCodeName().get(), Proprietary);
		codesByName.put(SWIFTMT.getCodeName().get(), SWIFTMT);
		codesByName.put(SWIFTMX.getCodeName().get(), SWIFTMX);
	}

	public static CommunicationMethod4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CommunicationMethod4Code[] values() {
		CommunicationMethod4Code[] values = new CommunicationMethod4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CommunicationMethod4Code> {
		@Override
		public CommunicationMethod4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CommunicationMethod4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}