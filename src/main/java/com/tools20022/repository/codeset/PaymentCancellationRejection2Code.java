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
import com.tools20022.repository.codeset.PaymentCancellationRejectionCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Returned when a request for cancellation cannot be executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode
 * PaymentCancellationRejectionCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#LegalDecision
 * PaymentCancellationRejection2Code.LegalDecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#AgentDecision
 * PaymentCancellationRejection2Code.AgentDecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#CustomerDecision
 * PaymentCancellationRejection2Code.CustomerDecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#AlreadyReturned
 * PaymentCancellationRejection2Code.AlreadyReturned}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#NoAnswerFromCustomer
 * PaymentCancellationRejection2Code.NoAnswerFromCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#NoOriginalTransactionReceived
 * PaymentCancellationRejection2Code.NoOriginalTransactionReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#ClosedAccountNumber
 * PaymentCancellationRejection2Code.ClosedAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#InsufficientFunds
 * PaymentCancellationRejection2Code.InsufficientFunds}</li>
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
 * <li>"LEGL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentCancellationRejection2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Returned when a request for cancellation cannot be executed."</li>
 * </ul>
 */
public class PaymentCancellationRejection2Code extends PaymentCancellationRejectionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalDecision"</li>
	 * </ul>
	 */
	public static final MMCode LegalDecision = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalDecision";
			owner_lazy = () -> PaymentCancellationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentDecision"</li>
	 * </ul>
	 */
	public static final MMCode AgentDecision = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentDecision";
			owner_lazy = () -> PaymentCancellationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDecision"</li>
	 * </ul>
	 */
	public static final MMCode CustomerDecision = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDecision";
			owner_lazy = () -> PaymentCancellationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlreadyReturned"</li>
	 * </ul>
	 */
	public static final MMCode AlreadyReturned = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlreadyReturned";
			owner_lazy = () -> PaymentCancellationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAnswerFromCustomer"</li>
	 * </ul>
	 */
	public static final MMCode NoAnswerFromCustomer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAnswerFromCustomer";
			owner_lazy = () -> PaymentCancellationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoOriginalTransactionReceived"</li>
	 * </ul>
	 */
	public static final MMCode NoOriginalTransactionReceived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoOriginalTransactionReceived";
			owner_lazy = () -> PaymentCancellationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccountNumber"</li>
	 * </ul>
	 */
	public static final MMCode ClosedAccountNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccountNumber";
			owner_lazy = () -> PaymentCancellationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFunds"</li>
	 * </ul>
	 */
	public static final MMCode InsufficientFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFunds";
			owner_lazy = () -> PaymentCancellationRejection2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("LEGL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentCancellationRejection2Code";
				definition = "Returned when a request for cancellation cannot be executed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentCancellationRejection2Code.LegalDecision, com.tools20022.repository.codeset.PaymentCancellationRejection2Code.AgentDecision,
						com.tools20022.repository.codeset.PaymentCancellationRejection2Code.CustomerDecision, com.tools20022.repository.codeset.PaymentCancellationRejection2Code.AlreadyReturned,
						com.tools20022.repository.codeset.PaymentCancellationRejection2Code.NoAnswerFromCustomer, com.tools20022.repository.codeset.PaymentCancellationRejection2Code.NoOriginalTransactionReceived,
						com.tools20022.repository.codeset.PaymentCancellationRejection2Code.ClosedAccountNumber, com.tools20022.repository.codeset.PaymentCancellationRejection2Code.InsufficientFunds);
				trace_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}