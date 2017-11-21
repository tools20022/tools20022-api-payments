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
 * Indicates the status of a single payment transaction or of a group of payment
 * transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#mmAcceptedTechnicalValidation
 * PaymentStatusCode.mmAcceptedTechnicalValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#mmReceived
 * PaymentStatusCode.mmReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#mmPartiallyAccepted
 * PaymentStatusCode.mmPartiallyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#mmRejected
 * PaymentStatusCode.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#mmPending
 * PaymentStatusCode.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#mmAcceptedCustomerProfile
 * PaymentStatusCode.mmAcceptedCustomerProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#mmAcceptedSettlementInProcess
 * PaymentStatusCode.mmAcceptedSettlementInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#mmAcceptedSettlementCompleted
 * PaymentStatusCode.mmAcceptedSettlementCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#mmAccepted
 * PaymentStatusCode.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#mmAcceptedCancellationRequest
 * PaymentStatusCode.mmAcceptedCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#mmRejectedCancellationRequest
 * PaymentStatusCode.mmRejectedCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#mmAcceptedWithChange
 * PaymentStatusCode.mmAcceptedWithChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#mmPartiallyAcceptedCancellationRequest
 * PaymentStatusCode.mmPartiallyAcceptedCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#mmPendingCancellationRequest
 * PaymentStatusCode.mmPendingCancellationRequest}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code
 * TransactionIndividualStatus1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GroupCancellationStatus1Code
 * GroupCancellationStatus1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationIndividualStatus1Code
 * CancellationIndividualStatus1Code}</li>
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
 * <li>"ACTC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the status of a single payment transaction or of a group of payment transactions."
 * </li>
 * </ul>
 */
public class PaymentStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Authentication and syntactical and semantical validation are successful.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedTechnicalValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Authentication and syntactical and semantical validation are successful."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcceptedTechnicalValidation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedTechnicalValidation";
			definition = "Authentication and syntactical and semantical validation are successful.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "ACTC";
		}
	};
	/**
	 * Payment initiation has been received by the receiving agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCVD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment initiation has been received by the receiving agent."</li>
	 * </ul>
	 */
	public static final MMCode mmReceived = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Received";
			definition = "Payment initiation has been received by the receiving agent.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "RCVD";
		}
	};
	/**
	 * A number of transactions have been accepted, whereas another number of
	 * transactions have not yet achieved 'accepted' status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A number of transactions have been accepted, whereas another number of transactions have not yet achieved 'accepted' status."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartiallyAccepted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartiallyAccepted";
			definition = "A number of transactions have been accepted, whereas another number of transactions have not yet achieved 'accepted' status.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Payment initiation or individual transaction included in the payment
	 * initiation has been rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment initiation or individual transaction included in the payment initiation has been rejected."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRejected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Payment initiation or individual transaction included in the payment initiation has been rejected.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Payment initiation or individual transaction included in the payment
	 * initiation is pending. Further checks and status update will be
	 * performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment initiation or individual transaction included in the payment initiation is pending.  Further checks and status update will be performed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Payment initiation or individual transaction included in the payment initiation is pending.  Further checks and status update will be performed.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Preceding check of technical validation was successful. Customer profile
	 * check was also successful.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedCustomerProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Preceding check of technical validation was successful. Customer profile check was also successful."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcceptedCustomerProfile = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedCustomerProfile";
			definition = "Preceding check of technical validation was successful. Customer profile check was also successful.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "ACCP";
		}
	};
	/**
	 * All preceding checks such as technical validation and customer profile
	 * were successful and therefore the payment initiation has been accepted
	 * for execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedSettlementInProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All preceding checks such as technical validation and customer profile were successful and therefore the payment initiation has been accepted for execution."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcceptedSettlementInProcess = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedSettlementInProcess";
			definition = "All preceding checks such as technical validation and customer profile were successful and therefore the payment initiation has been accepted for execution.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "ACSP";
		}
	};
	/**
	 * Settlement on the debtor's account has been completed.
	 * 
	 * Usage : this can be used by the first agent to report to the debtor that
	 * the transaction has been completed. Warning : this status is provided for
	 * transaction status reasons, not for financial information. It can only be
	 * used after bilateral agreement
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedSettlementCompleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement on the debtor's account has been completed. \n\nUsage : this can be used by the first agent to report to the debtor that the transaction has been completed. Warning : this status is provided for transaction status reasons, not for financial information. It can only be used after bilateral agreement"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcceptedSettlementCompleted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedSettlementCompleted";
			definition = "Settlement on the debtor's account has been completed. \n\nUsage : this can be used by the first agent to report to the debtor that the transaction has been completed. Warning : this status is provided for transaction status reasons, not for financial information. It can only be used after bilateral agreement";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "ACSC";
		}
	};
	/**
	 * Request is accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request is accepted."</li>
	 * </ul>
	 */
	public static final MMCode mmAccepted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Request is accepted.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "ACPT";
		}
	};
	/**
	 * Cancellation is accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedCancellationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation is accepted."</li>
	 * </ul>
	 */
	public static final MMCode mmAcceptedCancellationRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedCancellationRequest";
			definition = "Cancellation is accepted.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "ACCR";
		}
	};
	/**
	 * Cancellation request is rejected
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedCancellationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation request is rejected"</li>
	 * </ul>
	 */
	public static final MMCode mmRejectedCancellationRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedCancellationRequest";
			definition = "Cancellation request is rejected";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "RJCR";
		}
	};
	/**
	 * Instruction is accepted but a change will be made, such as date or
	 * remittance not sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACWC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedWithChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is accepted but a change will be made, such as date or remittance not sent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcceptedWithChange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedWithChange";
			definition = "Instruction is accepted but a change will be made, such as date or remittance not sent.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "ACWC";
		}
	};
	/**
	 * Cancellation is partially accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyAcceptedCancellationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation is partially accepted."</li>
	 * </ul>
	 */
	public static final MMCode mmPartiallyAcceptedCancellationRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartiallyAcceptedCancellationRequest";
			definition = "Cancellation is partially accepted.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "PACR";
		}
	};
	/**
	 * Cancellation request is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation request is pending."</li>
	 * </ul>
	 */
	public static final MMCode mmPendingCancellationRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingCancellationRequest";
			definition = "Cancellation request is pending.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "PDCR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACTC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentStatusCode";
				definition = "Indicates the status of a single payment transaction or of a group of payment transactions.";
				code_lazy = () -> Arrays.asList(PaymentStatusCode.mmAcceptedTechnicalValidation, PaymentStatusCode.mmReceived, PaymentStatusCode.mmPartiallyAccepted, PaymentStatusCode.mmRejected, PaymentStatusCode.mmPending,
						PaymentStatusCode.mmAcceptedCustomerProfile, PaymentStatusCode.mmAcceptedSettlementInProcess, PaymentStatusCode.mmAcceptedSettlementCompleted, PaymentStatusCode.mmAccepted,
						PaymentStatusCode.mmAcceptedCancellationRequest, PaymentStatusCode.mmRejectedCancellationRequest, PaymentStatusCode.mmAcceptedWithChange, PaymentStatusCode.mmPartiallyAcceptedCancellationRequest,
						PaymentStatusCode.mmPendingCancellationRequest);
				derivation_lazy = () -> Arrays.asList(TransactionIndividualStatus1Code.mmObject(), GroupCancellationStatus1Code.mmObject(), CancellationIndividualStatus1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}