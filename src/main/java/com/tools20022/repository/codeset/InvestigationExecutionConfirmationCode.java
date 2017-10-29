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
 * Indicates the result of an investigation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#CancelledAsPerRequest
 * InvestigationExecutionConfirmationCode.CancelledAsPerRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#ModifiedAsPerRequest
 * InvestigationExecutionConfirmationCode.ModifiedAsPerRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#AcceptedDebitAuthorisation
 * InvestigationExecutionConfirmationCode.AcceptedDebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#PaymentInitiated
 * InvestigationExecutionConfirmationCode.PaymentInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#CoverInitiated
 * InvestigationExecutionConfirmationCode.CoverInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#CoverModified
 * InvestigationExecutionConfirmationCode.CoverModified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#PaymentInstructionInitiated
 * InvestigationExecutionConfirmationCode.PaymentInstructionInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#AdditionalInformationSent
 * InvestigationExecutionConfirmationCode.AdditionalInformationSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#ConfirmationOfPayment
 * InvestigationExecutionConfirmationCode.ConfirmationOfPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#CancellationWillFollow
 * InvestigationExecutionConfirmationCode.CancellationWillFollow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#ModificationWillFollow
 * InvestigationExecutionConfirmationCode.ModificationWillFollow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#UnableToApplyWillFollow
 * InvestigationExecutionConfirmationCode.UnableToApplyWillFollow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#PartiallyExecutedCancellationRequest
 * InvestigationExecutionConfirmationCode.PartiallyExecutedCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#RejectedCancellationRequest
 * InvestigationExecutionConfirmationCode.RejectedCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#PendingCancellationRequest
 * InvestigationExecutionConfirmationCode.PendingCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#StatementEntryCorrect
 * InvestigationExecutionConfirmationCode.StatementEntryCorrect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#StatementEntryIncorrect
 * InvestigationExecutionConfirmationCode.StatementEntryIncorrect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#ChargesDetailsProvided
 * InvestigationExecutionConfirmationCode.ChargesDetailsProvided}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#PurposeDetailsProvided
 * InvestigationExecutionConfirmationCode.PurposeDetailsProvided}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode#InstructionIsDuplicate
 * InvestigationExecutionConfirmationCode.InstructionIsDuplicate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
 * InvestigationExecutionConfirmation3Code}</li>
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
 * <li>"CNCL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestigationExecutionConfirmationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the result of an investigation."</li>
 * </ul>
 */
public class InvestigationExecutionConfirmationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Used when a requested cancellation is successful.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledAsPerRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used when a requested cancellation is successful."</li>
	 * </ul>
	 */
	public static final MMCode CancelledAsPerRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledAsPerRequest";
			definition = "Used when a requested cancellation is successful.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "CNCL";
		}
	};
	/**
	 * Used when a requested modification is successful.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedAsPerRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used when a requested modification is successful."</li>
	 * </ul>
	 */
	public static final MMCode ModifiedAsPerRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedAsPerRequest";
			definition = "Used when a requested modification is successful.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "MODI";
		}
	};
	/**
	 * Used when a creditor accepts the debit authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedDebitAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used when a creditor accepts the debit authorisation."</li>
	 * </ul>
	 */
	public static final MMCode AcceptedDebitAuthorisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedDebitAuthorisation";
			definition = "Used when a creditor accepts the debit authorisation.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "ACDA";
		}
	};
	/**
	 * Used when the result of an investigation is, or will be, the initiation
	 * of a payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInitiated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when the result of an investigation is, or will be, the initiation of a payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PaymentInitiated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInitiated";
			definition = "Used when the result of an investigation is, or will be, the initiation of a payment instruction.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "IPAY";
		}
	};
	/**
	 * Used when a transfer of funds has been initiated (a cover payment) to
	 * resolve a case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICOV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverInitiated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when a transfer of funds has been initiated (a cover payment) to resolve a case."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CoverInitiated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverInitiated";
			definition = "Used when a transfer of funds has been initiated (a cover payment) to resolve a case.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "ICOV";
		}
	};
	/**
	 * Used when a transfer of funds has been modified (a cover payment) to
	 * resolve a case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCOV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverModified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when a transfer of funds has been modified (a cover payment) to resolve a case."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CoverModified = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverModified";
			definition = "Used when a transfer of funds has been modified (a cover payment) to resolve a case.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "MCOV";
		}
	};
	/**
	 * Used when a payment instruction (eg. MT103) has been initiated to resolve
	 * a case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPYI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionInitiated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when a payment instruction (eg. MT103) has been initiated to resolve a case."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PaymentInstructionInitiated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionInitiated";
			definition = "Used when a payment instruction (eg. MT103) has been initiated to resolve a case.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "IPYI";
		}
	};
	/**
	 * Used when additional information has been sent to the beneficiary of a
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationSent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when additional information has been sent to the beneficiary of a payment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AdditionalInformationSent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationSent";
			definition = "Used when additional information has been sent to the beneficiary of a payment.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "INFO";
		}
	};
	/**
	 * Used when a payment has been checked and was correctly executed without
	 * any intervention.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationOfPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when a payment has been checked and was correctly executed without any intervention."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ConfirmationOfPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationOfPayment";
			definition = "Used when a payment has been checked and was correctly executed without any intervention.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "CONF";
		}
	};
	/**
	 * Used when a payment will be cancelled to solve an investigation case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CWFW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationWillFollow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when a payment will be cancelled to solve an investigation case."</li>
	 * </ul>
	 */
	public static final MMCode CancellationWillFollow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationWillFollow";
			definition = "Used when a payment will be cancelled to solve an investigation case.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "CWFW";
		}
	};
	/**
	 * Used when the payment will be modified to solve an investigation case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MWFW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationWillFollow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when the payment will be modified to solve an investigation case."</li>
	 * </ul>
	 */
	public static final MMCode ModificationWillFollow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationWillFollow";
			definition = "Used when the payment will be modified to solve an investigation case.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "MWFW";
		}
	};
	/**
	 * Used when sender wants to respond to an assignment with an Unable To
	 * Apply workflow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UWFW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToApplyWillFollow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when sender wants to respond to an assignment with an Unable To Apply workflow."
	 * </li>
	 * </ul>
	 */
	public static final MMCode UnableToApplyWillFollow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToApplyWillFollow";
			definition = "Used when sender wants to respond to an assignment with an Unable To Apply workflow.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "UWFW";
		}
	};
	/**
	 * Used when a requested cancellation has been partially executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PECR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyExecutedCancellationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when a requested cancellation has been partially executed."</li>
	 * </ul>
	 */
	public static final MMCode PartiallyExecutedCancellationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyExecutedCancellationRequest";
			definition = "Used when a requested cancellation has been partially executed.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "PECR";
		}
	};
	/**
	 * Used when a requested cancellation has been rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedCancellationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used when a requested cancellation has been rejected."</li>
	 * </ul>
	 */
	public static final MMCode RejectedCancellationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedCancellationRequest";
			definition = "Used when a requested cancellation has been rejected.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "RJCR";
		}
	};
	/**
	 * Used when a requested cancellation is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used when a requested cancellation is pending."</li>
	 * </ul>
	 */
	public static final MMCode PendingCancellationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellationRequest";
			definition = "Used when a requested cancellation is pending.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "PDCR";
		}
	};
	/**
	 * Used when the entry in the statement is correct.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementEntryCorrect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used when the entry in the statement is correct."</li>
	 * </ul>
	 */
	public static final MMCode StatementEntryCorrect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementEntryCorrect";
			definition = "Used when the entry in the statement is correct.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "SMTC";
		}
	};
	/**
	 * Used when the entry in the statement is incorrect and further information
	 * is provided with the resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementEntryIncorrect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when the entry in the statement is incorrect and further information is provided with the resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMCode StatementEntryIncorrect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementEntryIncorrect";
			definition = "Used when the entry in the statement is incorrect and further information is provided with the resolution.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "SMTI";
		}
	};
	/**
	 * Further charges details are provided to resolve the case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesDetailsProvided"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further charges details are provided to resolve the case."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ChargesDetailsProvided = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesDetailsProvided";
			definition = "Further charges details are provided to resolve the case.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "CHRG";
		}
	};
	/**
	 * Further purpose details are provided to resolve the case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PURP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurposeDetailsProvided"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further purpose details are provided to resolve the case."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PurposeDetailsProvided = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurposeDetailsProvided";
			definition = "Further purpose details are provided to resolve the case.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "PURP";
		}
	};
	/**
	 * Used when the requested check for a possible duplicate instruction is
	 * confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIsDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when the requested check for a possible duplicate instruction is confirmed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode InstructionIsDuplicate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIsDuplicate";
			definition = "Used when the requested check for a possible duplicate instruction is confirmed.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "IDUP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CNCL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestigationExecutionConfirmationCode";
				definition = "Indicates the result of an investigation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.CancelledAsPerRequest, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.ModifiedAsPerRequest,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.AcceptedDebitAuthorisation, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.PaymentInitiated,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.CoverInitiated, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.CoverModified,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.PaymentInstructionInitiated, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.AdditionalInformationSent,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.ConfirmationOfPayment, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.CancellationWillFollow,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.ModificationWillFollow, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.UnableToApplyWillFollow,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.PartiallyExecutedCancellationRequest, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.RejectedCancellationRequest,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.PendingCancellationRequest, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.StatementEntryCorrect,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.StatementEntryIncorrect, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.ChargesDetailsProvided,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.PurposeDetailsProvided, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.InstructionIsDuplicate);
				derivation_lazy = () -> Arrays.asList(InvestigationExecutionConfirmation3Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}