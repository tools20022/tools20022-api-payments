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
import com.tools20022.repository.codeset.PreferredContactMethodCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode#Letter
 * PreferredContactMethodCode.mmLetter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode#Email
 * PreferredContactMethodCode.mmEmail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode#Phone
 * PreferredContactMethodCode.mmPhone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode#Fax
 * PreferredContactMethodCode.mmFax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode#MobileOrCellPhone
 * PreferredContactMethodCode.mmMobileOrCellPhone}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethod1Code
 * PreferredContactMethod1Code}</li>
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
 * <li>"LETT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PreferredContactMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Preferred method used to reach the individual contact within an organisation."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PreferredContactMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Preferred method used to reach the contact is per letter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode
	 * PreferredContactMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Letter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Preferred method used to reach the contact is per letter."
	 * </li>
	 * </ul>
	 */
	public static final PreferredContactMethodCode Letter = new PreferredContactMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Letter";
			definition = "Preferred method used to reach the contact is per letter.";
			owner_lazy = () -> com.tools20022.repository.codeset.PreferredContactMethodCode.mmObject();
			codeName = "LETT";
		}
	};
	/**
	 * Preferred method used to reach the contact is per email.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode
	 * PreferredContactMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Email"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Preferred method used to reach the contact is per email."</li>
	 * </ul>
	 */
	public static final PreferredContactMethodCode Email = new PreferredContactMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Email";
			definition = "Preferred method used to reach the contact is per email.";
			owner_lazy = () -> com.tools20022.repository.codeset.PreferredContactMethodCode.mmObject();
			codeName = "MAIL";
		}
	};
	/**
	 * Preferred method used to reach the contact is per phone.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode
	 * PreferredContactMethodCode}</li>
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
	 * definition} = "Preferred method used to reach the contact is per phone."</li>
	 * </ul>
	 */
	public static final PreferredContactMethodCode Phone = new PreferredContactMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Phone";
			definition = "Preferred method used to reach the contact is per phone.";
			owner_lazy = () -> com.tools20022.repository.codeset.PreferredContactMethodCode.mmObject();
			codeName = "PHON";
		}
	};
	/**
	 * Preferred method used to reach the contact is per fax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode
	 * PreferredContactMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAXX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Preferred method used to reach the contact is per fax."</li>
	 * </ul>
	 */
	public static final PreferredContactMethodCode Fax = new PreferredContactMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fax";
			definition = "Preferred method used to reach the contact is per fax.";
			owner_lazy = () -> com.tools20022.repository.codeset.PreferredContactMethodCode.mmObject();
			codeName = "FAXX";
		}
	};
	/**
	 * Preferred method used to reach the contact is per mobile or cell phone.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode
	 * PreferredContactMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CELL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobileOrCellPhone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Preferred method used to reach the contact is per mobile or cell phone."
	 * </li>
	 * </ul>
	 */
	public static final PreferredContactMethodCode MobileOrCellPhone = new PreferredContactMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobileOrCellPhone";
			definition = "Preferred method used to reach the contact is per mobile or cell phone.";
			owner_lazy = () -> com.tools20022.repository.codeset.PreferredContactMethodCode.mmObject();
			codeName = "CELL";
		}
	};
	final static private LinkedHashMap<String, PreferredContactMethodCode> codesByName = new LinkedHashMap<>();

	protected PreferredContactMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("LETT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PreferredContactMethodCode";
				definition = "Preferred method used to reach the individual contact within an organisation.";
				derivation_lazy = () -> Arrays.asList(PreferredContactMethod1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PreferredContactMethodCode.Letter, com.tools20022.repository.codeset.PreferredContactMethodCode.Email,
						com.tools20022.repository.codeset.PreferredContactMethodCode.Phone, com.tools20022.repository.codeset.PreferredContactMethodCode.Fax, com.tools20022.repository.codeset.PreferredContactMethodCode.MobileOrCellPhone);
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

	public static PreferredContactMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PreferredContactMethodCode[] values() {
		PreferredContactMethodCode[] values = new PreferredContactMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PreferredContactMethodCode> {
		@Override
		public PreferredContactMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PreferredContactMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}