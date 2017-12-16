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
import com.tools20022.repository.codeset.FloorLimitType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates whether the floor limit applies to credit, to debit or to both
 * credit and debit entries.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.FloorLimitType1Code#Credit
 * FloorLimitType1Code.mmCredit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FloorLimitType1Code#Debit
 * FloorLimitType1Code.mmDebit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FloorLimitType1Code#Both
 * FloorLimitType1Code.mmBoth}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FloorLimitTypeCode
 * FloorLimitTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CRED"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FloorLimitType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the floor limit applies to credit, to debit or to both credit and debit entries."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FloorLimitType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FloorLimitType1Code
	 * FloorLimitType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * </ul>
	 */
	public static final FloorLimitType1Code Credit = new FloorLimitType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			owner_lazy = () -> com.tools20022.repository.codeset.FloorLimitType1Code.mmObject();
			codeName = FloorLimitTypeCode.Credit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FloorLimitType1Code
	 * FloorLimitType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * </ul>
	 */
	public static final FloorLimitType1Code Debit = new FloorLimitType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debit";
			owner_lazy = () -> com.tools20022.repository.codeset.FloorLimitType1Code.mmObject();
			codeName = FloorLimitTypeCode.Debit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FloorLimitType1Code
	 * FloorLimitType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Both"</li>
	 * </ul>
	 */
	public static final FloorLimitType1Code Both = new FloorLimitType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Both";
			owner_lazy = () -> com.tools20022.repository.codeset.FloorLimitType1Code.mmObject();
			codeName = FloorLimitTypeCode.Both.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FloorLimitType1Code> codesByName = new LinkedHashMap<>();

	protected FloorLimitType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CRED");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FloorLimitType1Code";
				definition = "Indicates whether the floor limit applies to credit, to debit or to both credit and debit entries.";
				trace_lazy = () -> FloorLimitTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FloorLimitType1Code.Credit, com.tools20022.repository.codeset.FloorLimitType1Code.Debit, com.tools20022.repository.codeset.FloorLimitType1Code.Both);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Credit.getCodeName().get(), Credit);
		codesByName.put(Debit.getCodeName().get(), Debit);
		codesByName.put(Both.getCodeName().get(), Both);
	}

	public static FloorLimitType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FloorLimitType1Code[] values() {
		FloorLimitType1Code[] values = new FloorLimitType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FloorLimitType1Code> {
		@Override
		public FloorLimitType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FloorLimitType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}