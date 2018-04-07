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
import com.tools20022.repository.codeset.BalanceTransferWindowCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the processing window in which the balance transfer will be
 * processed on the switch date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTransferWindowCode#OutOfHours
 * BalanceTransferWindowCode.OutOfHours}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTransferWindowCode#InHours
 * BalanceTransferWindowCode.InHours}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTransferWindow1Code
 * BalanceTransferWindow1Code}</li>
 * </ul>
 * </li>
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
 * "BalanceTransferWindowCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the processing window in which the balance transfer will be processed on the switch date."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BalanceTransferWindowCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates out of business hours processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTransferWindowCode
	 * BalanceTransferWindowCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EARL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfHours"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates out of business hours processing."</li>
	 * </ul>
	 */
	public static final BalanceTransferWindowCode OutOfHours = new BalanceTransferWindowCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfHours";
			definition = "Indicates out of business hours processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceTransferWindowCode.mmObject();
			codeName = "EARL";
		}
	};
	/**
	 * Indicates in business hours processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTransferWindowCode
	 * BalanceTransferWindowCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DAYH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InHours"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates in business hours processing."</li>
	 * </ul>
	 */
	public static final BalanceTransferWindowCode InHours = new BalanceTransferWindowCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InHours";
			definition = "Indicates in business hours processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceTransferWindowCode.mmObject();
			codeName = "DAYH";
		}
	};
	final static private LinkedHashMap<String, BalanceTransferWindowCode> codesByName = new LinkedHashMap<>();

	protected BalanceTransferWindowCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceTransferWindowCode";
				definition = "Specifies the processing window in which the balance transfer will be processed on the switch date.";
				derivation_lazy = () -> Arrays.asList(BalanceTransferWindow1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceTransferWindowCode.OutOfHours, com.tools20022.repository.codeset.BalanceTransferWindowCode.InHours);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OutOfHours.getCodeName().get(), OutOfHours);
		codesByName.put(InHours.getCodeName().get(), InHours);
	}

	public static BalanceTransferWindowCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BalanceTransferWindowCode[] values() {
		BalanceTransferWindowCode[] values = new BalanceTransferWindowCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BalanceTransferWindowCode> {
		@Override
		public BalanceTransferWindowCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BalanceTransferWindowCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}