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
import com.tools20022.repository.codeset.ResidentialStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the residential status of an individual.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResidentialStatus1Code#Resident
 * ResidentialStatus1Code.Resident}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResidentialStatus1Code#PermanentResident
 * ResidentialStatus1Code.PermanentResident}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResidentialStatus1Code#NonResident
 * ResidentialStatus1Code.NonResident}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ResidentialStatusCode
 * ResidentialStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RESI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResidentialStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the residential status of an individual."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ResidentialStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResidentialStatus1Code
	 * ResidentialStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Resident"</li>
	 * </ul>
	 */
	public static final ResidentialStatus1Code Resident = new ResidentialStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Resident";
			owner_lazy = () -> com.tools20022.repository.codeset.ResidentialStatus1Code.mmObject();
			codeName = ResidentialStatusCode.Resident.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResidentialStatus1Code
	 * ResidentialStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PermanentResident"</li>
	 * </ul>
	 */
	public static final ResidentialStatus1Code PermanentResident = new ResidentialStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PermanentResident";
			owner_lazy = () -> com.tools20022.repository.codeset.ResidentialStatus1Code.mmObject();
			codeName = ResidentialStatusCode.PermanentResident.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResidentialStatus1Code
	 * ResidentialStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonResident"</li>
	 * </ul>
	 */
	public static final ResidentialStatus1Code NonResident = new ResidentialStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonResident";
			owner_lazy = () -> com.tools20022.repository.codeset.ResidentialStatus1Code.mmObject();
			codeName = ResidentialStatusCode.NonResident.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ResidentialStatus1Code> codesByName = new LinkedHashMap<>();

	protected ResidentialStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RESI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResidentialStatus1Code";
				definition = "Specifies the residential status of an individual.";
				trace_lazy = () -> ResidentialStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResidentialStatus1Code.Resident, com.tools20022.repository.codeset.ResidentialStatus1Code.PermanentResident,
						com.tools20022.repository.codeset.ResidentialStatus1Code.NonResident);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Resident.getCodeName().get(), Resident);
		codesByName.put(PermanentResident.getCodeName().get(), PermanentResident);
		codesByName.put(NonResident.getCodeName().get(), NonResident);
	}

	public static ResidentialStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ResidentialStatus1Code[] values() {
		ResidentialStatus1Code[] values = new ResidentialStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ResidentialStatus1Code> {
		@Override
		public ResidentialStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ResidentialStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}