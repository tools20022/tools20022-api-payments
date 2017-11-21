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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Returned when a request for cancellation cannot be executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode#mmLegalDecision
 * PaymentCancellationRejectionCode.mmLegalDecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode#mmAgentDecision
 * PaymentCancellationRejectionCode.mmAgentDecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode#mmCustomerDecision
 * PaymentCancellationRejectionCode.mmCustomerDecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode#mmAlreadyReturned
 * PaymentCancellationRejectionCode.mmAlreadyReturned}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode#mmNoAnswerFromCustomer
 * PaymentCancellationRejectionCode.mmNoAnswerFromCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode#mmNoOriginalTransactionReceived
 * PaymentCancellationRejectionCode.mmNoOriginalTransactionReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode#mmClosedAccountNumber
 * PaymentCancellationRejectionCode.mmClosedAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode#mmInsufficientFunds
 * PaymentCancellationRejectionCode.mmInsufficientFunds}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
 * PaymentCancellationRejection2Code}</li>
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
 * <li>"LEGL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentCancellationRejectionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Returned when a request for cancellation cannot be executed."</li>
 * </ul>
 */
public class PaymentCancellationRejectionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reported when the cancellation cannot be accepted because of regulatory
	 * rules.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode
	 * PaymentCancellationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEGL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalDecision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported when the cancellation cannot be accepted because of regulatory rules."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLegalDecision = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalDecision";
			definition = "Reported when the cancellation cannot be accepted because of regulatory rules.";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "LEGL";
		}
	};
	/**
	 * Reported when the cancellation cannot be accepted because of an agent
	 * refuses to cancel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode
	 * PaymentCancellationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentDecision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported when the cancellation cannot be accepted because of an agent refuses to cancel."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAgentDecision = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentDecision";
			definition = "Reported when the cancellation cannot be accepted because of an agent refuses to cancel.";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "AGNT";
		}
	};
	/**
	 * Reported when the cancellation cannot be accepted because of a customer
	 * decision (Creditor).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode
	 * PaymentCancellationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDecision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported when the cancellation cannot be accepted because of a customer decision (Creditor)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCustomerDecision = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDecision";
			definition = "Reported when the cancellation cannot be accepted because of a customer decision (Creditor).";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Cancellation not accepted as the transaction has already been returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode
	 * PaymentCancellationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlreadyReturned"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation not accepted as the transaction has already been returned."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAlreadyReturned = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlreadyReturned";
			definition = "Cancellation not accepted as the transaction has already been returned.";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "ARDT";
		}
	};
	/**
	 * No response from beneficiary (to the cancellation request).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode
	 * PaymentCancellationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAnswerFromCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "No response from beneficiary (to the cancellation request)."</li>
	 * </ul>
	 */
	public static final MMCode mmNoAnswerFromCustomer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAnswerFromCustomer";
			definition = "No response from beneficiary (to the cancellation request).";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "NOAS";
		}
	};
	/**
	 * Original transaction (subject to cancellation) never received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode
	 * PaymentCancellationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoOriginalTransactionReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original transaction (subject to cancellation) never received."</li>
	 * </ul>
	 */
	public static final MMCode mmNoOriginalTransactionReceived = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoOriginalTransactionReceived";
			definition = "Original transaction (subject to cancellation) never received.";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "NOOR";
		}
	};
	/**
	 * Account number specified has been closed on the receiver’s books.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode
	 * PaymentCancellationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AC04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account number specified has been closed on the receiver’s books."</li>
	 * </ul>
	 */
	public static final MMCode mmClosedAccountNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccountNumber";
			definition = "Account number specified has been closed on the receiver’s books.";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "AC04";
		}
	};
	/**
	 * Amount of funds available to cover specified message amount is
	 * insufficient.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode
	 * PaymentCancellationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AM04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of funds available to cover specified message amount is insufficient."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientFunds = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFunds";
			definition = "Amount of funds available to cover specified message amount is insufficient.";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "AM04";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("LEGL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCancellationRejectionCode";
				definition = "Returned when a request for cancellation cannot be executed.";
				code_lazy = () -> Arrays.asList(PaymentCancellationRejectionCode.mmLegalDecision, PaymentCancellationRejectionCode.mmAgentDecision, PaymentCancellationRejectionCode.mmCustomerDecision,
						PaymentCancellationRejectionCode.mmAlreadyReturned, PaymentCancellationRejectionCode.mmNoAnswerFromCustomer, PaymentCancellationRejectionCode.mmNoOriginalTransactionReceived,
						PaymentCancellationRejectionCode.mmClosedAccountNumber, PaymentCancellationRejectionCode.mmInsufficientFunds);
				derivation_lazy = () -> Arrays.asList(PaymentCancellationRejection2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}