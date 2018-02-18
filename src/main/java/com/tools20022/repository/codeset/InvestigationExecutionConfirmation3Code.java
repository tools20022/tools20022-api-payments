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
import com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the result of an investigation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#CancelledAsPerRequest
 * InvestigationExecutionConfirmation3Code.CancelledAsPerRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#ModifiedAsPerRequest
 * InvestigationExecutionConfirmation3Code.ModifiedAsPerRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#PaymentInitiated
 * InvestigationExecutionConfirmation3Code.PaymentInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#CoverInitiated
 * InvestigationExecutionConfirmation3Code.CoverInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#CoverModified
 * InvestigationExecutionConfirmation3Code.CoverModified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#AdditionalInformationSent
 * InvestigationExecutionConfirmation3Code.AdditionalInformationSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#ConfirmationOfPayment
 * InvestigationExecutionConfirmation3Code.ConfirmationOfPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#CancellationWillFollow
 * InvestigationExecutionConfirmation3Code.CancellationWillFollow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#ModificationWillFollow
 * InvestigationExecutionConfirmation3Code.ModificationWillFollow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#UnableToApplyWillFollow
 * InvestigationExecutionConfirmation3Code.UnableToApplyWillFollow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#PartiallyExecutedCancellationRequest
 * InvestigationExecutionConfirmation3Code.PartiallyExecutedCancellationRequest}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#PendingCancellationRequest
 * InvestigationExecutionConfirmation3Code.PendingCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#RejectedCancellationRequest
 * InvestigationExecutionConfirmation3Code.RejectedCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#StatementEntryCorrect
 * InvestigationExecutionConfirmation3Code.StatementEntryCorrect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#StatementEntryIncorrect
 * InvestigationExecutionConfirmation3Code.StatementEntryIncorrect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#ChargesDetailsProvided
 * InvestigationExecutionConfirmation3Code.ChargesDetailsProvided}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#PurposeDetailsProvided
 * InvestigationExecutionConfirmation3Code.PurposeDetailsProvided}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code#InstructionIsDuplicate
 * InvestigationExecutionConfirmation3Code.InstructionIsDuplicate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
 * InvestigationExecutionConfirmationCode}</li>
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
 * "InvestigationExecutionConfirmation3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the result of an investigation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestigationExecutionConfirmation3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledAsPerRequest"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code CancelledAsPerRequest = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledAsPerRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.CancelledAsPerRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedAsPerRequest"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code ModifiedAsPerRequest = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedAsPerRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.ModifiedAsPerRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInitiated"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code PaymentInitiated = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInitiated";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.PaymentInitiated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverInitiated"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code CoverInitiated = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverInitiated";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.CoverInitiated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverModified"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code CoverModified = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverModified";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.CoverModified.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationSent"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code AdditionalInformationSent = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationSent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.AdditionalInformationSent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationOfPayment"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code ConfirmationOfPayment = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationOfPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.ConfirmationOfPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationWillFollow"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code CancellationWillFollow = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationWillFollow";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.CancellationWillFollow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationWillFollow"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code ModificationWillFollow = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationWillFollow";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.ModificationWillFollow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToApplyWillFollow"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code UnableToApplyWillFollow = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToApplyWillFollow";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.UnableToApplyWillFollow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyExecutedCancellationRequest"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code PartiallyExecutedCancellationRequest = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyExecutedCancellationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.PartiallyExecutedCancellationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellationRequest"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code PendingCancellationRequest = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.PendingCancellationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedCancellationRequest"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code RejectedCancellationRequest = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedCancellationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.RejectedCancellationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementEntryCorrect"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code StatementEntryCorrect = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementEntryCorrect";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.StatementEntryCorrect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementEntryIncorrect"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code StatementEntryIncorrect = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementEntryIncorrect";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.StatementEntryIncorrect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesDetailsProvided"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code ChargesDetailsProvided = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesDetailsProvided";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.ChargesDetailsProvided.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurposeDetailsProvided"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code PurposeDetailsProvided = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurposeDetailsProvided";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.PurposeDetailsProvided.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIsDuplicate"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation3Code InstructionIsDuplicate = new InvestigationExecutionConfirmation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIsDuplicate";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.InstructionIsDuplicate.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestigationExecutionConfirmation3Code> codesByName = new LinkedHashMap<>();

	protected InvestigationExecutionConfirmation3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CNCL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestigationExecutionConfirmation3Code";
				definition = "Specifies the result of an investigation.";
				trace_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.CancelledAsPerRequest,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.ModifiedAsPerRequest, com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.PaymentInitiated,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.CoverInitiated, com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.CoverModified,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.AdditionalInformationSent, com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.ConfirmationOfPayment,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.CancellationWillFollow, com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.ModificationWillFollow,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.UnableToApplyWillFollow, com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.PartiallyExecutedCancellationRequest,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.PendingCancellationRequest, com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.RejectedCancellationRequest,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.StatementEntryCorrect, com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.StatementEntryIncorrect,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.ChargesDetailsProvided, com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.PurposeDetailsProvided,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code.InstructionIsDuplicate);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancelledAsPerRequest.getCodeName().get(), CancelledAsPerRequest);
		codesByName.put(ModifiedAsPerRequest.getCodeName().get(), ModifiedAsPerRequest);
		codesByName.put(PaymentInitiated.getCodeName().get(), PaymentInitiated);
		codesByName.put(CoverInitiated.getCodeName().get(), CoverInitiated);
		codesByName.put(CoverModified.getCodeName().get(), CoverModified);
		codesByName.put(AdditionalInformationSent.getCodeName().get(), AdditionalInformationSent);
		codesByName.put(ConfirmationOfPayment.getCodeName().get(), ConfirmationOfPayment);
		codesByName.put(CancellationWillFollow.getCodeName().get(), CancellationWillFollow);
		codesByName.put(ModificationWillFollow.getCodeName().get(), ModificationWillFollow);
		codesByName.put(UnableToApplyWillFollow.getCodeName().get(), UnableToApplyWillFollow);
		codesByName.put(PartiallyExecutedCancellationRequest.getCodeName().get(), PartiallyExecutedCancellationRequest);
		codesByName.put(PendingCancellationRequest.getCodeName().get(), PendingCancellationRequest);
		codesByName.put(RejectedCancellationRequest.getCodeName().get(), RejectedCancellationRequest);
		codesByName.put(StatementEntryCorrect.getCodeName().get(), StatementEntryCorrect);
		codesByName.put(StatementEntryIncorrect.getCodeName().get(), StatementEntryIncorrect);
		codesByName.put(ChargesDetailsProvided.getCodeName().get(), ChargesDetailsProvided);
		codesByName.put(PurposeDetailsProvided.getCodeName().get(), PurposeDetailsProvided);
		codesByName.put(InstructionIsDuplicate.getCodeName().get(), InstructionIsDuplicate);
	}

	public static InvestigationExecutionConfirmation3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestigationExecutionConfirmation3Code[] values() {
		InvestigationExecutionConfirmation3Code[] values = new InvestigationExecutionConfirmation3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestigationExecutionConfirmation3Code> {
		@Override
		public InvestigationExecutionConfirmation3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestigationExecutionConfirmation3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}