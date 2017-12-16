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
import com.tools20022.repository.codeset.InvestorRestrictionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies to whom or what the restriction applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorRestrictionTypeCode#LegalResident
 * InvestorRestrictionTypeCode.mmLegalResident}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorRestrictionTypeCode#Citizen
 * InvestorRestrictionTypeCode.mmCitizen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorRestrictionTypeCode#Individual
 * InvestorRestrictionTypeCode.mmIndividual}</li>
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
 * <li>"LERE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestorRestrictionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies to whom or what the restriction applies."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestorRestrictionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Restriction applies to a legal resident.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorRestrictionTypeCode
	 * InvestorRestrictionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LERE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalResident"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Restriction applies to a legal resident."</li>
	 * </ul>
	 */
	public static final InvestorRestrictionTypeCode LegalResident = new InvestorRestrictionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalResident";
			definition = "Restriction applies to a legal resident.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorRestrictionTypeCode.mmObject();
			codeName = "LERE";
		}
	};
	/**
	 * Restriction applies to a citizen.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorRestrictionTypeCode
	 * InvestorRestrictionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CITI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Citizen"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Restriction applies to a citizen."</li>
	 * </ul>
	 */
	public static final InvestorRestrictionTypeCode Citizen = new InvestorRestrictionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Citizen";
			definition = "Restriction applies to a citizen.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorRestrictionTypeCode.mmObject();
			codeName = "CITI";
		}
	};
	/**
	 * Restriction applies to an individual.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorRestrictionTypeCode
	 * InvestorRestrictionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Individual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Restriction applies to an individual."</li>
	 * </ul>
	 */
	public static final InvestorRestrictionTypeCode Individual = new InvestorRestrictionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Individual";
			definition = "Restriction applies to an individual.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorRestrictionTypeCode.mmObject();
			codeName = "INDV";
		}
	};
	final static private LinkedHashMap<String, InvestorRestrictionTypeCode> codesByName = new LinkedHashMap<>();

	protected InvestorRestrictionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("LERE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestorRestrictionTypeCode";
				definition = "Specifies to whom or what the restriction applies.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestorRestrictionTypeCode.LegalResident, com.tools20022.repository.codeset.InvestorRestrictionTypeCode.Citizen,
						com.tools20022.repository.codeset.InvestorRestrictionTypeCode.Individual);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LegalResident.getCodeName().get(), LegalResident);
		codesByName.put(Citizen.getCodeName().get(), Citizen);
		codesByName.put(Individual.getCodeName().get(), Individual);
	}

	public static InvestorRestrictionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestorRestrictionTypeCode[] values() {
		InvestorRestrictionTypeCode[] values = new InvestorRestrictionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestorRestrictionTypeCode> {
		@Override
		public InvestorRestrictionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestorRestrictionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}