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
import com.tools20022.repository.codeset.CommunicationMethodCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode#SWIFTMT
 * CommunicationMethodCode.SWIFTMT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode#SWIFTMX
 * CommunicationMethodCode.SWIFTMX}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode#Fax
 * CommunicationMethodCode.Fax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode#Email
 * CommunicationMethodCode.Email}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode#Proprietary
 * CommunicationMethodCode.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode#Online
 * CommunicationMethodCode.Online}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode#Phone
 * CommunicationMethodCode.Phone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode#PostalService
 * CommunicationMethodCode.PostalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode#File
 * CommunicationMethodCode.File}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CommunicationMethod2Code
 * CommunicationMethod2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommunicationMethod3Code
 * CommunicationMethod3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommunicationMethod4Code
 * CommunicationMethod4Code}</li>
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
 * <li>"SWMT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommunicationMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Communication method used for the transmission of documents."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CommunicationMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transmission by Swift (FIN).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SWIFTMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transmission by Swift (FIN)."</li>
	 * </ul>
	 */
	public static final CommunicationMethodCode SWIFTMT = new CommunicationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SWIFTMT";
			definition = "Transmission by Swift (FIN).";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethodCode.mmObject();
			codeName = "SWMT";
		}
	};
	/**
	 * Transmission by SWIFTNET.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWMX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SWIFTMX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transmission by SWIFTNET."</li>
	 * </ul>
	 */
	public static final CommunicationMethodCode SWIFTMX = new CommunicationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SWIFTMX";
			definition = "Transmission by SWIFTNET.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethodCode.mmObject();
			codeName = "SWMX";
		}
	};
	/**
	 * Transmission by Fax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAXI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transmission by Fax."</li>
	 * </ul>
	 */
	public static final CommunicationMethodCode Fax = new CommunicationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fax";
			definition = "Transmission by Fax.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethodCode.mmObject();
			codeName = "FAXI";
		}
	};
	/**
	 * Transmission by e-mail.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Email"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transmission by e-mail."</li>
	 * </ul>
	 */
	public static final CommunicationMethodCode Email = new CommunicationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Email";
			definition = "Transmission by e-mail.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethodCode.mmObject();
			codeName = "EMAL";
		}
	};
	/**
	 * Transmission by proprietary method.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transmission by proprietary method."</li>
	 * </ul>
	 */
	public static final CommunicationMethodCode Proprietary = new CommunicationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Transmission by proprietary method.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethodCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * Transmission on line, for example, in a web portal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Online"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transmission on line, for example, in a web portal."</li>
	 * </ul>
	 */
	public static final CommunicationMethodCode Online = new CommunicationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Online";
			definition = "Transmission on line, for example, in a web portal.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethodCode.mmObject();
			codeName = "ONLI";
		}
	};
	/**
	 * Transmission by telephone.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Phone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transmission by telephone."</li>
	 * </ul>
	 */
	public static final CommunicationMethodCode Phone = new CommunicationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Phone";
			definition = "Transmission by telephone.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethodCode.mmObject();
			codeName = "PHON";
		}
	};
	/**
	 * Transmission by postal service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transmission by postal service."</li>
	 * </ul>
	 */
	public static final CommunicationMethodCode PostalService = new CommunicationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalService";
			definition = "Transmission by postal service.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethodCode.mmObject();
			codeName = "POST";
		}
	};
	/**
	 * Transmission by file transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FILE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "File"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transmission by file transfer."</li>
	 * </ul>
	 */
	public static final CommunicationMethodCode File = new CommunicationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "File";
			definition = "Transmission by file transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethodCode.mmObject();
			codeName = "FILE";
		}
	};
	final static private LinkedHashMap<String, CommunicationMethodCode> codesByName = new LinkedHashMap<>();

	protected CommunicationMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SWMT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommunicationMethodCode";
				definition = "Communication method used for the transmission of documents.";
				derivation_lazy = () -> Arrays.asList(CommunicationMethod2Code.mmObject(), CommunicationMethod3Code.mmObject(), CommunicationMethod4Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CommunicationMethodCode.SWIFTMT, com.tools20022.repository.codeset.CommunicationMethodCode.SWIFTMX,
						com.tools20022.repository.codeset.CommunicationMethodCode.Fax, com.tools20022.repository.codeset.CommunicationMethodCode.Email, com.tools20022.repository.codeset.CommunicationMethodCode.Proprietary,
						com.tools20022.repository.codeset.CommunicationMethodCode.Online, com.tools20022.repository.codeset.CommunicationMethodCode.Phone, com.tools20022.repository.codeset.CommunicationMethodCode.PostalService,
						com.tools20022.repository.codeset.CommunicationMethodCode.File);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SWIFTMT.getCodeName().get(), SWIFTMT);
		codesByName.put(SWIFTMX.getCodeName().get(), SWIFTMX);
		codesByName.put(Fax.getCodeName().get(), Fax);
		codesByName.put(Email.getCodeName().get(), Email);
		codesByName.put(Proprietary.getCodeName().get(), Proprietary);
		codesByName.put(Online.getCodeName().get(), Online);
		codesByName.put(Phone.getCodeName().get(), Phone);
		codesByName.put(PostalService.getCodeName().get(), PostalService);
		codesByName.put(File.getCodeName().get(), File);
	}

	public static CommunicationMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CommunicationMethodCode[] values() {
		CommunicationMethodCode[] values = new CommunicationMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CommunicationMethodCode> {
		@Override
		public CommunicationMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CommunicationMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}