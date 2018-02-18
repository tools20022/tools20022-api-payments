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
import com.tools20022.repository.codeset.PaymentStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the status of a single payment transaction or of a group of payment
 * transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#AcceptedTechnicalValidation
 * PaymentStatusCode.AcceptedTechnicalValidation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentStatusCode#Received
 * PaymentStatusCode.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#PartiallyAccepted
 * PaymentStatusCode.PartiallyAccepted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentStatusCode#Rejected
 * PaymentStatusCode.Rejected}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentStatusCode#Pending
 * PaymentStatusCode.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#AcceptedCustomerProfile
 * PaymentStatusCode.AcceptedCustomerProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#AcceptedSettlementInProcess
 * PaymentStatusCode.AcceptedSettlementInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#AcceptedSettlementCompleted
 * PaymentStatusCode.AcceptedSettlementCompleted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentStatusCode#Accepted
 * PaymentStatusCode.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#AcceptedCancellationRequest
 * PaymentStatusCode.AcceptedCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#RejectedCancellationRequest
 * PaymentStatusCode.RejectedCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#AcceptedWithChange
 * PaymentStatusCode.AcceptedWithChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#PartiallyAcceptedCancellationRequest
 * PaymentStatusCode.PartiallyAcceptedCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode#PendingCancellationRequest
 * PaymentStatusCode.PendingCancellationRequest}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentStatusCode extends MMCode {

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
	public static final PaymentStatusCode AcceptedTechnicalValidation = new PaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedTechnicalValidation";
			definition = "Authentication and syntactical and semantical validation are successful.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentStatusCode.mmObject();
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
	public static final PaymentStatusCode Received = new PaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Received";
			definition = "Payment initiation has been received by the receiving agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentStatusCode.mmObject();
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
	public static final PaymentStatusCode PartiallyAccepted = new PaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartiallyAccepted";
			definition = "A number of transactions have been accepted, whereas another number of transactions have not yet achieved 'accepted' status.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentStatusCode.mmObject();
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
	public static final PaymentStatusCode Rejected = new PaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Payment initiation or individual transaction included in the payment initiation has been rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentStatusCode.mmObject();
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
	public static final PaymentStatusCode Pending = new PaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Payment initiation or individual transaction included in the payment initiation is pending.  Further checks and status update will be performed.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentStatusCode.mmObject();
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
	public static final PaymentStatusCode AcceptedCustomerProfile = new PaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedCustomerProfile";
			definition = "Preceding check of technical validation was successful. Customer profile check was also successful.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentStatusCode.mmObject();
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
	public static final PaymentStatusCode AcceptedSettlementInProcess = new PaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedSettlementInProcess";
			definition = "All preceding checks such as technical validation and customer profile were successful and therefore the payment initiation has been accepted for execution.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentStatusCode.mmObject();
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
	public static final PaymentStatusCode AcceptedSettlementCompleted = new PaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedSettlementCompleted";
			definition = "Settlement on the debtor's account has been completed. \n\nUsage : this can be used by the first agent to report to the debtor that the transaction has been completed. Warning : this status is provided for transaction status reasons, not for financial information. It can only be used after bilateral agreement";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentStatusCode.mmObject();
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
	public static final PaymentStatusCode Accepted = new PaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Request is accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentStatusCode.mmObject();
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
	public static final PaymentStatusCode AcceptedCancellationRequest = new PaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedCancellationRequest";
			definition = "Cancellation is accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentStatusCode.mmObject();
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
	public static final PaymentStatusCode RejectedCancellationRequest = new PaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedCancellationRequest";
			definition = "Cancellation request is rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentStatusCode.mmObject();
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
	public static final PaymentStatusCode AcceptedWithChange = new PaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedWithChange";
			definition = "Instruction is accepted but a change will be made, such as date or remittance not sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentStatusCode.mmObject();
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
	public static final PaymentStatusCode PartiallyAcceptedCancellationRequest = new PaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartiallyAcceptedCancellationRequest";
			definition = "Cancellation is partially accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentStatusCode.mmObject();
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
	public static final PaymentStatusCode PendingCancellationRequest = new PaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingCancellationRequest";
			definition = "Cancellation request is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentStatusCode.mmObject();
			codeName = "PDCR";
		}
	};
	final static private LinkedHashMap<String, PaymentStatusCode> codesByName = new LinkedHashMap<>();

	protected PaymentStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentStatusCode";
				definition = "Indicates the status of a single payment transaction or of a group of payment transactions.";
				derivation_lazy = () -> Arrays.asList(TransactionIndividualStatus1Code.mmObject(), GroupCancellationStatus1Code.mmObject(), CancellationIndividualStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentStatusCode.AcceptedTechnicalValidation, com.tools20022.repository.codeset.PaymentStatusCode.Received,
						com.tools20022.repository.codeset.PaymentStatusCode.PartiallyAccepted, com.tools20022.repository.codeset.PaymentStatusCode.Rejected, com.tools20022.repository.codeset.PaymentStatusCode.Pending,
						com.tools20022.repository.codeset.PaymentStatusCode.AcceptedCustomerProfile, com.tools20022.repository.codeset.PaymentStatusCode.AcceptedSettlementInProcess,
						com.tools20022.repository.codeset.PaymentStatusCode.AcceptedSettlementCompleted, com.tools20022.repository.codeset.PaymentStatusCode.Accepted,
						com.tools20022.repository.codeset.PaymentStatusCode.AcceptedCancellationRequest, com.tools20022.repository.codeset.PaymentStatusCode.RejectedCancellationRequest,
						com.tools20022.repository.codeset.PaymentStatusCode.AcceptedWithChange, com.tools20022.repository.codeset.PaymentStatusCode.PartiallyAcceptedCancellationRequest,
						com.tools20022.repository.codeset.PaymentStatusCode.PendingCancellationRequest);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcceptedTechnicalValidation.getCodeName().get(), AcceptedTechnicalValidation);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(PartiallyAccepted.getCodeName().get(), PartiallyAccepted);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(AcceptedCustomerProfile.getCodeName().get(), AcceptedCustomerProfile);
		codesByName.put(AcceptedSettlementInProcess.getCodeName().get(), AcceptedSettlementInProcess);
		codesByName.put(AcceptedSettlementCompleted.getCodeName().get(), AcceptedSettlementCompleted);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(AcceptedCancellationRequest.getCodeName().get(), AcceptedCancellationRequest);
		codesByName.put(RejectedCancellationRequest.getCodeName().get(), RejectedCancellationRequest);
		codesByName.put(AcceptedWithChange.getCodeName().get(), AcceptedWithChange);
		codesByName.put(PartiallyAcceptedCancellationRequest.getCodeName().get(), PartiallyAcceptedCancellationRequest);
		codesByName.put(PendingCancellationRequest.getCodeName().get(), PendingCancellationRequest);
	}

	public static PaymentStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentStatusCode[] values() {
		PaymentStatusCode[] values = new PaymentStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentStatusCode> {
		@Override
		public PaymentStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}