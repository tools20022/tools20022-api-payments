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
import com.tools20022.repository.codeset.ResidentialStatusCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ResidentialStatusCode#Resident
 * ResidentialStatusCode.Resident}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResidentialStatusCode#PermanentResident
 * ResidentialStatusCode.PermanentResident}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResidentialStatusCode#NonResident
 * ResidentialStatusCode.NonResident}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ResidentialStatus1Code
 * ResidentialStatus1Code}</li>
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
 * <li>"RESI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResidentialStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the residential status of an individual."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ResidentialStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Resident.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResidentialStatusCode
	 * ResidentialStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Resident"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Resident."</li>
	 * </ul>
	 */
	public static final ResidentialStatusCode Resident = new ResidentialStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Resident";
			definition = "Resident.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResidentialStatusCode.mmObject();
			codeName = "RESI";
		}
	};
	/**
	 * Permanent resident.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResidentialStatusCode
	 * ResidentialStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PermanentResident"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Permanent resident."</li>
	 * </ul>
	 */
	public static final ResidentialStatusCode PermanentResident = new ResidentialStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PermanentResident";
			definition = "Permanent resident.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResidentialStatusCode.mmObject();
			codeName = "PRES";
		}
	};
	/**
	 * Non-resident.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResidentialStatusCode
	 * ResidentialStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonResident"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Non-resident."</li>
	 * </ul>
	 */
	public static final ResidentialStatusCode NonResident = new ResidentialStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonResident";
			definition = "Non-resident.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResidentialStatusCode.mmObject();
			codeName = "NRES";
		}
	};
	final static private LinkedHashMap<String, ResidentialStatusCode> codesByName = new LinkedHashMap<>();

	protected ResidentialStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RESI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResidentialStatusCode";
				definition = "Specifies the residential status of an individual.";
				derivation_lazy = () -> Arrays.asList(ResidentialStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResidentialStatusCode.Resident, com.tools20022.repository.codeset.ResidentialStatusCode.PermanentResident,
						com.tools20022.repository.codeset.ResidentialStatusCode.NonResident);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Resident.getCodeName().get(), Resident);
		codesByName.put(PermanentResident.getCodeName().get(), PermanentResident);
		codesByName.put(NonResident.getCodeName().get(), NonResident);
	}

	public static ResidentialStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ResidentialStatusCode[] values() {
		ResidentialStatusCode[] values = new ResidentialStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ResidentialStatusCode> {
		@Override
		public ResidentialStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ResidentialStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}