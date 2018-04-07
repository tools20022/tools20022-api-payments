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
import com.tools20022.repository.codeset.BusinessDayConvention1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates how a date is adjusted when it falls on a non-business day.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessDayConvention1Code#Following
 * BusinessDayConvention1Code.Following}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessDayConvention1Code#Preceding
 * BusinessDayConvention1Code.Preceding}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BusinessDayConventionCode
 * BusinessDayConventionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FWNG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessDayConvention1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates how a date is adjusted when it falls on a non-business day."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BusinessDayConvention1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessDayConvention1Code
	 * BusinessDayConvention1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Following"</li>
	 * </ul>
	 */
	public static final BusinessDayConvention1Code Following = new BusinessDayConvention1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Following";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessDayConvention1Code.mmObject();
			codeName = BusinessDayConventionCode.Following.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessDayConvention1Code
	 * BusinessDayConvention1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Preceding"</li>
	 * </ul>
	 */
	public static final BusinessDayConvention1Code Preceding = new BusinessDayConvention1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Preceding";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessDayConvention1Code.mmObject();
			codeName = BusinessDayConventionCode.Preceding.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BusinessDayConvention1Code> codesByName = new LinkedHashMap<>();

	protected BusinessDayConvention1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FWNG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessDayConvention1Code";
				definition = "Indicates how a date is adjusted when it falls on a non-business day.";
				trace_lazy = () -> BusinessDayConventionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BusinessDayConvention1Code.Following, com.tools20022.repository.codeset.BusinessDayConvention1Code.Preceding);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Following.getCodeName().get(), Following);
		codesByName.put(Preceding.getCodeName().get(), Preceding);
	}

	public static BusinessDayConvention1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BusinessDayConvention1Code[] values() {
		BusinessDayConvention1Code[] values = new BusinessDayConvention1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BusinessDayConvention1Code> {
		@Override
		public BusinessDayConvention1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BusinessDayConvention1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}