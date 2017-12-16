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
import com.tools20022.repository.codeset.InsuranceCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of insurance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceCode#LifeInsurance
 * InsuranceCode.mmLifeInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceCode#PermanentDisabilityInsurance
 * InsuranceCode.mmPermanentDisabilityInsurance}</li>
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
 * <li>"LIFE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InsuranceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of insurance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InsuranceCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Life insurance
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceCode
	 * InsuranceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LifeInsurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Life insurance"</li>
	 * </ul>
	 */
	public static final InsuranceCode LifeInsurance = new InsuranceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LifeInsurance";
			definition = "Life insurance";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceCode.mmObject();
			codeName = "LIFE";
		}
	};
	/**
	 * Permanent disability insurance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceCode
	 * InsuranceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PermanentDisabilityInsurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Permanent disability insurance."</li>
	 * </ul>
	 */
	public static final InsuranceCode PermanentDisabilityInsurance = new InsuranceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PermanentDisabilityInsurance";
			definition = "Permanent disability insurance.";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceCode.mmObject();
			codeName = "PDIS";
		}
	};
	final static private LinkedHashMap<String, InsuranceCode> codesByName = new LinkedHashMap<>();

	protected InsuranceCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("LIFE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InsuranceCode";
				definition = "Specifies the type of insurance.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InsuranceCode.LifeInsurance, com.tools20022.repository.codeset.InsuranceCode.PermanentDisabilityInsurance);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LifeInsurance.getCodeName().get(), LifeInsurance);
		codesByName.put(PermanentDisabilityInsurance.getCodeName().get(), PermanentDisabilityInsurance);
	}

	public static InsuranceCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InsuranceCode[] values() {
		InsuranceCode[] values = new InsuranceCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InsuranceCode> {
		@Override
		public InsuranceCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InsuranceCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}