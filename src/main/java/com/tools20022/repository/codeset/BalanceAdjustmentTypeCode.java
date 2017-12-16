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
import com.tools20022.repository.codeset.BalanceAdjustmentTypeCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentTypeCode#Ledger
 * BalanceAdjustmentTypeCode.mmLedger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentTypeCode#Float
 * BalanceAdjustmentTypeCode.mmFloat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentTypeCode#Collected
 * BalanceAdjustmentTypeCode.mmCollected}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceAdjustmentType1Code
 * BalanceAdjustmentType1Code}</li>
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
 * <li>"LDGR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceAdjustmentTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the type of allowed balance adjustment."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BalanceAdjustmentTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Adjustment applies to the average ledger (book) balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentTypeCode
	 * BalanceAdjustmentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LDGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ledger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment applies to the average ledger (book) balance."</li>
	 * </ul>
	 */
	public static final BalanceAdjustmentTypeCode Ledger = new BalanceAdjustmentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ledger";
			definition = "Adjustment applies to the average ledger (book) balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceAdjustmentTypeCode.mmObject();
			codeName = "LDGR";
		}
	};
	/**
	 * Adjustment applies to the average float (unavailable) balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentTypeCode
	 * BalanceAdjustmentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLOT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Float"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment applies to the average float (unavailable) balance."</li>
	 * </ul>
	 */
	public static final BalanceAdjustmentTypeCode Float = new BalanceAdjustmentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Float";
			definition = "Adjustment applies to the average float (unavailable) balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceAdjustmentTypeCode.mmObject();
			codeName = "FLOT";
		}
	};
	/**
	 * Adjustment applies to the average collected (book less float) balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentTypeCode
	 * BalanceAdjustmentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment applies to the average collected (book less float) balance."</li>
	 * </ul>
	 */
	public static final BalanceAdjustmentTypeCode Collected = new BalanceAdjustmentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collected";
			definition = "Adjustment applies to the average collected (book less float) balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceAdjustmentTypeCode.mmObject();
			codeName = "CLLD";
		}
	};
	final static private LinkedHashMap<String, BalanceAdjustmentTypeCode> codesByName = new LinkedHashMap<>();

	protected BalanceAdjustmentTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("LDGR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceAdjustmentTypeCode";
				definition = "Defines the type of allowed balance adjustment.";
				derivation_lazy = () -> Arrays.asList(BalanceAdjustmentType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceAdjustmentTypeCode.Ledger, com.tools20022.repository.codeset.BalanceAdjustmentTypeCode.Float,
						com.tools20022.repository.codeset.BalanceAdjustmentTypeCode.Collected);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Ledger.getCodeName().get(), Ledger);
		codesByName.put(Float.getCodeName().get(), Float);
		codesByName.put(Collected.getCodeName().get(), Collected);
	}

	public static BalanceAdjustmentTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BalanceAdjustmentTypeCode[] values() {
		BalanceAdjustmentTypeCode[] values = new BalanceAdjustmentTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BalanceAdjustmentTypeCode> {
		@Override
		public BalanceAdjustmentTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BalanceAdjustmentTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}