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
import com.tools20022.repository.codeset.InvestigatedPartiesCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the investigated parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigatedPartiesCode#AllParties
 * InvestigatedPartiesCode.mmAllParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigatedPartiesCode#Owner
 * InvestigatedPartiesCode.mmOwner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InvestigatedParties1Code
 * InvestigatedParties1Code}</li>
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
 * <li>"ALLP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestigatedPartiesCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the investigated parties."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestigatedPartiesCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investigated parties are all parties playig a role matching the search
	 * criteria.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigatedPartiesCode
	 * InvestigatedPartiesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALLP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investigated parties are all parties playig a role matching the search criteria."
	 * </li>
	 * </ul>
	 */
	public static final InvestigatedPartiesCode AllParties = new InvestigatedPartiesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllParties";
			definition = "Investigated parties are all parties playig a role matching the search criteria.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigatedPartiesCode.mmObject();
			codeName = "ALLP";
		}
	};
	/**
	 * Investigated party is the owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigatedPartiesCode
	 * InvestigatedPartiesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OWNE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Owner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investigated party is the owner."</li>
	 * </ul>
	 */
	public static final InvestigatedPartiesCode Owner = new InvestigatedPartiesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Owner";
			definition = "Investigated party is the owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigatedPartiesCode.mmObject();
			codeName = "OWNE";
		}
	};
	final static private LinkedHashMap<String, InvestigatedPartiesCode> codesByName = new LinkedHashMap<>();

	protected InvestigatedPartiesCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ALLP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestigatedPartiesCode";
				definition = "Specifies the investigated parties.";
				derivation_lazy = () -> Arrays.asList(InvestigatedParties1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestigatedPartiesCode.AllParties, com.tools20022.repository.codeset.InvestigatedPartiesCode.Owner);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AllParties.getCodeName().get(), AllParties);
		codesByName.put(Owner.getCodeName().get(), Owner);
	}

	public static InvestigatedPartiesCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestigatedPartiesCode[] values() {
		InvestigatedPartiesCode[] values = new InvestigatedPartiesCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestigatedPartiesCode> {
		@Override
		public InvestigatedPartiesCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestigatedPartiesCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}