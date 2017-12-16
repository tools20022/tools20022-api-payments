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
import com.tools20022.repository.codeset.GovernanceIdentificationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the identification of the rules and laws governing the undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentificationCode#UniformRulesForDemandGuarantees
 * GovernanceIdentificationCode.mmUniformRulesForDemandGuarantees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentificationCode#InternationalStandbyPractices
 * GovernanceIdentificationCode.mmInternationalStandbyPractices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentificationCode#UniformCustomsAndPractice
 * GovernanceIdentificationCode.mmUniformCustomsAndPractice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentificationCode#None
 * GovernanceIdentificationCode.mmNone}</li>
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
 * <li>"URDG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GovernanceIdentificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the identification of the rules and laws governing the undertaking."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GovernanceIdentificationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The version of the ICC Uniform Rules For Demand Guarantees (URDG) as
	 * published by the International Chamber of Commerce (ICC) that is in
	 * effect on the date of issue of the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentificationCode
	 * GovernanceIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "URDG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniformRulesForDemandGuarantees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The version of the ICC Uniform Rules For Demand Guarantees (URDG) as published by the International Chamber of Commerce (ICC) that is in effect on the date of issue of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final GovernanceIdentificationCode UniformRulesForDemandGuarantees = new GovernanceIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniformRulesForDemandGuarantees";
			definition = "The version of the ICC Uniform Rules For Demand Guarantees (URDG) as published by the International Chamber of Commerce (ICC) that is in effect on the date of issue of the undertaking.";
			owner_lazy = () -> com.tools20022.repository.codeset.GovernanceIdentificationCode.mmObject();
			codeName = "URDG";
		}
	};
	/**
	 * The version of the International Standby Practices (ISP) that is in
	 * effect on the date of issue of the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentificationCode
	 * GovernanceIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternationalStandbyPractices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The version of the International Standby Practices (ISP) that is in effect on the date of issue of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final GovernanceIdentificationCode InternationalStandbyPractices = new GovernanceIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternationalStandbyPractices";
			definition = "The version of the International Standby Practices (ISP) that is in effect on the date of issue of the undertaking.";
			owner_lazy = () -> com.tools20022.repository.codeset.GovernanceIdentificationCode.mmObject();
			codeName = "ISPR";
		}
	};
	/**
	 * The version of the Uniform Customs and Practice for Documentary Credits
	 * (UCP) as published by the International Chamber of Commerce (ICC) that is
	 * in effect on the date of issue of the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentificationCode
	 * GovernanceIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniformCustomsAndPractice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The version of the Uniform Customs and Practice for Documentary Credits (UCP) as published by the International Chamber of Commerce (ICC) that is in effect on the date of issue of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final GovernanceIdentificationCode UniformCustomsAndPractice = new GovernanceIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniformCustomsAndPractice";
			definition = "The version of the Uniform Customs and Practice for Documentary Credits (UCP) as published by the International Chamber of Commerce (ICC) that is in effect on the date of issue of the undertaking.";
			owner_lazy = () -> com.tools20022.repository.codeset.GovernanceIdentificationCode.mmObject();
			codeName = "UCPR";
		}
	};
	/**
	 * No applicable rule set defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentificationCode
	 * GovernanceIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No applicable rule set defined."</li>
	 * </ul>
	 */
	public static final GovernanceIdentificationCode None = new GovernanceIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			definition = "No applicable rule set defined.";
			owner_lazy = () -> com.tools20022.repository.codeset.GovernanceIdentificationCode.mmObject();
			codeName = "NONE";
		}
	};
	final static private LinkedHashMap<String, GovernanceIdentificationCode> codesByName = new LinkedHashMap<>();

	protected GovernanceIdentificationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("URDG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GovernanceIdentificationCode";
				definition = "Specifies the identification of the rules and laws governing the undertaking.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GovernanceIdentificationCode.UniformRulesForDemandGuarantees, com.tools20022.repository.codeset.GovernanceIdentificationCode.InternationalStandbyPractices,
						com.tools20022.repository.codeset.GovernanceIdentificationCode.UniformCustomsAndPractice, com.tools20022.repository.codeset.GovernanceIdentificationCode.None);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UniformRulesForDemandGuarantees.getCodeName().get(), UniformRulesForDemandGuarantees);
		codesByName.put(InternationalStandbyPractices.getCodeName().get(), InternationalStandbyPractices);
		codesByName.put(UniformCustomsAndPractice.getCodeName().get(), UniformCustomsAndPractice);
		codesByName.put(None.getCodeName().get(), None);
	}

	public static GovernanceIdentificationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GovernanceIdentificationCode[] values() {
		GovernanceIdentificationCode[] values = new GovernanceIdentificationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GovernanceIdentificationCode> {
		@Override
		public GovernanceIdentificationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GovernanceIdentificationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}