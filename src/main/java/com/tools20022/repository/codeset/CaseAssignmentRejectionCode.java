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
 * Specifies the reason for not accepting a Case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode#UnderlyingPaymentNotFound
 * CaseAssignmentRejectionCode.UnderlyingPaymentNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode#NotAuthorisedToInvestigate
 * CaseAssignmentRejectionCode.NotAuthorisedToInvestigate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode#UnknownCase
 * CaseAssignmentRejectionCode.UnknownCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode#PaymentRejected
 * CaseAssignmentRejectionCode.PaymentRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode#PaymentCancelled
 * CaseAssignmentRejectionCode.PaymentCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode#PaymentPreviouslyCancelledOrRejected
 * CaseAssignmentRejectionCode.PaymentPreviouslyCancelledOrRejected}</li>
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
 * <li>"NFND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CaseAssignmentRejectionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for not accepting a Case."</li>
 * </ul>
 */
public class CaseAssignmentRejectionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Underlying instruction can not be found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
	 * CaseAssignmentRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NFND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingPaymentNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying instruction can not be found."</li>
	 * </ul>
	 */
	public static final MMCode UnderlyingPaymentNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingPaymentNotFound";
			definition = "Underlying instruction can not be found.";
			owner_lazy = () -> CaseAssignmentRejectionCode.mmObject();
			codeName = "NFND";
		}
	};
	/**
	 * Case Assignee is not allowed to investigate on this instruction (eg. Case
	 * Assignee is not the next party in the payment chain).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
	 * CaseAssignmentRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAuthorisedToInvestigate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case Assignee is not allowed to investigate on this instruction (eg. Case Assignee is not the next party in the payment chain)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode NotAuthorisedToInvestigate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotAuthorisedToInvestigate";
			definition = "Case Assignee is not allowed to investigate on this instruction (eg. Case Assignee is not the next party in the payment chain).";
			owner_lazy = () -> CaseAssignmentRejectionCode.mmObject();
			codeName = "NAUT";
		}
	};
	/**
	 * Case has never been assigned before.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
	 * CaseAssignmentRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKNW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case has never been assigned before."</li>
	 * </ul>
	 */
	public static final MMCode UnknownCase = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnknownCase";
			definition = "Case has never been assigned before.";
			owner_lazy = () -> CaseAssignmentRejectionCode.mmObject();
			codeName = "UKNW";
		}
	};
	/**
	 * Used when the payment instruction has been rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
	 * CaseAssignmentRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used when the payment instruction has been rejected."</li>
	 * </ul>
	 */
	public static final MMCode PaymentRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentRejected";
			definition = "Used when the payment instruction has been rejected.";
			owner_lazy = () -> CaseAssignmentRejectionCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Used when the payment instruction has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
	 * CaseAssignmentRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used when the payment instruction has been cancelled."</li>
	 * </ul>
	 */
	public static final MMCode PaymentCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCancelled";
			definition = "Used when the payment instruction has been cancelled.";
			owner_lazy = () -> CaseAssignmentRejectionCode.mmObject();
			codeName = "CNCL";
		}
	};
	/**
	 * Used when the payment instruction has previously been cancelled or
	 * rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
	 * CaseAssignmentRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentPreviouslyCancelledOrRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when the payment instruction has previously been cancelled or rejected."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PaymentPreviouslyCancelledOrRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentPreviouslyCancelledOrRejected";
			definition = "Used when the payment instruction has previously been cancelled or rejected.";
			owner_lazy = () -> CaseAssignmentRejectionCode.mmObject();
			codeName = "PCOR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NFND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CaseAssignmentRejectionCode";
				definition = "Specifies the reason for not accepting a Case.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CaseAssignmentRejectionCode.UnderlyingPaymentNotFound, com.tools20022.repository.codeset.CaseAssignmentRejectionCode.NotAuthorisedToInvestigate,
						com.tools20022.repository.codeset.CaseAssignmentRejectionCode.UnknownCase, com.tools20022.repository.codeset.CaseAssignmentRejectionCode.PaymentRejected,
						com.tools20022.repository.codeset.CaseAssignmentRejectionCode.PaymentCancelled, com.tools20022.repository.codeset.CaseAssignmentRejectionCode.PaymentPreviouslyCancelledOrRejected);
			}
		});
		return mmObject_lazy.get();
	}
}