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
import com.tools20022.repository.codeset.AutoRoutingCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates whether an automatic routing system is involved.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AutoRoutingCode#DOTSystem
 * AutoRoutingCode.DOTSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AutoRoutingCode#SuperDOTSystem
 * AutoRoutingCode.SuperDOTSystem}</li>
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
 * <li>"DDOT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AutoRoutingCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates whether an automatic routing system is involved."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AutoRoutingCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates the Designated Order Turnaround system: computerized order
	 * routing system (used at the New York Stock Exchange) is to be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutoRoutingCode
	 * AutoRoutingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDOT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DOTSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the Designated Order Turnaround system: computerized order routing system (used at the New York Stock Exchange) is to be used."
	 * </li>
	 * </ul>
	 */
	public static final AutoRoutingCode DOTSystem = new AutoRoutingCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DOTSystem";
			definition = "Indicates the Designated Order Turnaround system: computerized order routing system (used at the New York Stock Exchange) is to be used.";
			owner_lazy = () -> com.tools20022.repository.codeset.AutoRoutingCode.mmObject();
			codeName = "DDOT";
		}
	};
	/**
	 * Indicates the evolution of the DOT system, a Designated Order Turnaround
	 * system: computerized order routing system (used at the New York Stock
	 * Exchange) is to be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutoRoutingCode
	 * AutoRoutingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDOT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuperDOTSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the evolution of the DOT system, a Designated Order Turnaround system: computerized order routing system (used at the New York Stock Exchange) is to be used."
	 * </li>
	 * </ul>
	 */
	public static final AutoRoutingCode SuperDOTSystem = new AutoRoutingCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuperDOTSystem";
			definition = "Indicates the evolution of the DOT system, a Designated Order Turnaround system: computerized order routing system (used at the New York Stock Exchange) is to be used.";
			owner_lazy = () -> com.tools20022.repository.codeset.AutoRoutingCode.mmObject();
			codeName = "SDOT";
		}
	};
	final static private LinkedHashMap<String, AutoRoutingCode> codesByName = new LinkedHashMap<>();

	protected AutoRoutingCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DDOT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AutoRoutingCode";
				definition = "Indicates whether an automatic routing system is involved.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AutoRoutingCode.DOTSystem, com.tools20022.repository.codeset.AutoRoutingCode.SuperDOTSystem);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DOTSystem.getCodeName().get(), DOTSystem);
		codesByName.put(SuperDOTSystem.getCodeName().get(), SuperDOTSystem);
	}

	public static AutoRoutingCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AutoRoutingCode[] values() {
		AutoRoutingCode[] values = new AutoRoutingCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AutoRoutingCode> {
		@Override
		public AutoRoutingCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AutoRoutingCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}