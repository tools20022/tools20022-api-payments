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
 * Specifies the reason for requesting the cancellation of a payment
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode#DuplicatePayment
 * CancellationReasonCode.DuplicatePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode#IncorrectAgent
 * CancellationReasonCode.IncorrectAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode#IncorrectCurrency
 * CancellationReasonCode.IncorrectCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode#RequestedByCustomer
 * CancellationReasonCode.RequestedByCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode#UnduePayment
 * CancellationReasonCode.UnduePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode#SuspiciousPayment
 * CancellationReasonCode.SuspiciousPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode#InsufficientDebtorDetails
 * CancellationReasonCode.InsufficientDebtorDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode#InsufficientCreditorDetails
 * CancellationReasonCode.InsufficientCreditorDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode#CancelUponUnableToApply
 * CancellationReasonCode.CancelUponUnableToApply}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode#TechnicalProblem
 * CancellationReasonCode.TechnicalProblem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode#FraudulentOrigin
 * CancellationReasonCode.FraudulentOrigin}</li>
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
 * <li>"DUPL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancellationReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for requesting the cancellation of a payment instruction."
 * </li>
 * </ul>
 */
public class CancellationReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment is a duplicate of another payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DUPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicatePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment is a duplicate of another payment."</li>
	 * </ul>
	 */
	public static final MMCode DuplicatePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicatePayment";
			definition = "Payment is a duplicate of another payment.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "DUPL";
		}
	};
	/**
	 * Agent in the payment workflow is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent in the payment workflow is incorrect."</li>
	 * </ul>
	 */
	public static final MMCode IncorrectAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAgent";
			definition = "Agent in the payment workflow is incorrect.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "AGNT";
		}
	};
	/**
	 * Currency of the payment is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CURR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the payment is incorrect."</li>
	 * </ul>
	 */
	public static final MMCode IncorrectCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCurrency";
			definition = "Currency of the payment is incorrect.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * Cancellation requested by the Debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedByCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation requested by the Debtor."</li>
	 * </ul>
	 */
	public static final MMCode RequestedByCustomer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedByCustomer";
			definition = "Cancellation requested by the Debtor.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Payment is not justified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UPAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnduePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment is not justified."</li>
	 * </ul>
	 */
	public static final MMCode UnduePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnduePayment";
			definition = "Payment is not justified.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "UPAY";
		}
	};
	/**
	 * Payment is a suspicious payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspiciousPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment is a suspicious payment."</li>
	 * </ul>
	 */
	public static final MMCode SuspiciousPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspiciousPayment";
			definition = "Payment is a suspicious payment.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Insufficient or incoherent details about the debtor with respect to
	 * regulatory requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM23"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientDebtorDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insufficient or incoherent details about the debtor with respect to regulatory requirements."
	 * </li>
	 * </ul>
	 */
	public static final MMCode InsufficientDebtorDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientDebtorDetails";
			definition = "Insufficient or incoherent details about the debtor with respect to regulatory requirements.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "MM23";
		}
	};
	/**
	 * Insufficient or incoherent details about the creditor with respect to
	 * regulatory requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM24"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCreditorDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insufficient or incoherent details about the creditor with respect to regulatory requirements."
	 * </li>
	 * </ul>
	 */
	public static final MMCode InsufficientCreditorDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCreditorDetails";
			definition = "Insufficient or incoherent details about the creditor with respect to regulatory requirements.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "MM24";
		}
	};
	/**
	 * Cancellation requested because an investigation request has been received
	 * and no remediation is possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelUponUnableToApply"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation requested because an investigation request has been received and no remediation is possible."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CancelUponUnableToApply = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelUponUnableToApply";
			definition = "Cancellation requested because an investigation request has been received and no remediation is possible.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "CUTA";
		}
	};
	/**
	 * Cancellation requested following technical problems resulting in an
	 * erroneous transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TECH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalProblem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation requested following technical problems resulting in an erroneous transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode TechnicalProblem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalProblem";
			definition = "Cancellation requested following technical problems resulting in an erroneous transaction.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "TECH";
		}
	};
	/**
	 * Cancellation requested following a transaction that was originated
	 * fraudulently. The use of the FraudulentOrigin code should be governed by
	 * jurisdictions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FraudulentOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation requested following a transaction that was originated fraudulently. The use of the FraudulentOrigin code should be governed by jurisdictions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode FraudulentOrigin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FraudulentOrigin";
			definition = "Cancellation requested following a transaction that was originated fraudulently. The use of the FraudulentOrigin code should be governed by jurisdictions.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "FRAD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DUPL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CancellationReasonCode";
				definition = "Specifies the reason for requesting the cancellation of a payment instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationReasonCode.DuplicatePayment, com.tools20022.repository.codeset.CancellationReasonCode.IncorrectAgent,
						com.tools20022.repository.codeset.CancellationReasonCode.IncorrectCurrency, com.tools20022.repository.codeset.CancellationReasonCode.RequestedByCustomer,
						com.tools20022.repository.codeset.CancellationReasonCode.UnduePayment, com.tools20022.repository.codeset.CancellationReasonCode.SuspiciousPayment,
						com.tools20022.repository.codeset.CancellationReasonCode.InsufficientDebtorDetails, com.tools20022.repository.codeset.CancellationReasonCode.InsufficientCreditorDetails,
						com.tools20022.repository.codeset.CancellationReasonCode.CancelUponUnableToApply, com.tools20022.repository.codeset.CancellationReasonCode.TechnicalProblem,
						com.tools20022.repository.codeset.CancellationReasonCode.FraudulentOrigin);
			}
		});
		return mmObject_lazy.get();
	}
}