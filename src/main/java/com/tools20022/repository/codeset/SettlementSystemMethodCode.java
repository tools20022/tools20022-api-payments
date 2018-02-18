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
import com.tools20022.repository.codeset.SettlementSystemMethodCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the settlement instruction is to be settled through the
 * default or the alternate settlement system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementSystemMethodCode#Default
 * SettlementSystemMethodCode.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementSystemMethodCode#Alternative
 * SettlementSystemMethodCode.Alternative}</li>
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
 * <li>"NSET"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementSystemMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementSystemMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settle through the default settlement system/method. If there is a
	 * standing instruction in place for settlement through the alternate
	 * settlement system/method, then this standing instruction is to be
	 * ignored.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementSystemMethodCode
	 * SettlementSystemMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settle through the default settlement system/method. If there is a standing instruction in place for settlement through the alternate settlement system/method, then this standing instruction is to be ignored."
	 * </li>
	 * </ul>
	 */
	public static final SettlementSystemMethodCode Default = new SettlementSystemMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Default";
			definition = "Settle through the default settlement system/method. If there is a standing instruction in place for settlement through the alternate settlement system/method, then this standing instruction is to be ignored.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementSystemMethodCode.mmObject();
			codeName = "NSET";
		}
	};
	/**
	 * Settle through the alternate settlement system/method. If there is a
	 * standing instruction in place for settlement through the default
	 * settlement system/method, then this standing instruction is to be
	 * ignored.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementSystemMethodCode
	 * SettlementSystemMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YSET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Alternative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settle through the alternate settlement system/method. If there is a standing instruction in place for settlement through the default settlement system/method, then this standing instruction is to be ignored."
	 * </li>
	 * </ul>
	 */
	public static final SettlementSystemMethodCode Alternative = new SettlementSystemMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Alternative";
			definition = "Settle through the alternate settlement system/method. If there is a standing instruction in place for settlement through the default settlement system/method, then this standing instruction is to be ignored.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementSystemMethodCode.mmObject();
			codeName = "YSET";
		}
	};
	final static private LinkedHashMap<String, SettlementSystemMethodCode> codesByName = new LinkedHashMap<>();

	protected SettlementSystemMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NSET");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementSystemMethodCode";
				definition = "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementSystemMethodCode.Default, com.tools20022.repository.codeset.SettlementSystemMethodCode.Alternative);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Default.getCodeName().get(), Default);
		codesByName.put(Alternative.getCodeName().get(), Alternative);
	}

	public static SettlementSystemMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementSystemMethodCode[] values() {
		SettlementSystemMethodCode[] values = new SettlementSystemMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementSystemMethodCode> {
		@Override
		public SettlementSystemMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementSystemMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}