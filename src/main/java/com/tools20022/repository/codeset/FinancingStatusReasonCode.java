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
 * Specifies the coded reason for the financing status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmCancellationRequestOutOfTime
 * FinancingStatusReasonCode.mmCancellationRequestOutOfTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmNoMatchingFinancingRequest
 * FinancingStatusReasonCode.mmNoMatchingFinancingRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmIncorrectAccountNumber
 * FinancingStatusReasonCode.mmIncorrectAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmClosedAccountNumber
 * FinancingStatusReasonCode.mmClosedAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmBlockedAccount
 * FinancingStatusReasonCode.mmBlockedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmUnrecognisedFinancingRequestor
 * FinancingStatusReasonCode.mmUnrecognisedFinancingRequestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmUnrecognisedIntermediaryAgent
 * FinancingStatusReasonCode.mmUnrecognisedIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmUnexpectedIntermediaryAgent
 * FinancingStatusReasonCode.mmUnexpectedIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmUnrecognisedParty
 * FinancingStatusReasonCode.mmUnrecognisedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmInvalidPaymentDueDate
 * FinancingStatusReasonCode.mmInvalidPaymentDueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmDuplicatedRequestMessage
 * FinancingStatusReasonCode.mmDuplicatedRequestMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmWrongIdentification
 * FinancingStatusReasonCode.mmWrongIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmInvalidDocumentNumber
 * FinancingStatusReasonCode.mmInvalidDocumentNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmMissingMandatoryInformation
 * FinancingStatusReasonCode.mmMissingMandatoryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmNarrative
 * FinancingStatusReasonCode.mmNarrative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode#mmFinancingProcessAlreadyInitiated
 * FinancingStatusReasonCode.mmFinancingProcessAlreadyInitiated}</li>
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
 * <li>"CA01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancingStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the coded reason for the financing status."</li>
 * </ul>
 */
