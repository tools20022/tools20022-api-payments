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
import com.tools20022.repository.codeset.EligibilityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the type of investor. The rules that apply to each type of client
 * are different.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EligibilityCode#EligibleCounterparty
 * EligibilityCode.EligibleCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EligibilityCode#RetailClient
 * EligibilityCode.RetailClient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EligibilityCode#ProfessionalClient
 * EligibilityCode.ProfessionalClient}</li>
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
 * <li>"ELIG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EligibilityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the type of investor. The rules that apply to each type of client are different."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EligibilityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Eligible customers are the most sophisticated level of investor, able to
	 * opt out of some the protections afforded by conduct of business rules.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EligibilityCode
	 * EligibilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eligible customers are the most sophisticated level of investor, able to opt out of some the protections afforded by conduct of business rules."
	 * </li>
	 * </ul>
	 */
	public static final EligibilityCode EligibleCounterparty = new EligibilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleCounterparty";
			definition = "Eligible customers are the most sophisticated level of investor, able to opt out of some the protections afforded by conduct of business rules.";
			owner_lazy = () -> com.tools20022.repository.codeset.EligibilityCode.mmObject();
			codeName = "ELIG";
		}
	};
	/**
	 * Retail customers are the least sophisticated level of investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EligibilityCode
	 * EligibilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RETL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailClient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Retail customers are the least sophisticated level of investor."</li>
	 * </ul>
	 */
	public static final EligibilityCode RetailClient = new EligibilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RetailClient";
			definition = "Retail customers are the least sophisticated level of investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.EligibilityCode.mmObject();
			codeName = "RETL";
		}
	};
	/**
	 * Professional customers are, for example, investment firms, credit
	 * institutions, insurance companies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EligibilityCode
	 * EligibilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfessionalClient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Professional customers are, for example, investment firms, credit institutions, insurance companies."
	 * </li>
	 * </ul>
	 */
	public static final EligibilityCode ProfessionalClient = new EligibilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProfessionalClient";
			definition = "Professional customers are, for example, investment firms, credit institutions, insurance companies.";
			owner_lazy = () -> com.tools20022.repository.codeset.EligibilityCode.mmObject();
			codeName = "PROF";
		}
	};
	final static private LinkedHashMap<String, EligibilityCode> codesByName = new LinkedHashMap<>();

	protected EligibilityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ELIG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EligibilityCode";
				definition = "Identifies the type of investor. The rules that apply to each type of client are different.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EligibilityCode.EligibleCounterparty, com.tools20022.repository.codeset.EligibilityCode.RetailClient,
						com.tools20022.repository.codeset.EligibilityCode.ProfessionalClient);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EligibleCounterparty.getCodeName().get(), EligibleCounterparty);
		codesByName.put(RetailClient.getCodeName().get(), RetailClient);
		codesByName.put(ProfessionalClient.getCodeName().get(), ProfessionalClient);
	}

	public static EligibilityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EligibilityCode[] values() {
		EligibilityCode[] values = new EligibilityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EligibilityCode> {
		@Override
		public EligibilityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EligibilityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}