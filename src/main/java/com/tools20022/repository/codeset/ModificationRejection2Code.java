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
import com.tools20022.repository.codeset.PaymentModificationRejectionV2Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for rejecting a modification reject.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
 * PaymentModificationRejectionV2Code}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyRelatedReference
 * ModificationRejection2Code.mmUnableToModifyRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyPaymentServiceLevel
 * ModificationRejection2Code.mmUnableToModifyPaymentServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyCategoryPurpose
 * ModificationRejection2Code.mmUnableToModifyCategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyRequestedExecutionDate
 * ModificationRejection2Code.mmUnableToModifyRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyInterbankSettlementDate
 * ModificationRejection2Code.mmUnableToModifyInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyInterbankSettlementAccount
 * ModificationRejection2Code.mmUnableToModifyInterbankSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyDebtor
 * ModificationRejection2Code.mmUnableToModifyDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyDebtorAccount
 * ModificationRejection2Code.mmUnableToModifyDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyInstructedReimbursementAgent
 * ModificationRejection2Code.mmUnableToModifyInstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyThirdReimbursementAgent
 * ModificationRejection2Code.mmUnableToModifyThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyPaymentClearingChannel
 * ModificationRejection2Code.mmUnableToModifyPaymentClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyCreditorAgentAccount
 * ModificationRejection2Code.mmUnableToModifyCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyCreditor
 * ModificationRejection2Code.mmUnableToModifyCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyCreditorAccount
 * ModificationRejection2Code.mmUnableToModifyCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyRemittanceInformation
 * ModificationRejection2Code.mmUnableToModifyRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyPaymentPurpose
 * ModificationRejection2Code.mmUnableToModifyPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyChargeBearer
 * ModificationRejection2Code.mmUnableToModifyChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyInstructionForNextAgent
 * ModificationRejection2Code.mmUnableToModifyInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyInstructionForCreditorAgent
 * ModificationRejection2Code.mmUnableToModifyInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmInstructionCancelledSubmitNewInstruction
 * ModificationRejection2Code.mmInstructionCancelledSubmitNewInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifySubmitCancellation
 * ModificationRejection2Code.mmUnableToModifySubmitCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyDebtorAgentAccount
 * ModificationRejection2Code.mmUnableToModifyDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyInterbankSettlementAmount
 * ModificationRejection2Code.mmUnableToModifyInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyInstructionForDebtorAgent
 * ModificationRejection2Code.mmUnableToModifyInstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyRequestedCollectionDate
 * ModificationRejection2Code.mmUnableToModifyRequestedCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyPaymentType
 * ModificationRejection2Code.mmUnableToModifyPaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#mmUnableToModifyInstructedAmount
 * ModificationRejection2Code.mmUnableToModifyInstructedAmount}</li>
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
 * <li>"UM01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ModificationRejection2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for rejecting a modification reject."</li>
 * </ul>
 */
public class ModificationRejection2Code extends PaymentModificationRejectionV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyRelatedReference"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyRelatedReference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRelatedReference";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyPaymentServiceLevel"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyPaymentServiceLevel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentServiceLevel";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyCategoryPurpose"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyCategoryPurpose = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCategoryPurpose";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyRequestedExecutionDate"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyRequestedExecutionDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRequestedExecutionDate";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInterbankSettlementDate"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInterbankSettlementDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementDate";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInterbankSettlementAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInterbankSettlementAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementAccount";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyDebtor"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyDebtor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtor";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyDebtorAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyDebtorAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtorAccount";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInstructedReimbursementAgent"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInstructedReimbursementAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructedReimbursementAgent";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyThirdReimbursementAgent"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyThirdReimbursementAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyThirdReimbursementAgent";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyPaymentClearingChannel"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyPaymentClearingChannel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentClearingChannel";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyCreditorAgentAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyCreditorAgentAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditorAgentAccount";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyCreditor"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyCreditor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditor";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyCreditorAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyCreditorAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditorAccount";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyRemittanceInformation"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyRemittanceInformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRemittanceInformation";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyPaymentPurpose"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyPaymentPurpose = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentPurpose";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyChargeBearer"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyChargeBearer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyChargeBearer";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInstructionForNextAgent"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInstructionForNextAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForNextAgent";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInstructionForCreditorAgent"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInstructionForCreditorAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForCreditorAgent";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancelledSubmitNewInstruction"</li>
	 * </ul>
	 */
	public static final MMCode mmInstructionCancelledSubmitNewInstruction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancelledSubmitNewInstruction";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifySubmitCancellation"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifySubmitCancellation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifySubmitCancellation";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyDebtorAgentAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyDebtorAgentAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtorAgentAccount";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInterbankSettlementAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInterbankSettlementAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementAmount";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInstructionForDebtorAgent"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInstructionForDebtorAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForDebtorAgent";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyRequestedCollectionDate"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyRequestedCollectionDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRequestedCollectionDate";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyPaymentType"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyPaymentType = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentType";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInstructedAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInstructedAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructedAmount";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("UM01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ModificationRejection2Code";
				definition = "Specifies the reason for rejecting a modification reject.";
				code_lazy = () -> Arrays.asList(ModificationRejection2Code.mmUnableToModifyRelatedReference, ModificationRejection2Code.mmUnableToModifyPaymentServiceLevel, ModificationRejection2Code.mmUnableToModifyCategoryPurpose,
						ModificationRejection2Code.mmUnableToModifyRequestedExecutionDate, ModificationRejection2Code.mmUnableToModifyInterbankSettlementDate, ModificationRejection2Code.mmUnableToModifyInterbankSettlementAccount,
						ModificationRejection2Code.mmUnableToModifyDebtor, ModificationRejection2Code.mmUnableToModifyDebtorAccount, ModificationRejection2Code.mmUnableToModifyInstructedReimbursementAgent,
						ModificationRejection2Code.mmUnableToModifyThirdReimbursementAgent, ModificationRejection2Code.mmUnableToModifyPaymentClearingChannel, ModificationRejection2Code.mmUnableToModifyCreditorAgentAccount,
						ModificationRejection2Code.mmUnableToModifyCreditor, ModificationRejection2Code.mmUnableToModifyCreditorAccount, ModificationRejection2Code.mmUnableToModifyRemittanceInformation,
						ModificationRejection2Code.mmUnableToModifyPaymentPurpose, ModificationRejection2Code.mmUnableToModifyChargeBearer, ModificationRejection2Code.mmUnableToModifyInstructionForNextAgent,
						ModificationRejection2Code.mmUnableToModifyInstructionForCreditorAgent, ModificationRejection2Code.mmInstructionCancelledSubmitNewInstruction, ModificationRejection2Code.mmUnableToModifySubmitCancellation,
						ModificationRejection2Code.mmUnableToModifyDebtorAgentAccount, ModificationRejection2Code.mmUnableToModifyInterbankSettlementAmount, ModificationRejection2Code.mmUnableToModifyInstructionForDebtorAgent,
						ModificationRejection2Code.mmUnableToModifyRequestedCollectionDate, ModificationRejection2Code.mmUnableToModifyPaymentType, ModificationRejection2Code.mmUnableToModifyInstructedAmount);
				trace_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}