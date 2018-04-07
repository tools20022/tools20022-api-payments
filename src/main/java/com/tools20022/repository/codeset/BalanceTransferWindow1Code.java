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
import com.tools20022.repository.codeset.BalanceTransferWindow1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.BalanceTransferWindow1Code#InHours
 * BalanceTransferWindow1Code.InHours}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTransferWindow1Code#OutOfHours
 * BalanceTransferWindow1Code.OutOfHours}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BalanceTransferWindowCode
 * BalanceTransferWindowCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceTransferWindow1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the processing window in which the balance transfer will be processed on the switch date."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BalanceTransferWindow1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTransferWindow1Code
	 * BalanceTransferWindow1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InHours"</li>
	 * </ul>
	 */
	public static final BalanceTransferWindow1Code InHours = new BalanceTransferWindow1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InHours";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceTransferWindow1Code.mmObject();
			codeName = BalanceTransferWindowCode.InHours.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTransferWindow1Code
	 * BalanceTransferWindow1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfHours"</li>
	 * </ul>
	 */
	public static final BalanceTransferWindow1Code OutOfHours = new BalanceTransferWindow1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfHours";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceTransferWindow1Code.mmObject();
			codeName = BalanceTransferWindowCode.OutOfHours.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BalanceTransferWindow1Code> codesByName = new LinkedHashMap<>();

	protected BalanceTransferWindow1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BalanceTransferWindow1Code";
				definition = "Specifies the processing window in which the balance transfer will be processed on the switch date.";
				trace_lazy = () -> BalanceTransferWindowCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceTransferWindow1Code.InHours, com.tools20022.repository.codeset.BalanceTransferWindow1Code.OutOfHours);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InHours.getCodeName().get(), InHours);
		codesByName.put(OutOfHours.getCodeName().get(), OutOfHours);
	}

	public static BalanceTransferWindow1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BalanceTransferWindow1Code[] values() {
		BalanceTransferWindow1Code[] values = new BalanceTransferWindow1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BalanceTransferWindow1Code> {
		@Override
		public BalanceTransferWindow1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BalanceTransferWindow1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}