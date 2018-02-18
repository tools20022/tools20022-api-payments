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
import com.tools20022.repository.codeset.FloorLimitTypeCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.FloorLimitTypeCode#Credit
 * FloorLimitTypeCode.Credit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FloorLimitTypeCode#Debit
 * FloorLimitTypeCode.Debit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FloorLimitTypeCode#Both
 * FloorLimitTypeCode.Both}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.FloorLimitType1Code
 * FloorLimitType1Code}</li>
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
 * <li>"CRED"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FloorLimitTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the floor limit applies to credit, to debit or to both credit and debit entries."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FloorLimitTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Floor limit applies to credit entries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FloorLimitTypeCode
	 * FloorLimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Floor limit applies to credit entries."</li>
	 * </ul>
	 */
	public static final FloorLimitTypeCode Credit = new FloorLimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Credit";
			definition = "Floor limit applies to credit entries.";
			owner_lazy = () -> com.tools20022.repository.codeset.FloorLimitTypeCode.mmObject();
			codeName = "CRED";
		}
	};
	/**
	 * Floor limit applies to debit entries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FloorLimitTypeCode
	 * FloorLimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Floor limit applies to debit entries."</li>
	 * </ul>
	 */
	public static final FloorLimitTypeCode Debit = new FloorLimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Debit";
			definition = "Floor limit applies to debit entries.";
			owner_lazy = () -> com.tools20022.repository.codeset.FloorLimitTypeCode.mmObject();
			codeName = "DEBT";
		}
	};
	/**
	 * Floor limit applies to both credit and debit entries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FloorLimitTypeCode
	 * FloorLimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Both"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Floor limit applies to both credit and debit entries."</li>
	 * </ul>
	 */
	public static final FloorLimitTypeCode Both = new FloorLimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Both";
			definition = "Floor limit applies to both credit and debit entries.";
			owner_lazy = () -> com.tools20022.repository.codeset.FloorLimitTypeCode.mmObject();
			codeName = "BOTH";
		}
	};
	final static private LinkedHashMap<String, FloorLimitTypeCode> codesByName = new LinkedHashMap<>();

	protected FloorLimitTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CRED");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FloorLimitTypeCode";
				definition = "Indicates whether the floor limit applies to credit, to debit or to both credit and debit entries.";
				derivation_lazy = () -> Arrays.asList(FloorLimitType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FloorLimitTypeCode.Credit, com.tools20022.repository.codeset.FloorLimitTypeCode.Debit, com.tools20022.repository.codeset.FloorLimitTypeCode.Both);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Credit.getCodeName().get(), Credit);
		codesByName.put(Debit.getCodeName().get(), Debit);
		codesByName.put(Both.getCodeName().get(), Both);
	}

	public static FloorLimitTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FloorLimitTypeCode[] values() {
		FloorLimitTypeCode[] values = new FloorLimitTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FloorLimitTypeCode> {
		@Override
		public FloorLimitTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FloorLimitTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}