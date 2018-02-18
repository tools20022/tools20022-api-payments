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
import com.tools20022.repository.codeset.DistributionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the proceeds of the event will be distributed on a rolling
 * basis rather than on a specific date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionTypeCode#RollingBasis
 * DistributionTypeCode.RollingBasis}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DistributionTypeCode#Final
 * DistributionTypeCode.Final}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionTypeCode#Interim
 * DistributionTypeCode.Interim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionTypeCode#Ongoing
 * DistributionTypeCode.Ongoing}</li>
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
 * <li>"ROLL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DistributionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the proceeds of the event will be distributed on a rolling basis rather than on a specific date."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DistributionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event will have a number of acceptance and payment dates until further
	 * announcement by the Issuer or its agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionTypeCode
	 * DistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ROLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RollingBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event will have a number of acceptance and payment dates until further announcement by the Issuer or its agent."
	 * </li>
	 * </ul>
	 */
	public static final DistributionTypeCode RollingBasis = new DistributionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RollingBasis";
			definition = "Event will have a number of acceptance and payment dates until further announcement by the Issuer or its agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionTypeCode.mmObject();
			codeName = "ROLL";
		}
	};
	/**
	 * Final payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionTypeCode
	 * DistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Final payment."</li>
	 * </ul>
	 */
	public static final DistributionTypeCode Final = new DistributionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			definition = "Final payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionTypeCode.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * Interim payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionTypeCode
	 * DistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interim payment."</li>
	 * </ul>
	 */
	public static final DistributionTypeCode Interim = new DistributionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			definition = "Interim payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionTypeCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Event is ongoing for acceptance on an unsolicited basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionTypeCode
	 * DistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONGO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ongoing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is ongoing for acceptance on an unsolicited basis."</li>
	 * </ul>
	 */
	public static final DistributionTypeCode Ongoing = new DistributionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ongoing";
			definition = "Event is ongoing for acceptance on an unsolicited basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionTypeCode.mmObject();
			codeName = "ONGO";
		}
	};
	final static private LinkedHashMap<String, DistributionTypeCode> codesByName = new LinkedHashMap<>();

	protected DistributionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ROLL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DistributionTypeCode";
				definition = "Specifies whether the proceeds of the event will be distributed on a rolling basis rather than on a specific date.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DistributionTypeCode.RollingBasis, com.tools20022.repository.codeset.DistributionTypeCode.Final,
						com.tools20022.repository.codeset.DistributionTypeCode.Interim, com.tools20022.repository.codeset.DistributionTypeCode.Ongoing);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RollingBasis.getCodeName().get(), RollingBasis);
		codesByName.put(Final.getCodeName().get(), Final);
		codesByName.put(Interim.getCodeName().get(), Interim);
		codesByName.put(Ongoing.getCodeName().get(), Ongoing);
	}

	public static DistributionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DistributionTypeCode[] values() {
		DistributionTypeCode[] values = new DistributionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DistributionTypeCode> {
		@Override
		public DistributionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DistributionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}