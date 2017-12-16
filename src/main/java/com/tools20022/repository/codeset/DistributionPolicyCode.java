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
import com.tools20022.repository.codeset.DistributionPolicyCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if income is to be paid out (distributed) or retained
 * (accumulated).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionPolicyCode#Distribution
 * DistributionPolicyCode.mmDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionPolicyCode#Accumulation
 * DistributionPolicyCode.mmAccumulation}</li>
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
 * <li>"DIST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DistributionPolicyCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if income is to be paid out (distributed) or retained (accumulated)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DistributionPolicyCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Income is distributed to the investors in the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicyCode
	 * DistributionPolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income is distributed to the investors in the fund."</li>
	 * </ul>
	 */
	public static final DistributionPolicyCode Distribution = new DistributionPolicyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Income is distributed to the investors in the fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionPolicyCode.mmObject();
			codeName = "DIST";
		}
	};
	/**
	 * Income is added to the capital of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicyCode
	 * DistributionPolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accumulation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income is added to the capital of the fund."</li>
	 * </ul>
	 */
	public static final DistributionPolicyCode Accumulation = new DistributionPolicyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Accumulation";
			definition = "Income is added to the capital of the fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionPolicyCode.mmObject();
			codeName = "ACCU";
		}
	};
	final static private LinkedHashMap<String, DistributionPolicyCode> codesByName = new LinkedHashMap<>();

	protected DistributionPolicyCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DIST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DistributionPolicyCode";
				definition = "Specifies if income is to be paid out (distributed) or retained (accumulated).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DistributionPolicyCode.Distribution, com.tools20022.repository.codeset.DistributionPolicyCode.Accumulation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Distribution.getCodeName().get(), Distribution);
		codesByName.put(Accumulation.getCodeName().get(), Accumulation);
	}

	public static DistributionPolicyCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DistributionPolicyCode[] values() {
		DistributionPolicyCode[] values = new DistributionPolicyCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DistributionPolicyCode> {
		@Override
		public DistributionPolicyCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DistributionPolicyCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}