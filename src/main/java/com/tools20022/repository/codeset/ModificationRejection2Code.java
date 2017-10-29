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
import com.tools20022.repository.codeset.PaymentModificationRejectionV2Code;
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
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyRelatedReference
 * ModificationRejection2Code.UnableToModifyRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyPaymentServiceLevel
 * ModificationRejection2Code.UnableToModifyPaymentServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyCategoryPurpose
 * ModificationRejection2Code.UnableToModifyCategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyRequestedExecutionDate
 * ModificationRejection2Code.UnableToModifyRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInterbankSettlementDate
 * ModificationRejection2Code.UnableToModifyInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInterbankSettlementAccount
 * ModificationRejection2Code.UnableToModifyInterbankSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyDebtor
 * ModificationRejection2Code.UnableToModifyDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyDebtorAccount
 * ModificationRejection2Code.UnableToModifyDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInstructedReimbursementAgent
 * ModificationRejection2Code.UnableToModifyInstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyThirdReimbursementAgent
 * ModificationRejection2Code.UnableToModifyThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyPaymentClearingChannel
 * ModificationRejection2Code.UnableToModifyPaymentClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyCreditorAgentAccount
 * ModificationRejection2Code.UnableToModifyCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyCreditor
 * ModificationRejection2Code.UnableToModifyCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyCreditorAccount
 * ModificationRejection2Code.UnableToModifyCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyRemittanceInformation
 * ModificationRejection2Code.UnableToModifyRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyPaymentPurpose
 * ModificationRejection2Code.UnableToModifyPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyChargeBearer
 * ModificationRejection2Code.UnableToModifyChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInstructionForNextAgent
 * ModificationRejection2Code.UnableToModifyInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInstructionForCreditorAgent
 * ModificationRejection2Code.UnableToModifyInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#InstructionCancelledSubmitNewInstruction
 * ModificationRejection2Code.InstructionCancelledSubmitNewInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifySubmitCancellation
 * ModificationRejection2Code.UnableToModifySubmitCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyDebtorAgentAccount
 * ModificationRejection2Code.UnableToModifyDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInterbankSettlementAmount
 * ModificationRejection2Code.UnableToModifyInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInstructionForDebtorAgent
 * ModificationRejection2Code.UnableToModifyInstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyRequestedCollectionDate
 * ModificationRejection2Code.UnableToModifyRequestedCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyPaymentType
 * ModificationRejection2Code.UnableToModifyPaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInstructedAmount
 * ModificationRejection2Code.UnableToModifyInstructedAmount}</li>
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
	public static final MMCode UnableToModifyRelatedReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyPaymentServiceLevel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyCategoryPurpose = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyRequestedExecutionDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyInterbankSettlementDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyInterbankSettlementAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyDebtorAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyInstructedReimbursementAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyThirdReimbursementAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyPaymentClearingChannel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyCreditorAgentAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyCreditorAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyRemittanceInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyPaymentPurpose = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyChargeBearer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyInstructionForNextAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyInstructionForCreditorAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode InstructionCancelledSubmitNewInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifySubmitCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyDebtorAgentAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyInterbankSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyInstructionForDebtorAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyRequestedCollectionDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyPaymentType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnableToModifyInstructedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructedAmount";
			owner_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("UM01");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ModificationRejection2Code";
				definition = "Specifies the reason for rejecting a modification reject.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyRelatedReference, com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyPaymentServiceLevel,
						com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyCategoryPurpose, com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyRequestedExecutionDate,
						com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyInterbankSettlementDate, com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyInterbankSettlementAccount,
						com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyDebtor, com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyDebtorAccount,
						com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyInstructedReimbursementAgent, com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyThirdReimbursementAgent,
						com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyPaymentClearingChannel, com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyCreditorAgentAccount,
						com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyCreditor, com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyCreditorAccount,
						com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyRemittanceInformation, com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyPaymentPurpose,
						com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyChargeBearer, com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyInstructionForNextAgent,
						com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyInstructionForCreditorAgent, com.tools20022.repository.codeset.ModificationRejection2Code.InstructionCancelledSubmitNewInstruction,
						com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifySubmitCancellation, com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyDebtorAgentAccount,
						com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyInterbankSettlementAmount, com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyInstructionForDebtorAgent,
						com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyRequestedCollectionDate, com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyPaymentType,
						com.tools20022.repository.codeset.ModificationRejection2Code.UnableToModifyInstructedAmount);
				trace_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}