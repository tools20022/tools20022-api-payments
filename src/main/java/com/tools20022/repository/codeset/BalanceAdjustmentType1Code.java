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
import com.tools20022.repository.codeset.BalanceAdjustmentType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the type of allowed balance adjustment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentType1Code#Ledger
 * BalanceAdjustmentType1Code.Ledger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentType1Code#Float
 * BalanceAdjustmentType1Code.Float}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentType1Code#Collected
 * BalanceAdjustmentType1Code.Collected}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentTypeCode
 * BalanceAdjustmentTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"LDGR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceAdjustmentType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the type of allowed balance adjustment."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BalanceAdjustmentType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentType1Code
	 * BalanceAdjustmentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ledger"</li>
	 * </ul>
	 */
	public static final BalanceAdjustmentType1Code Ledger = new BalanceAdjustmentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ledger";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceAdjustmentType1Code.mmObject();
			codeName = BalanceAdjustmentTypeCode.Ledger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentType1Code
	 * BalanceAdjustmentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Float"</li>
	 * </ul>
	 */
	public static final BalanceAdjustmentType1Code Float = new BalanceAdjustmentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Float";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceAdjustmentType1Code.mmObject();
			codeName = BalanceAdjustmentTypeCode.Float.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentType1Code
	 * BalanceAdjustmentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collected"</li>
	 * </ul>
	 */
	public static final BalanceAdjustmentType1Code Collected = new BalanceAdjustmentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collected";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceAdjustmentType1Code.mmObject();
			codeName = BalanceAdjustmentTypeCode.Collected.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BalanceAdjustmentType1Code> codesByName = new LinkedHashMap<>();

	protected BalanceAdjustmentType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LDGR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceAdjustmentType1Code";
				definition = "Defines the type of allowed balance adjustment.";
				trace_lazy = () -> BalanceAdjustmentTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceAdjustmentType1Code.Ledger, com.tools20022.repository.codeset.BalanceAdjustmentType1Code.Float,
						com.tools20022.repository.codeset.BalanceAdjustmentType1Code.Collected);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Ledger.getCodeName().get(), Ledger);
		codesByName.put(Float.getCodeName().get(), Float);
		codesByName.put(Collected.getCodeName().get(), Collected);
	}

	public static BalanceAdjustmentType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BalanceAdjustmentType1Code[] values() {
		BalanceAdjustmentType1Code[] values = new BalanceAdjustmentType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BalanceAdjustmentType1Code> {
		@Override
		public BalanceAdjustmentType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BalanceAdjustmentType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}