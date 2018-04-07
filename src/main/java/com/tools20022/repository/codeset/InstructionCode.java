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
import com.tools20022.repository.codeset.InstructionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies further instructions concerning the processing of a payment
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#PayTheBeneficiary
 * InstructionCode.PayTheBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InstructionCode#TimeTill
 * InstructionCode.TimeTill}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InstructionCode#TimeFrom
 * InstructionCode.TimeFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#PayCreditorByCheque
 * InstructionCode.PayCreditorByCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#HoldCashForCreditor
 * InstructionCode.HoldCashForCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#PhoneBeneficiary
 * InstructionCode.PhoneBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InstructionCode#Telecom
 * InstructionCode.Telecom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#PhoneNextAgent
 * InstructionCode.PhoneNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#TelecomNextAgent
 * InstructionCode.TelecomNextAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Instruction3Code
 * Instruction3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Instruction4Code
 * Instruction4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Instruction5Code
 * Instruction5Code}</li>
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
 * <li>"PBEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies further instructions concerning the processing of a payment instruction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstructionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (Ultimate) creditor to be paid only after verification of identity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PBEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayTheBeneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(Ultimate) creditor to be paid only after verification of identity."</li>
	 * </ul>
	 */
	public static final InstructionCode PayTheBeneficiary = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PayTheBeneficiary";
			definition = "(Ultimate) creditor to be paid only after verification of identity.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCode.mmObject();
			codeName = "PBEN";
		}
	};
	/**
	 * Payment instruction is valid and eligible for execution until the date
	 * and time stipulated. Otherwise, the payment instruction will be rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TTIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeTill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instruction is valid and eligible for execution until the date and time stipulated. Otherwise, the payment instruction will be rejected."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCode TimeTill = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeTill";
			definition = "Payment instruction is valid and eligible for execution until the date and time stipulated. Otherwise, the payment instruction will be rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCode.mmObject();
			codeName = "TTIL";
		}
	};
	/**
	 * Payment instruction will be valid and eligible for execution from the
	 * date and time stipulated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFRO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instruction will be valid and eligible for execution from the date and time stipulated."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCode TimeFrom = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeFrom";
			definition = "Payment instruction will be valid and eligible for execution from the date and time stipulated.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCode.mmObject();
			codeName = "TFRO";
		}
	};
	/**
	 * (Ultimate) creditor must be paid by cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHQB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayCreditorByCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "(Ultimate) creditor must be paid by cheque."</li>
	 * </ul>
	 */
	public static final InstructionCode PayCreditorByCheque = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PayCreditorByCheque";
			definition = "(Ultimate) creditor must be paid by cheque.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCode.mmObject();
			codeName = "CHQB";
		}
	};
	/**
	 * Amount of money must be held for the (ultimate) creditor, who will call.
	 * Pay on identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldCashForCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money must be held for the (ultimate) creditor, who will call. Pay on identification."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCode HoldCashForCreditor = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldCashForCreditor";
			definition = "Amount of money must be held for the (ultimate) creditor, who will call. Pay on identification.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCode.mmObject();
			codeName = "HOLD";
		}
	};
	/**
	 * Please advise/contact (ultimate) creditor/claimant by phone.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneBeneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Please advise/contact (ultimate) creditor/claimant by phone."</li>
	 * </ul>
	 */
	public static final InstructionCode PhoneBeneficiary = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhoneBeneficiary";
			definition = "Please advise/contact (ultimate) creditor/claimant by phone.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCode.mmObject();
			codeName = "PHOB";
		}
	};
	/**
	 * Please advise/contact (ultimate) creditor/claimant by the most efficient
	 * means of telecommunication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TELB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Telecom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Please advise/contact (ultimate) creditor/claimant by the most efficient means of telecommunication."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCode Telecom = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Telecom";
			definition = "Please advise/contact (ultimate) creditor/claimant by the most efficient means of telecommunication.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCode.mmObject();
			codeName = "TELB";
		}
	};
	/**
	 * Please advise/contact next agent by phone.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Please advise/contact next agent by phone."</li>
	 * </ul>
	 */
	public static final InstructionCode PhoneNextAgent = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhoneNextAgent";
			definition = "Please advise/contact next agent by phone.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCode.mmObject();
			codeName = "PHOA";
		}
	};
	/**
	 * Please advise/contact next agent by the most efficient means of
	 * telecommunication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TELA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelecomNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Please advise/contact next agent by the most efficient means of telecommunication."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCode TelecomNextAgent = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TelecomNextAgent";
			definition = "Please advise/contact next agent by the most efficient means of telecommunication.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCode.mmObject();
			codeName = "TELA";
		}
	};
	final static private LinkedHashMap<String, InstructionCode> codesByName = new LinkedHashMap<>();

	protected InstructionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PBEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionCode";
				definition = "Specifies further instructions concerning the processing of a payment instruction.";
				derivation_lazy = () -> Arrays.asList(Instruction3Code.mmObject(), Instruction4Code.mmObject(), Instruction5Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionCode.PayTheBeneficiary, com.tools20022.repository.codeset.InstructionCode.TimeTill, com.tools20022.repository.codeset.InstructionCode.TimeFrom,
						com.tools20022.repository.codeset.InstructionCode.PayCreditorByCheque, com.tools20022.repository.codeset.InstructionCode.HoldCashForCreditor, com.tools20022.repository.codeset.InstructionCode.PhoneBeneficiary,
						com.tools20022.repository.codeset.InstructionCode.Telecom, com.tools20022.repository.codeset.InstructionCode.PhoneNextAgent, com.tools20022.repository.codeset.InstructionCode.TelecomNextAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PayTheBeneficiary.getCodeName().get(), PayTheBeneficiary);
		codesByName.put(TimeTill.getCodeName().get(), TimeTill);
		codesByName.put(TimeFrom.getCodeName().get(), TimeFrom);
		codesByName.put(PayCreditorByCheque.getCodeName().get(), PayCreditorByCheque);
		codesByName.put(HoldCashForCreditor.getCodeName().get(), HoldCashForCreditor);
		codesByName.put(PhoneBeneficiary.getCodeName().get(), PhoneBeneficiary);
		codesByName.put(Telecom.getCodeName().get(), Telecom);
		codesByName.put(PhoneNextAgent.getCodeName().get(), PhoneNextAgent);
		codesByName.put(TelecomNextAgent.getCodeName().get(), TelecomNextAgent);
	}

	public static InstructionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstructionCode[] values() {
		InstructionCode[] values = new InstructionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstructionCode> {
		@Override
		public InstructionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstructionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}