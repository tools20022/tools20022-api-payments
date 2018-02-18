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
import com.tools20022.repository.codeset.Instruction4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies further instructions concerning the processing of a payment
 * instruction, provided by the sending clearing agent to the next agent(s).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Instruction4Code#PhoneNextAgent
 * Instruction4Code.PhoneNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Instruction4Code#TelecomNextAgent
 * Instruction4Code.TelecomNextAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InstructionCode
 * InstructionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PHOA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Instruction4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies further instructions concerning the processing of a payment instruction, provided by the sending clearing agent to the next agent(s)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Instruction4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction4Code
	 * Instruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneNextAgent"</li>
	 * </ul>
	 */
	public static final Instruction4Code PhoneNextAgent = new Instruction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneNextAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.Instruction4Code.mmObject();
			codeName = InstructionCode.PhoneNextAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction4Code
	 * Instruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelecomNextAgent"</li>
	 * </ul>
	 */
	public static final Instruction4Code TelecomNextAgent = new Instruction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelecomNextAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.Instruction4Code.mmObject();
			codeName = InstructionCode.TelecomNextAgent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Instruction4Code> codesByName = new LinkedHashMap<>();

	protected Instruction4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PHOA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Instruction4Code";
				definition = "Specifies further instructions concerning the processing of a payment instruction, provided by the sending clearing agent to the next agent(s).";
				trace_lazy = () -> InstructionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Instruction4Code.PhoneNextAgent, com.tools20022.repository.codeset.Instruction4Code.TelecomNextAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PhoneNextAgent.getCodeName().get(), PhoneNextAgent);
		codesByName.put(TelecomNextAgent.getCodeName().get(), TelecomNextAgent);
	}

	public static Instruction4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Instruction4Code[] values() {
		Instruction4Code[] values = new Instruction4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Instruction4Code> {
		@Override
		public Instruction4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Instruction4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}