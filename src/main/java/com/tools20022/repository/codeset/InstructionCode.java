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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
public class InstructionCode {

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
	public static final MMCode PayTheBeneficiary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PayTheBeneficiary";
			definition = "(Ultimate) creditor to be paid only after verification of identity.";
			owner_lazy = () -> InstructionCode.mmObject();
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
	public static final MMCode TimeTill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TimeTill";
			definition = "Payment instruction is valid and eligible for execution until the date and time stipulated. Otherwise, the payment instruction will be rejected.";
			owner_lazy = () -> InstructionCode.mmObject();
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
	public static final MMCode TimeFrom = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TimeFrom";
			definition = "Payment instruction will be valid and eligible for execution from the date and time stipulated.";
			owner_lazy = () -> InstructionCode.mmObject();
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
	public static final MMCode PayCreditorByCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PayCreditorByCheque";
			definition = "(Ultimate) creditor must be paid by cheque.";
			owner_lazy = () -> InstructionCode.mmObject();
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
	public static final MMCode HoldCashForCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldCashForCreditor";
			definition = "Amount of money must be held for the (ultimate) creditor, who will call. Pay on identification.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "HOLD";
		}
	};
	/**
	 * Please advise/contact (ultimate) creditor/claimant by phone
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
	 * "Please advise/contact (ultimate) creditor/claimant by phone"</li>
	 * </ul>
	 */
	public static final MMCode PhoneBeneficiary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhoneBeneficiary";
			definition = "Please advise/contact (ultimate) creditor/claimant by phone";
			owner_lazy = () -> InstructionCode.mmObject();
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
	public static final MMCode Telecom = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Telecom";
			definition = "Please advise/contact (ultimate) creditor/claimant by the most efficient means of telecommunication.";
			owner_lazy = () -> InstructionCode.mmObject();
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
	public static final MMCode PhoneNextAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhoneNextAgent";
			definition = "Please advise/contact next agent by phone.";
			owner_lazy = () -> InstructionCode.mmObject();
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
	public static final MMCode TelecomNextAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TelecomNextAgent";
			definition = "Please advise/contact next agent by the most efficient means of telecommunication.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "TELA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PBEN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstructionCode";
				definition = "Specifies further instructions concerning the processing of a payment instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionCode.PayTheBeneficiary, com.tools20022.repository.codeset.InstructionCode.TimeTill, com.tools20022.repository.codeset.InstructionCode.TimeFrom,
						com.tools20022.repository.codeset.InstructionCode.PayCreditorByCheque, com.tools20022.repository.codeset.InstructionCode.HoldCashForCreditor, com.tools20022.repository.codeset.InstructionCode.PhoneBeneficiary,
						com.tools20022.repository.codeset.InstructionCode.Telecom, com.tools20022.repository.codeset.InstructionCode.PhoneNextAgent, com.tools20022.repository.codeset.InstructionCode.TelecomNextAgent);
				derivation_lazy = () -> Arrays.asList(Instruction3Code.mmObject(), Instruction4Code.mmObject(), Instruction5Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}