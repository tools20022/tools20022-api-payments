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
import com.tools20022.repository.codeset.Instruction3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.Instruction3Code#PayCreditorByCheque
 * Instruction3Code.mmPayCreditorByCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Instruction3Code#HoldCashForCreditor
 * Instruction3Code.mmHoldCashForCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Instruction3Code#PhoneBeneficiary
 * Instruction3Code.mmPhoneBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Instruction3Code#Telecom
 * Instruction3Code.mmTelecom}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InstructionCode
 * InstructionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CHQB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Instruction3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies further instructions concerning the processing of a payment instruction, provided by the sending clearing agent to the next agent(s)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Instruction3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction3Code
	 * Instruction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayCreditorByCheque"</li>
	 * </ul>
	 */
	public static final Instruction3Code PayCreditorByCheque = new Instruction3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayCreditorByCheque";
			owner_lazy = () -> com.tools20022.repository.codeset.Instruction3Code.mmObject();
			codeName = InstructionCode.PayCreditorByCheque.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction3Code
	 * Instruction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldCashForCreditor"</li>
	 * </ul>
	 */
	public static final Instruction3Code HoldCashForCreditor = new Instruction3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldCashForCreditor";
			owner_lazy = () -> com.tools20022.repository.codeset.Instruction3Code.mmObject();
			codeName = InstructionCode.HoldCashForCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction3Code
	 * Instruction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneBeneficiary"</li>
	 * </ul>
	 */
	public static final Instruction3Code PhoneBeneficiary = new Instruction3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneBeneficiary";
			owner_lazy = () -> com.tools20022.repository.codeset.Instruction3Code.mmObject();
			codeName = InstructionCode.PhoneBeneficiary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction3Code
	 * Instruction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Telecom"</li>
	 * </ul>
	 */
	public static final Instruction3Code Telecom = new Instruction3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Telecom";
			owner_lazy = () -> com.tools20022.repository.codeset.Instruction3Code.mmObject();
			codeName = InstructionCode.Telecom.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Instruction3Code> codesByName = new LinkedHashMap<>();

	protected Instruction3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CHQB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Instruction3Code";
				definition = "Specifies further instructions concerning the processing of a payment instruction, provided by the sending clearing agent to the next agent(s).";
				trace_lazy = () -> InstructionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Instruction3Code.PayCreditorByCheque, com.tools20022.repository.codeset.Instruction3Code.HoldCashForCreditor,
						com.tools20022.repository.codeset.Instruction3Code.PhoneBeneficiary, com.tools20022.repository.codeset.Instruction3Code.Telecom);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PayCreditorByCheque.getCodeName().get(), PayCreditorByCheque);
		codesByName.put(HoldCashForCreditor.getCodeName().get(), HoldCashForCreditor);
		codesByName.put(PhoneBeneficiary.getCodeName().get(), PhoneBeneficiary);
		codesByName.put(Telecom.getCodeName().get(), Telecom);
	}

	public static Instruction3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Instruction3Code[] values() {
		Instruction3Code[] values = new Instruction3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Instruction3Code> {
		@Override
		public Instruction3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Instruction3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}