public class FinancingStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation request message was received after the end of the financing
	 * process previously activated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CA01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestOutOfTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request message was received after the end of the financing process previously activated."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCancellationRequestOutOfTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestOutOfTime";
			definition = "Cancellation request message was received after the end of the financing process previously activated.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "CA01";
		}
	};
	/**
	 * Cancellation request does not match with an invoice financing request
	 * received previously.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CA02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchingFinancingRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request does not match with an invoice financing request received previously."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNoMatchingFinancingRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchingFinancingRequest";
			definition = "Cancellation request does not match with an invoice financing request received previously.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "CA02";
		}
	};
	/**
	 * Format of the account number specified is not correct.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AC01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format of the account number specified is not correct."</li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectAccountNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAccountNumber";
			definition = "Format of the account number specified is not correct.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "AC01";
		}
	};
	/**
	 * Account number specified has been closed on the Receiver's books.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
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
	 * "Account number specified has been closed on the Receiver's books."</li>
	 * </ul>
	 */
	public static final MMCode mmClosedAccountNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccountNumber";
			definition = "Account number specified has been closed on the Receiver's books.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "AC04";
		}
	};
	/**
	 * Account specified is blocked, prohibiting posting of transactions against
	 * it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AC06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account specified is blocked, prohibiting posting of transactions against it."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBlockedAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedAccount";
			definition = "Account specified is blocked, prohibiting posting of transactions against it.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "AC06";
		}
	};
	/**
	 * Party who sent the request message is not recognised by the first agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BE08"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedFinancingRequestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party who sent the request message is not recognised by the first agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnrecognisedFinancingRequestor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedFinancingRequestor";
			definition = "Party who sent the request message is not recognised by the first agent.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "BE08";
		}
	};
	/**
	 * Party who forwarded the request message is not recognised by the first
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BE09"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedIntermediaryAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party who forwarded the request message is not recognised by the first agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnrecognisedIntermediaryAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedIntermediaryAgent";
			definition = "Party who forwarded the request message is not recognised by the first agent.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "BE09";
		}
	};
	/**
	 * Financing Requestor is expected to send requests through a different
	 * Intermediary Agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BE10"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnexpectedIntermediaryAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financing Requestor is expected to send requests through a different Intermediary Agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnexpectedIntermediaryAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnexpectedIntermediaryAgent";
			definition = "Financing Requestor is expected to send requests through a different Intermediary Agent.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "BE10";
		}
	};
	/**
	 * Party is not recognised by the first agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BE11"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party is not recognised by the first agent."</li>
	 * </ul>
	 */
	public static final MMCode mmUnrecognisedParty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedParty";
			definition = "Party is not recognised by the first agent.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "BE11";
		}
	};
	/**
	 * PaymentDueDate is occurring before the request message creation date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DT02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPaymentDueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PaymentDueDate is occurring before the request message creation date."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidPaymentDueDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPaymentDueDate";
			definition = "PaymentDueDate is occurring before the request message creation date.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "DT02";
		}
	};
	/**
	 * Request message received appears to have been duplicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ID01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicatedRequestMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request message received appears to have been duplicated."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDuplicatedRequestMessage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicatedRequestMessage";
			definition = "Request message received appears to have been duplicated.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "ID01";
		}
	};
	/**
	 * Request message received appears to have a wrong identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ID02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request message received appears to have a wrong identification."</li>
	 * </ul>
	 */
	public static final MMCode mmWrongIdentification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongIdentification";
			definition = "Request message received appears to have a wrong identification.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "ID02";
		}
	};
	/**
	 * Document number is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ID03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDocumentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document number is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidDocumentNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDocumentNumber";
			definition = "Document number is invalid.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "ID03";
		}
	};
	/**
	 * Information bilateral agreed as mandatory is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MI01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingMandatoryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information bilateral agreed as mandatory is missing."</li>
	 * </ul>
	 */
	public static final MMCode mmMissingMandatoryInformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingMandatoryInformation";
			definition = "Information bilateral agreed as mandatory is missing.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "MI01";
		}
	};
	/**
	 * Reason is provided as narrative information in the additional reason
	 * information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NA01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Narrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason is provided as narrative information in the additional reason information."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNarrative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Narrative";
			definition = "Reason is provided as narrative information in the additional reason information.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "NA01";
		}
	};
	/**
	 * Cancellation request was correctly received but the financing process has
	 * already been initiated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CA03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingProcessAlreadyInitiated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request was correctly received but the financing process has already been initiated."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFinancingProcessAlreadyInitiated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingProcessAlreadyInitiated";
			definition = "Cancellation request was correctly received but the financing process has already been initiated.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "CA03";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CA01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancingStatusReasonCode";
				definition = "Specifies the coded reason for the financing status.";
				code_lazy = () -> Arrays.asList(FinancingStatusReasonCode.mmCancellationRequestOutOfTime, FinancingStatusReasonCode.mmNoMatchingFinancingRequest, FinancingStatusReasonCode.mmIncorrectAccountNumber,
						FinancingStatusReasonCode.mmClosedAccountNumber, FinancingStatusReasonCode.mmBlockedAccount, FinancingStatusReasonCode.mmUnrecognisedFinancingRequestor, FinancingStatusReasonCode.mmUnrecognisedIntermediaryAgent,
						FinancingStatusReasonCode.mmUnexpectedIntermediaryAgent, FinancingStatusReasonCode.mmUnrecognisedParty, FinancingStatusReasonCode.mmInvalidPaymentDueDate, FinancingStatusReasonCode.mmDuplicatedRequestMessage,
						FinancingStatusReasonCode.mmWrongIdentification, FinancingStatusReasonCode.mmInvalidDocumentNumber, FinancingStatusReasonCode.mmMissingMandatoryInformation, FinancingStatusReasonCode.mmNarrative,
						FinancingStatusReasonCode.mmFinancingProcessAlreadyInitiated);
			}
		});
		return mmObject_lazy.get();
	}
}