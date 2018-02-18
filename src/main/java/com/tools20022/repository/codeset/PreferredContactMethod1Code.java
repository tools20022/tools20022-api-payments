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
import com.tools20022.repository.codeset.PreferredContactMethod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Preferred method used to reach the individual contact within an organisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethod1Code#Letter
 * PreferredContactMethod1Code.Letter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethod1Code#Email
 * PreferredContactMethod1Code.Email}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethod1Code#Phone
 * PreferredContactMethod1Code.Phone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethod1Code#Fax
 * PreferredContactMethod1Code.Fax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethod1Code#MobileOrCellPhone
 * PreferredContactMethod1Code.MobileOrCellPhone}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode
 * PreferredContactMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"LETT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PreferredContactMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Preferred method used to reach the individual contact within an organisation."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PreferredContactMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethod1Code
	 * PreferredContactMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Letter"</li>
	 * </ul>
	 */
	public static final PreferredContactMethod1Code Letter = new PreferredContactMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Letter";
			owner_lazy = () -> com.tools20022.repository.codeset.PreferredContactMethod1Code.mmObject();
			codeName = PreferredContactMethodCode.Letter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethod1Code
	 * PreferredContactMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Email"</li>
	 * </ul>
	 */
	public static final PreferredContactMethod1Code Email = new PreferredContactMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Email";
			owner_lazy = () -> com.tools20022.repository.codeset.PreferredContactMethod1Code.mmObject();
			codeName = PreferredContactMethodCode.Email.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethod1Code
	 * PreferredContactMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Phone"</li>
	 * </ul>
	 */
	public static final PreferredContactMethod1Code Phone = new PreferredContactMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Phone";
			owner_lazy = () -> com.tools20022.repository.codeset.PreferredContactMethod1Code.mmObject();
			codeName = PreferredContactMethodCode.Phone.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethod1Code
	 * PreferredContactMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fax"</li>
	 * </ul>
	 */
	public static final PreferredContactMethod1Code Fax = new PreferredContactMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fax";
			owner_lazy = () -> com.tools20022.repository.codeset.PreferredContactMethod1Code.mmObject();
			codeName = PreferredContactMethodCode.Fax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethod1Code
	 * PreferredContactMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobileOrCellPhone"</li>
	 * </ul>
	 */
	public static final PreferredContactMethod1Code MobileOrCellPhone = new PreferredContactMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobileOrCellPhone";
			owner_lazy = () -> com.tools20022.repository.codeset.PreferredContactMethod1Code.mmObject();
			codeName = PreferredContactMethodCode.MobileOrCellPhone.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PreferredContactMethod1Code> codesByName = new LinkedHashMap<>();

	protected PreferredContactMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LETT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PreferredContactMethod1Code";
				definition = "Preferred method used to reach the individual contact within an organisation.";
				trace_lazy = () -> PreferredContactMethodCode.mmObject();
				code_lazy = () -> Arrays
						.asList(com.tools20022.repository.codeset.PreferredContactMethod1Code.Letter, com.tools20022.repository.codeset.PreferredContactMethod1Code.Email, com.tools20022.repository.codeset.PreferredContactMethod1Code.Phone,
								com.tools20022.repository.codeset.PreferredContactMethod1Code.Fax, com.tools20022.repository.codeset.PreferredContactMethod1Code.MobileOrCellPhone);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Letter.getCodeName().get(), Letter);
		codesByName.put(Email.getCodeName().get(), Email);
		codesByName.put(Phone.getCodeName().get(), Phone);
		codesByName.put(Fax.getCodeName().get(), Fax);
		codesByName.put(MobileOrCellPhone.getCodeName().get(), MobileOrCellPhone);
	}

	public static PreferredContactMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PreferredContactMethod1Code[] values() {
		PreferredContactMethod1Code[] values = new PreferredContactMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PreferredContactMethod1Code> {
		@Override
		public PreferredContactMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PreferredContactMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}