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
 * Specifies the type of settlement advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode#UndertakingIssuance
 * SettlementAdviceTypeCode.UndertakingIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode#PaymentClaim
 * SettlementAdviceTypeCode.PaymentClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode#UndertakingAmendment
 * SettlementAdviceTypeCode.UndertakingAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode#Termination
 * SettlementAdviceTypeCode.Termination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode#ManualChargesBooking
 * SettlementAdviceTypeCode.ManualChargesBooking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode#AutomaticChargesBooking
 * SettlementAdviceTypeCode.AutomaticChargesBooking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode#Refund
 * SettlementAdviceTypeCode.Refund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode#CorrespondentBankCharges
 * SettlementAdviceTypeCode.CorrespondentBankCharges}</li>
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
 * <li>"ISSU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementAdviceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of settlement advice."</li>
 * </ul>
 */
public class SettlementAdviceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement advice related to an undertaking issuance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode
	 * SettlementAdviceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIssuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement advice related to an undertaking issuance."</li>
	 * </ul>
	 */
	public static final MMCode UndertakingIssuance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuance";
			definition = "Settlement advice related to an undertaking issuance.";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * Settlement advice related to a claim for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode
	 * SettlementAdviceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement advice related to a claim for payment."</li>
	 * </ul>
	 */
	public static final MMCode PaymentClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentClaim";
			definition = "Settlement advice related to a claim for payment.";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "CLAM";
		}
	};
	/**
	 * Settlement advice related to an undertaking amendment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode
	 * SettlementAdviceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement advice related to an undertaking amendment."</li>
	 * </ul>
	 */
	public static final MMCode UndertakingAmendment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmendment";
			definition = "Settlement advice related to an undertaking amendment.";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "AMND";
		}
	};
	/**
	 * Settlement advice related to an undertaking termination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode
	 * SettlementAdviceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Termination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement advice related to an undertaking termination."</li>
	 * </ul>
	 */
	public static final MMCode Termination = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Termination";
			definition = "Settlement advice related to an undertaking termination.";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * Settlement advice related to a manual booking of charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode
	 * SettlementAdviceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCHG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualChargesBooking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement advice related to a manual booking of charges."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ManualChargesBooking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualChargesBooking";
			definition = "Settlement advice related to a manual booking of charges.";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "MCHG";
		}
	};
	/**
	 * Settlement advice related to an automatic booking of charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode
	 * SettlementAdviceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACHG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticChargesBooking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement advice related to an automatic booking of charges."</li>
	 * </ul>
	 */
	public static final MMCode AutomaticChargesBooking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticChargesBooking";
			definition = "Settlement advice related to an automatic booking of charges.";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "ACHG";
		}
	};
	/**
	 * Settlement advice related to a refund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode
	 * SettlementAdviceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement advice related to a refund. "</li>
	 * </ul>
	 */
	public static final MMCode Refund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refund";
			definition = "Settlement advice related to a refund. ";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "REFD";
		}
	};
	/**
	 * Settlement advice related to correspondent bank charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode
	 * SettlementAdviceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement advice related to correspondent bank charges. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode CorrespondentBankCharges = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankCharges";
			definition = "Settlement advice related to correspondent bank charges. ";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "CORP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ISSU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementAdviceTypeCode";
				definition = "Specifies the type of settlement advice.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementAdviceTypeCode.UndertakingIssuance, com.tools20022.repository.codeset.SettlementAdviceTypeCode.PaymentClaim,
						com.tools20022.repository.codeset.SettlementAdviceTypeCode.UndertakingAmendment, com.tools20022.repository.codeset.SettlementAdviceTypeCode.Termination,
						com.tools20022.repository.codeset.SettlementAdviceTypeCode.ManualChargesBooking, com.tools20022.repository.codeset.SettlementAdviceTypeCode.AutomaticChargesBooking,
						com.tools20022.repository.codeset.SettlementAdviceTypeCode.Refund, com.tools20022.repository.codeset.SettlementAdviceTypeCode.CorrespondentBankCharges);
			}
		});
		return mmObject_lazy.get();
	}
}