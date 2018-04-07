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
import com.tools20022.repository.codeset.ExternalAgentInstructionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies further instructions for the agent concerning the processing of an
 * instruction.<br>
 * External code sets can be downloaded from www.iso20022.org.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode#PayTheBeneficiary
 * ExternalAgentInstructionCode.PayTheBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode#TimeTill
 * ExternalAgentInstructionCode.TimeTill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode#TimeFrom
 * ExternalAgentInstructionCode.TimeFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode#PayCreditorByCheque
 * ExternalAgentInstructionCode.PayCreditorByCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode#HoldCashForCreditor
 * ExternalAgentInstructionCode.HoldCashForCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode#PhoneBeneficiary
 * ExternalAgentInstructionCode.PhoneBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode#Telecom
 * ExternalAgentInstructionCode.Telecom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode#PhoneNextAgent
 * ExternalAgentInstructionCode.PhoneNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode#TelecomNextAgent
 * ExternalAgentInstructionCode.TelecomNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode#InquiryReason
 * ExternalAgentInstructionCode.InquiryReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstruction1Code
 * ExternalAgentInstruction1Code}</li>
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
 * "ExternalAgentInstructionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies further instructions for the agent concerning the processing of an instruction.\r\nExternal code sets can be downloaded from www.iso20022.org."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExternalAgentInstructionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (Ultimate) creditor to be paid only after verification of identity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode
	 * ExternalAgentInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PBEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayTheBeneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(Ultimate) creditor to be paid only after verification of identity."</li>
	 * </ul>
	 */
	public static final ExternalAgentInstructionCode PayTheBeneficiary = new ExternalAgentInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayTheBeneficiary";
			definition = "(Ultimate) creditor to be paid only after verification of identity.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExternalAgentInstructionCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode
	 * ExternalAgentInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TTIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeTill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instruction is valid and eligible for execution until the date and time stipulated. Otherwise, the payment instruction will be rejected."
	 * </li>
	 * </ul>
	 */
	public static final ExternalAgentInstructionCode TimeTill = new ExternalAgentInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeTill";
			definition = "Payment instruction is valid and eligible for execution until the date and time stipulated. Otherwise, the payment instruction will be rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExternalAgentInstructionCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode
	 * ExternalAgentInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFRO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instruction will be valid and eligible for execution from the date and time stipulated."
	 * </li>
	 * </ul>
	 */
	public static final ExternalAgentInstructionCode TimeFrom = new ExternalAgentInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeFrom";
			definition = "Payment instruction will be valid and eligible for execution from the date and time stipulated.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExternalAgentInstructionCode.mmObject();
			codeName = "TFRO";
		}
	};
	/**
	 * (Ultimate) creditor must be paid by cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode
	 * ExternalAgentInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHQB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayCreditorByCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "(Ultimate) creditor must be paid by cheque."</li>
	 * </ul>
	 */
	public static final ExternalAgentInstructionCode PayCreditorByCheque = new ExternalAgentInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayCreditorByCheque";
			definition = "(Ultimate) creditor must be paid by cheque.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExternalAgentInstructionCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode
	 * ExternalAgentInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldCashForCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money must be held for the (ultimate) creditor, who will call. Pay on identification."
	 * </li>
	 * </ul>
	 */
	public static final ExternalAgentInstructionCode HoldCashForCreditor = new ExternalAgentInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldCashForCreditor";
			definition = "Amount of money must be held for the (ultimate) creditor, who will call. Pay on identification.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExternalAgentInstructionCode.mmObject();
			codeName = "HOLD";
		}
	};
	/**
	 * Please advise/contact (ultimate) creditor/claimant by phone.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode
	 * ExternalAgentInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneBeneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Please advise/contact (ultimate) creditor/claimant by phone."</li>
	 * </ul>
	 */
	public static final ExternalAgentInstructionCode PhoneBeneficiary = new ExternalAgentInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneBeneficiary";
			definition = "Please advise/contact (ultimate) creditor/claimant by phone.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExternalAgentInstructionCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode
	 * ExternalAgentInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TELB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Telecom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Please advise/contact (ultimate) creditor/claimant by the most efficient means of telecommunication."
	 * </li>
	 * </ul>
	 */
	public static final ExternalAgentInstructionCode Telecom = new ExternalAgentInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Telecom";
			definition = "Please advise/contact (ultimate) creditor/claimant by the most efficient means of telecommunication.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExternalAgentInstructionCode.mmObject();
			codeName = "TELB";
		}
	};
	/**
	 * Please advise/contact next agent by phone.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode
	 * ExternalAgentInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Please advise/contact next agent by phone."</li>
	 * </ul>
	 */
	public static final ExternalAgentInstructionCode PhoneNextAgent = new ExternalAgentInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneNextAgent";
			definition = "Please advise/contact next agent by phone.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExternalAgentInstructionCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode
	 * ExternalAgentInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TELA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelecomNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Please advise/contact next agent by the most efficient means of telecommunication."
	 * </li>
	 * </ul>
	 */
	public static final ExternalAgentInstructionCode TelecomNextAgent = new ExternalAgentInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelecomNextAgent";
			definition = "Please advise/contact next agent by the most efficient means of telecommunication.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExternalAgentInstructionCode.mmObject();
			codeName = "TELA";
		}
	};
	/**
	 * Additional Information to an inquiry reason must be provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstructionCode
	 * ExternalAgentInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INQR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InquiryReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional Information to an inquiry reason must be provided."</li>
	 * </ul>
	 */
	public static final ExternalAgentInstructionCode InquiryReason = new ExternalAgentInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InquiryReason";
			definition = "Additional Information to an inquiry reason must be provided.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExternalAgentInstructionCode.mmObject();
			codeName = "INQR";
		}
	};
	final static private LinkedHashMap<String, ExternalAgentInstructionCode> codesByName = new LinkedHashMap<>();

	protected ExternalAgentInstructionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PBEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExternalAgentInstructionCode";
				definition = "Specifies further instructions for the agent concerning the processing of an instruction.\r\nExternal code sets can be downloaded from www.iso20022.org.";
				derivation_lazy = () -> Arrays.asList(ExternalAgentInstruction1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExternalAgentInstructionCode.PayTheBeneficiary, com.tools20022.repository.codeset.ExternalAgentInstructionCode.TimeTill,
						com.tools20022.repository.codeset.ExternalAgentInstructionCode.TimeFrom, com.tools20022.repository.codeset.ExternalAgentInstructionCode.PayCreditorByCheque,
						com.tools20022.repository.codeset.ExternalAgentInstructionCode.HoldCashForCreditor, com.tools20022.repository.codeset.ExternalAgentInstructionCode.PhoneBeneficiary,
						com.tools20022.repository.codeset.ExternalAgentInstructionCode.Telecom, com.tools20022.repository.codeset.ExternalAgentInstructionCode.PhoneNextAgent,
						com.tools20022.repository.codeset.ExternalAgentInstructionCode.TelecomNextAgent, com.tools20022.repository.codeset.ExternalAgentInstructionCode.InquiryReason);
				minLength = 1;
				maxLength = 4;
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
		codesByName.put(InquiryReason.getCodeName().get(), InquiryReason);
	}

	public static ExternalAgentInstructionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExternalAgentInstructionCode[] values() {
		ExternalAgentInstructionCode[] values = new ExternalAgentInstructionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExternalAgentInstructionCode> {
		@Override
		public ExternalAgentInstructionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExternalAgentInstructionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}