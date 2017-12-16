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
import com.tools20022.repository.codeset.InterestCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates which type of interest is applied to a balance left on an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InterestCode#IntraDay
 * InterestCode.mmIntraDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InterestCode#OverNight
 * InterestCode.mmOverNight}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InterestType1Code
 * InterestType1Code}</li>
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
 * <li>"INDY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates which type of interest is applied to a balance left on an account."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InterestCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * During or within a business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestCode InterestCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "During or within a business day."</li>
	 * </ul>
	 */
	public static final InterestCode IntraDay = new InterestCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntraDay";
			definition = "During or within a business day.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestCode.mmObject();
			codeName = "INDY";
		}
	};
	/**
	 * Period of time between the end of a business day and the start of the
	 * next business day (usually the day after).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestCode InterestCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVRN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverNight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period of time between the end of a business day and the start of the next business day (usually the day after)."
	 * </li>
	 * </ul>
	 */
	public static final InterestCode OverNight = new InterestCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverNight";
			definition = "Period of time between the end of a business day and the start of the next business day (usually the day after).";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestCode.mmObject();
			codeName = "OVRN";
		}
	};
	final static private LinkedHashMap<String, InterestCode> codesByName = new LinkedHashMap<>();

	protected InterestCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("INDY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestCode";
				definition = "Indicates which type of interest is applied to a balance left on an account.";
				derivation_lazy = () -> Arrays.asList(InterestType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InterestCode.IntraDay, com.tools20022.repository.codeset.InterestCode.OverNight);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IntraDay.getCodeName().get(), IntraDay);
		codesByName.put(OverNight.getCodeName().get(), OverNight);
	}

	public static InterestCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InterestCode[] values() {
		InterestCode[] values = new InterestCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InterestCode> {
		@Override
		public InterestCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InterestCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}