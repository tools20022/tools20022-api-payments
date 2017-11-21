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
 * Specifies the reason for the reject of a modification request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyRelatedReference
 * PaymentModificationRejectionV2Code.mmUnableToModifyRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyPaymentServiceLevel
 * PaymentModificationRejectionV2Code.mmUnableToModifyPaymentServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyCategoryPurpose
 * PaymentModificationRejectionV2Code.mmUnableToModifyCategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyRequestedExecutionDate
 * PaymentModificationRejectionV2Code.mmUnableToModifyRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyInterbankSettlementDate
 * PaymentModificationRejectionV2Code.mmUnableToModifyInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyInterbankSettlementAccount
 * PaymentModificationRejectionV2Code.mmUnableToModifyInterbankSettlementAccount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyDebtor
 * PaymentModificationRejectionV2Code.mmUnableToModifyDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyDebtorAccount
 * PaymentModificationRejectionV2Code.mmUnableToModifyDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyInstructedReimbursementAgent
 * PaymentModificationRejectionV2Code.
 * mmUnableToModifyInstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyThirdReimbursementAgent
 * PaymentModificationRejectionV2Code.mmUnableToModifyThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyPaymentClearingChannel
 * PaymentModificationRejectionV2Code.mmUnableToModifyPaymentClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyCreditorAgentAccount
 * PaymentModificationRejectionV2Code.mmUnableToModifyCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyCreditor
 * PaymentModificationRejectionV2Code.mmUnableToModifyCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyCreditorAccount
 * PaymentModificationRejectionV2Code.mmUnableToModifyCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyRemittanceInformation
 * PaymentModificationRejectionV2Code.mmUnableToModifyRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyPaymentPurpose
 * PaymentModificationRejectionV2Code.mmUnableToModifyPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyChargeBearer
 * PaymentModificationRejectionV2Code.mmUnableToModifyChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyInstructionForNextAgent
 * PaymentModificationRejectionV2Code.mmUnableToModifyInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyInstructionForCreditorAgent
 * PaymentModificationRejectionV2Code.
 * mmUnableToModifyInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmInstructionCancelledSubmitNewInstruction
 * PaymentModificationRejectionV2Code.mmInstructionCancelledSubmitNewInstruction
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifySubmitCancellation
 * PaymentModificationRejectionV2Code.mmUnableToModifySubmitCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyDebtorAgentAccount
 * PaymentModificationRejectionV2Code.mmUnableToModifyDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyInterbankSettlementAmount
 * PaymentModificationRejectionV2Code.mmUnableToModifyInterbankSettlementAmount}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyInstructionForDebtorAgent
 * PaymentModificationRejectionV2Code.mmUnableToModifyInstructionForDebtorAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyRequestedCollectionDate
 * PaymentModificationRejectionV2Code.mmUnableToModifyRequestedCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyPaymentType
 * PaymentModificationRejectionV2Code.mmUnableToModifyPaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#mmUnableToModifyInstructedAmount
 * PaymentModificationRejectionV2Code.mmUnableToModifyInstructedAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
 * ModificationRejection2Code}</li>
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
 * "PaymentModificationRejectionV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for the reject of a modification request."</li>
 * </ul>
 */
