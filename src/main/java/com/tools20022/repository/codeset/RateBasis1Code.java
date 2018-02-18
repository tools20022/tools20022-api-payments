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
import com.tools20022.repository.codeset.RateBasis1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a rate basis.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RateBasis1Code#Days
 * RateBasis1Code.Days}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateBasis1Code#Months
 * RateBasis1Code.Months}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateBasis1Code#Weeks
 * RateBasis1Code.Weeks}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateBasis1Code#Years
 * RateBasis1Code.Years}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RateBasisCode RateBasisCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RateBasis1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a rate basis."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RateBasis1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateBasis1Code
	 * RateBasis1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Days"</li>
	 * </ul>
	 */
	public static final RateBasis1Code Days = new RateBasis1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Days";
			owner_lazy = () -> com.tools20022.repository.codeset.RateBasis1Code.mmObject();
			codeName = RateBasisCode.Days.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateBasis1Code
	 * RateBasis1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Months"</li>
	 * </ul>
	 */
	public static final RateBasis1Code Months = new RateBasis1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Months";
			owner_lazy = () -> com.tools20022.repository.codeset.RateBasis1Code.mmObject();
			codeName = RateBasisCode.Months.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateBasis1Code
	 * RateBasis1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weeks"</li>
	 * </ul>
	 */
	public static final RateBasis1Code Weeks = new RateBasis1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weeks";
			owner_lazy = () -> com.tools20022.repository.codeset.RateBasis1Code.mmObject();
			codeName = RateBasisCode.Weeks.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateBasis1Code
	 * RateBasis1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Years"</li>
	 * </ul>
	 */
	public static final RateBasis1Code Years = new RateBasis1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Years";
			owner_lazy = () -> com.tools20022.repository.codeset.RateBasis1Code.mmObject();
			codeName = RateBasisCode.Years.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RateBasis1Code> codesByName = new LinkedHashMap<>();

	protected RateBasis1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateBasis1Code";
				definition = "Specifies a rate basis.";
				trace_lazy = () -> RateBasisCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RateBasis1Code.Days, com.tools20022.repository.codeset.RateBasis1Code.Months, com.tools20022.repository.codeset.RateBasis1Code.Weeks,
						com.tools20022.repository.codeset.RateBasis1Code.Years);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Days.getCodeName().get(), Days);
		codesByName.put(Months.getCodeName().get(), Months);
		codesByName.put(Weeks.getCodeName().get(), Weeks);
		codesByName.put(Years.getCodeName().get(), Years);
	}

	public static RateBasis1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RateBasis1Code[] values() {
		RateBasis1Code[] values = new RateBasis1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RateBasis1Code> {
		@Override
		public RateBasis1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RateBasis1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}