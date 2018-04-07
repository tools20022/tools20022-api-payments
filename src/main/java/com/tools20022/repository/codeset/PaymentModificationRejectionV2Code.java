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
import com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for the reject of a modification request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyRelatedReference
 * PaymentModificationRejectionV2Code.UnableToModifyRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyPaymentServiceLevel
 * PaymentModificationRejectionV2Code.UnableToModifyPaymentServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyCategoryPurpose
 * PaymentModificationRejectionV2Code.UnableToModifyCategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyRequestedExecutionDate
 * PaymentModificationRejectionV2Code.UnableToModifyRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyInterbankSettlementDate
 * PaymentModificationRejectionV2Code.UnableToModifyInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyInterbankSettlementAccount
 * PaymentModificationRejectionV2Code.UnableToModifyInterbankSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyDebtor
 * PaymentModificationRejectionV2Code.UnableToModifyDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyDebtorAccount
 * PaymentModificationRejectionV2Code.UnableToModifyDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyInstructedReimbursementAgent
 * PaymentModificationRejectionV2Code.UnableToModifyInstructedReimbursementAgent
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyThirdReimbursementAgent
 * PaymentModificationRejectionV2Code.UnableToModifyThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyPaymentClearingChannel
 * PaymentModificationRejectionV2Code.UnableToModifyPaymentClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyCreditorAgentAccount
 * PaymentModificationRejectionV2Code.UnableToModifyCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyCreditor
 * PaymentModificationRejectionV2Code.UnableToModifyCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyCreditorAccount
 * PaymentModificationRejectionV2Code.UnableToModifyCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyRemittanceInformation
 * PaymentModificationRejectionV2Code.UnableToModifyRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyPaymentPurpose
 * PaymentModificationRejectionV2Code.UnableToModifyPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyChargeBearer
 * PaymentModificationRejectionV2Code.UnableToModifyChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyInstructionForNextAgent
 * PaymentModificationRejectionV2Code.UnableToModifyInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyInstructionForCreditorAgent
 * PaymentModificationRejectionV2Code.UnableToModifyInstructionForCreditorAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#InstructionCancelledSubmitNewInstruction
 * PaymentModificationRejectionV2Code.InstructionCancelledSubmitNewInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifySubmitCancellation
 * PaymentModificationRejectionV2Code.UnableToModifySubmitCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyDebtorAgentAccount
 * PaymentModificationRejectionV2Code.UnableToModifyDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyInterbankSettlementAmount
 * PaymentModificationRejectionV2Code.UnableToModifyInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyInstructionForDebtorAgent
 * PaymentModificationRejectionV2Code.UnableToModifyInstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyRequestedCollectionDate
 * PaymentModificationRejectionV2Code.UnableToModifyRequestedCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyPaymentType
 * PaymentModificationRejectionV2Code.UnableToModifyPaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code#UnableToModifyInstructedAmount
 * PaymentModificationRejectionV2Code.UnableToModifyInstructedAmount}</li>
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
 * "PaymentModificationRejectionV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for the reject of a modification request."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentModificationRejectionV2Code extends MMCode {

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
	public static final PaymentModificationRejectionV2Code UnableToModifyRelatedReference = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRelatedReference";
			definition = "Related transaction reference cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyPaymentServiceLevel = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentServiceLevel";
			definition = "Service level element of payment type cannot be modified(former UnableToModifyBankOperationCode).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyCategoryPurpose = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCategoryPurpose";
			definition = "Category purpose element of payment type cannot be modified (former UnableToModifyInstructionCode).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyRequestedExecutionDate = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRequestedExecutionDate";
			definition = "RequestedExecutionDate cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyInterbankSettlementDate = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementDate";
			definition = "InterbankSettlementDate cannot be modified (former UnableToModifyValueDate).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyInterbankSettlementAccount = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementAccount";
			definition = "SettlementAccount cannot be modified (former UnableToModifyInterbankSettlementAccount).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyDebtor = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtor";
			definition = "Debtor cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyDebtorAccount = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtorAccount";
			definition = "DebtorAccount cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyInstructedReimbursementAgent = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructedReimbursementAgent";
			definition = "InstructedReimbursementAgent cannot be modified (former UnableToModifyReceiverCorrespondent).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyThirdReimbursementAgent = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyThirdReimbursementAgent";
			definition = "ThirdReimbursementAgent cannot be modified (former UnableToModifyThirdReimbursementInstitution).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM10";
		}
	};
	/**
	 * Clearing Channel element of payment type cannot be modified (former
	 * UnableToModifyPaymentScheme).
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
	 * "Clearing Channel element of payment type cannot be modified (former UnableToModifyPaymentScheme)."
	 * </li>
	 * </ul>
	 */
	public static final PaymentModificationRejectionV2Code UnableToModifyPaymentClearingChannel = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentClearingChannel";
			definition = "Clearing Channel element of payment type cannot be modified (former UnableToModifyPaymentScheme).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM11";
		}
	};
	/**
	 * Creditor agent account cannot be modified (former
	 * UnableToModifyAccountOfBeneficiaryInstitution).
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
	 * "Creditor agent account cannot be modified (former UnableToModifyAccountOfBeneficiaryInstitution)."
	 * </li>
	 * </ul>
	 */
	public static final PaymentModificationRejectionV2Code UnableToModifyCreditorAgentAccount = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditorAgentAccount";
			definition = "Creditor agent account cannot be modified (former UnableToModifyAccountOfBeneficiaryInstitution).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyCreditor = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditor";
			definition = "Creditor cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyCreditorAccount = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditorAccount";
			definition = "Creditor account cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyRemittanceInformation = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRemittanceInformation";
			definition = "Remittance information cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyPaymentPurpose = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentPurpose";
			definition = "PaymentPurpose cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyChargeBearer = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyChargeBearer";
			definition = "Charge bearer cannot be modified (former UnableToModifyDetailsOfCharges).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyInstructionForNextAgent = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForNextAgent";
			definition = "Instruction for next agent cannot be modified (former UnableToModifySenderToReceiver).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyInstructionForCreditorAgent = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForCreditorAgent";
			definition = "Instruction for creditor agent cannot be modified. (former UnableToModifyInstructionForFinalAgent).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code InstructionCancelledSubmitNewInstruction = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancelledSubmitNewInstruction";
			definition = "Used to inform of cancellation and request a new payment instruction. This should only be used if an agent does not want to modify a pending payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifySubmitCancellation = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifySubmitCancellation";
			definition = "Modification is not possible and the cancellation is requested.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyDebtorAgentAccount = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtorAgentAccount";
			definition = "Debtor agent account cannot be modified (applicable for direct debits).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyInterbankSettlementAmount = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementAmount";
			definition = "Interbank settlement amount cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM23";
		}
	};
	/**
	 * Instruction for debtor agent cannot be modified (applicable for direct
	 * debits).
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
	 * "Instruction for debtor agent cannot be modified (applicable for direct debits)."
	 * </li>
	 * </ul>
	 */
	public static final PaymentModificationRejectionV2Code UnableToModifyInstructionForDebtorAgent = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForDebtorAgent";
			definition = "Instruction for debtor agent cannot be modified (applicable for direct debits).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM24";
		}
	};
	/**
	 * Requested collection date cannot be modified (applicable for direct
	 * debits).
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
	 * "Requested collection date cannot be modified (applicable for direct debits)."
	 * </li>
	 * </ul>
	 */
	public static final PaymentModificationRejectionV2Code UnableToModifyRequestedCollectionDate = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRequestedCollectionDate";
			definition = "Requested collection date cannot be modified (applicable for direct debits).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyPaymentType = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentType";
			definition = "Payment type cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
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
	public static final PaymentModificationRejectionV2Code UnableToModifyInstructedAmount = new PaymentModificationRejectionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructedAmount";
			definition = "Instructed or equivalent amount cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM27";
		}
	};
	final static private LinkedHashMap<String, PaymentModificationRejectionV2Code> codesByName = new LinkedHashMap<>();

	protected PaymentModificationRejectionV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UM01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentModificationRejectionV2Code";
				definition = "Specifies the reason for the reject of a modification request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyRelatedReference,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyPaymentServiceLevel, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyCategoryPurpose,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyRequestedExecutionDate, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInterbankSettlementDate,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInterbankSettlementAccount, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyDebtor,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyDebtorAccount, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInstructedReimbursementAgent,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyThirdReimbursementAgent, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyPaymentClearingChannel,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyCreditorAgentAccount, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyCreditor,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyCreditorAccount, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyRemittanceInformation,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyPaymentPurpose, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyChargeBearer,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInstructionForNextAgent,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInstructionForCreditorAgent,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.InstructionCancelledSubmitNewInstruction, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifySubmitCancellation,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyDebtorAgentAccount, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInterbankSettlementAmount,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInstructionForDebtorAgent,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyRequestedCollectionDate, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyPaymentType,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInstructedAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnableToModifyRelatedReference.getCodeName().get(), UnableToModifyRelatedReference);
		codesByName.put(UnableToModifyPaymentServiceLevel.getCodeName().get(), UnableToModifyPaymentServiceLevel);
		codesByName.put(UnableToModifyCategoryPurpose.getCodeName().get(), UnableToModifyCategoryPurpose);
		codesByName.put(UnableToModifyRequestedExecutionDate.getCodeName().get(), UnableToModifyRequestedExecutionDate);
		codesByName.put(UnableToModifyInterbankSettlementDate.getCodeName().get(), UnableToModifyInterbankSettlementDate);
		codesByName.put(UnableToModifyInterbankSettlementAccount.getCodeName().get(), UnableToModifyInterbankSettlementAccount);
		codesByName.put(UnableToModifyDebtor.getCodeName().get(), UnableToModifyDebtor);
		codesByName.put(UnableToModifyDebtorAccount.getCodeName().get(), UnableToModifyDebtorAccount);
		codesByName.put(UnableToModifyInstructedReimbursementAgent.getCodeName().get(), UnableToModifyInstructedReimbursementAgent);
		codesByName.put(UnableToModifyThirdReimbursementAgent.getCodeName().get(), UnableToModifyThirdReimbursementAgent);
		codesByName.put(UnableToModifyPaymentClearingChannel.getCodeName().get(), UnableToModifyPaymentClearingChannel);
		codesByName.put(UnableToModifyCreditorAgentAccount.getCodeName().get(), UnableToModifyCreditorAgentAccount);
		codesByName.put(UnableToModifyCreditor.getCodeName().get(), UnableToModifyCreditor);
		codesByName.put(UnableToModifyCreditorAccount.getCodeName().get(), UnableToModifyCreditorAccount);
		codesByName.put(UnableToModifyRemittanceInformation.getCodeName().get(), UnableToModifyRemittanceInformation);
		codesByName.put(UnableToModifyPaymentPurpose.getCodeName().get(), UnableToModifyPaymentPurpose);
		codesByName.put(UnableToModifyChargeBearer.getCodeName().get(), UnableToModifyChargeBearer);
		codesByName.put(UnableToModifyInstructionForNextAgent.getCodeName().get(), UnableToModifyInstructionForNextAgent);
		codesByName.put(UnableToModifyInstructionForCreditorAgent.getCodeName().get(), UnableToModifyInstructionForCreditorAgent);
		codesByName.put(InstructionCancelledSubmitNewInstruction.getCodeName().get(), InstructionCancelledSubmitNewInstruction);
		codesByName.put(UnableToModifySubmitCancellation.getCodeName().get(), UnableToModifySubmitCancellation);
		codesByName.put(UnableToModifyDebtorAgentAccount.getCodeName().get(), UnableToModifyDebtorAgentAccount);
		codesByName.put(UnableToModifyInterbankSettlementAmount.getCodeName().get(), UnableToModifyInterbankSettlementAmount);
		codesByName.put(UnableToModifyInstructionForDebtorAgent.getCodeName().get(), UnableToModifyInstructionForDebtorAgent);
		codesByName.put(UnableToModifyRequestedCollectionDate.getCodeName().get(), UnableToModifyRequestedCollectionDate);
		codesByName.put(UnableToModifyPaymentType.getCodeName().get(), UnableToModifyPaymentType);
		codesByName.put(UnableToModifyInstructedAmount.getCodeName().get(), UnableToModifyInstructedAmount);
	}

	public static PaymentModificationRejectionV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentModificationRejectionV2Code[] values() {
		PaymentModificationRejectionV2Code[] values = new PaymentModificationRejectionV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentModificationRejectionV2Code> {
		@Override
		public PaymentModificationRejectionV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentModificationRejectionV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}