public class PaymentModificationRejectionV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Related transaction reference cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyRelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related transaction reference cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyRelatedReference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRelatedReference";
			definition = "Related transaction reference cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM01";
		}
	};
	/**
	 * Service level element of payment type cannot be modified(former
	 * UnableToModifyBankOperationCode).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyPaymentServiceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Service level element of payment type cannot be modified(former UnableToModifyBankOperationCode)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyPaymentServiceLevel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentServiceLevel";
			definition = "Service level element of payment type cannot be modified(former UnableToModifyBankOperationCode).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM02";
		}
	};
	/**
	 * Category purpose element of payment type cannot be modified (former
	 * UnableToModifyInstructionCode).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyCategoryPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Category purpose element of payment type cannot be modified (former UnableToModifyInstructionCode)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyCategoryPurpose = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCategoryPurpose";
			definition = "Category purpose element of payment type cannot be modified (former UnableToModifyInstructionCode).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM03";
		}
	};
	/**
	 * RequestedExecutionDate cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyRequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RequestedExecutionDate cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyRequestedExecutionDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRequestedExecutionDate";
			definition = "RequestedExecutionDate cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM04";
		}
	};
	/**
	 * InterbankSettlementDate cannot be modified (former
	 * UnableToModifyValueDate).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InterbankSettlementDate cannot be modified (former UnableToModifyValueDate)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInterbankSettlementDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementDate";
			definition = "InterbankSettlementDate cannot be modified (former UnableToModifyValueDate).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM05";
		}
	};
	/**
	 * SettlementAccount cannot be modified (former
	 * UnableToModifyInterbankSettlementAccount).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInterbankSettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SettlementAccount cannot be modified (former UnableToModifyInterbankSettlementAccount)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInterbankSettlementAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementAccount";
			definition = "SettlementAccount cannot be modified (former UnableToModifyInterbankSettlementAccount).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM06";
		}
	};
	/**
	 * Debtor cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM07"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debtor cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyDebtor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtor";
			definition = "Debtor cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM07";
		}
	};
	/**
	 * DebtorAccount cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM08"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyDebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DebtorAccount cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyDebtorAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtorAccount";
			definition = "DebtorAccount cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM08";
		}
	};
	/**
	 * InstructedReimbursementAgent cannot be modified (former
	 * UnableToModifyReceiverCorrespondent).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM09"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInstructedReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InstructedReimbursementAgent cannot be modified (former UnableToModifyReceiverCorrespondent)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInstructedReimbursementAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructedReimbursementAgent";
			definition = "InstructedReimbursementAgent cannot be modified (former UnableToModifyReceiverCorrespondent).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM09";
		}
	};
	/**
	 * ThirdReimbursementAgent cannot be modified (former
	 * UnableToModifyThirdReimbursementInstitution).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM10"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyThirdReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ThirdReimbursementAgent cannot be modified (former UnableToModifyThirdReimbursementInstitution)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyThirdReimbursementAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyThirdReimbursementAgent";
			definition = "ThirdReimbursementAgent cannot be modified (former UnableToModifyThirdReimbursementInstitution).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM10";
		}
	};
	/**
	 * Clearing Channel element of payment type cannot be modified (former
	 * UnableToModifyPaymentScheme)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM11"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyPaymentClearingChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing Channel element of payment type cannot be modified (former UnableToModifyPaymentScheme)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyPaymentClearingChannel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentClearingChannel";
			definition = "Clearing Channel element of payment type cannot be modified (former UnableToModifyPaymentScheme)";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM11";
		}
	};
	/**
	 * Creditor agent account cannot be modified (former
	 * UnableToModifyAccountOfBeneficiaryInstitution)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM12"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyCreditorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creditor agent account cannot be modified (former UnableToModifyAccountOfBeneficiaryInstitution)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyCreditorAgentAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditorAgentAccount";
			definition = "Creditor agent account cannot be modified (former UnableToModifyAccountOfBeneficiaryInstitution)";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM12";
		}
	};
	/**
	 * Creditor cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM13"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creditor cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyCreditor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditor";
			definition = "Creditor cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM13";
		}
	};
	/**
	 * Creditor account cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM14"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyCreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creditor account cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyCreditorAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditorAccount";
			definition = "Creditor account cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM14";
		}
	};
	/**
	 * Remittance information cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM15"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Remittance information cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyRemittanceInformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRemittanceInformation";
			definition = "Remittance information cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM15";
		}
	};
	/**
	 * PaymentPurpose cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM16"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyPaymentPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "PaymentPurpose cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyPaymentPurpose = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentPurpose";
			definition = "PaymentPurpose cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM16";
		}
	};
	/**
	 * Charge bearer cannot be modified (former UnableToModifyDetailsOfCharges).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM17"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyChargeBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge bearer cannot be modified (former UnableToModifyDetailsOfCharges)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyChargeBearer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyChargeBearer";
			definition = "Charge bearer cannot be modified (former UnableToModifyDetailsOfCharges).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM17";
		}
	};
	/**
	 * Instruction for next agent cannot be modified (former
	 * UnableToModifySenderToReceiver).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM18"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInstructionForNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction for next agent cannot be modified (former UnableToModifySenderToReceiver)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInstructionForNextAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForNextAgent";
			definition = "Instruction for next agent cannot be modified (former UnableToModifySenderToReceiver).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM18";
		}
	};
	/**
	 * Instruction for creditor agent cannot be modified. (former
	 * UnableToModifyInstructionForFinalAgent).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM19"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInstructionForCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction for creditor agent cannot be modified. (former UnableToModifyInstructionForFinalAgent)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInstructionForCreditorAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForCreditorAgent";
			definition = "Instruction for creditor agent cannot be modified. (former UnableToModifyInstructionForFinalAgent).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM19";
		}
	};
	/**
	 * Used to inform of cancellation and request a new payment instruction.
	 * This should only be used if an agent does not want to modify a pending
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM20"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancelledSubmitNewInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to inform of cancellation and request a new payment instruction. This should only be used if an agent does not want to modify a pending payment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstructionCancelledSubmitNewInstruction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancelledSubmitNewInstruction";
			definition = "Used to inform of cancellation and request a new payment instruction. This should only be used if an agent does not want to modify a pending payment.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM20";
		}
	};
	/**
	 * Modification is not possible and the cancellation is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM21"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifySubmitCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification is not possible and the cancellation is requested."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifySubmitCancellation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifySubmitCancellation";
			definition = "Modification is not possible and the cancellation is requested.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM21";
		}
	};
	/**
	 * Debtor agent account cannot be modified (applicable for direct debits).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM22"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyDebtorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debtor agent account cannot be modified (applicable for direct debits)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyDebtorAgentAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtorAgentAccount";
			definition = "Debtor agent account cannot be modified (applicable for direct debits).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM22";
		}
	};
	/**
	 * Interbank settlement amount cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM23"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interbank settlement amount cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInterbankSettlementAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementAmount";
			definition = "Interbank settlement amount cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM23";
		}
	};
	/**
	 * Instruction for debtor agent cannot be modified (applicable for direct
	 * debits)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM24"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInstructionForDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction for debtor agent cannot be modified (applicable for direct debits)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInstructionForDebtorAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForDebtorAgent";
			definition = "Instruction for debtor agent cannot be modified (applicable for direct debits)";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM24";
		}
	};
	/**
	 * Requested collection date cannot be modified (applicable for direct
	 * debits)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM25"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyRequestedCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested collection date cannot be modified (applicable for direct debits)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyRequestedCollectionDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRequestedCollectionDate";
			definition = "Requested collection date cannot be modified (applicable for direct debits)";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM25";
		}
	};
	/**
	 * Payment type cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM26"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyPaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment type cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyPaymentType = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentType";
			definition = "Payment type cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM26";
		}
	};
	/**
	 * Instructed or equivalent amount cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM27"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instructed or equivalent amount cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInstructedAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructedAmount";
			definition = "Instructed or equivalent amount cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM27";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("UM01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentModificationRejectionV2Code";
				definition = "Specifies the reason for the reject of a modification request.";
				code_lazy = () -> Arrays.asList(PaymentModificationRejectionV2Code.mmUnableToModifyRelatedReference, PaymentModificationRejectionV2Code.mmUnableToModifyPaymentServiceLevel,
						PaymentModificationRejectionV2Code.mmUnableToModifyCategoryPurpose, PaymentModificationRejectionV2Code.mmUnableToModifyRequestedExecutionDate,
						PaymentModificationRejectionV2Code.mmUnableToModifyInterbankSettlementDate, PaymentModificationRejectionV2Code.mmUnableToModifyInterbankSettlementAccount, PaymentModificationRejectionV2Code.mmUnableToModifyDebtor,
						PaymentModificationRejectionV2Code.mmUnableToModifyDebtorAccount, PaymentModificationRejectionV2Code.mmUnableToModifyInstructedReimbursementAgent,
						PaymentModificationRejectionV2Code.mmUnableToModifyThirdReimbursementAgent, PaymentModificationRejectionV2Code.mmUnableToModifyPaymentClearingChannel,
						PaymentModificationRejectionV2Code.mmUnableToModifyCreditorAgentAccount, PaymentModificationRejectionV2Code.mmUnableToModifyCreditor, PaymentModificationRejectionV2Code.mmUnableToModifyCreditorAccount,
						PaymentModificationRejectionV2Code.mmUnableToModifyRemittanceInformation, PaymentModificationRejectionV2Code.mmUnableToModifyPaymentPurpose, PaymentModificationRejectionV2Code.mmUnableToModifyChargeBearer,
						PaymentModificationRejectionV2Code.mmUnableToModifyInstructionForNextAgent, PaymentModificationRejectionV2Code.mmUnableToModifyInstructionForCreditorAgent,
						PaymentModificationRejectionV2Code.mmInstructionCancelledSubmitNewInstruction, PaymentModificationRejectionV2Code.mmUnableToModifySubmitCancellation,
						PaymentModificationRejectionV2Code.mmUnableToModifyDebtorAgentAccount, PaymentModificationRejectionV2Code.mmUnableToModifyInterbankSettlementAmount,
						PaymentModificationRejectionV2Code.mmUnableToModifyInstructionForDebtorAgent, PaymentModificationRejectionV2Code.mmUnableToModifyRequestedCollectionDate,
						PaymentModificationRejectionV2Code.mmUnableToModifyPaymentType, PaymentModificationRejectionV2Code.mmUnableToModifyInstructedAmount);
				derivation_lazy = () -> Arrays.asList(ModificationRejection2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}