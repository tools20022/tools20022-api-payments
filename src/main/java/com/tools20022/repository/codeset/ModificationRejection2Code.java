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
import com.tools20022.repository.codeset.ModificationRejection2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for rejecting a modification reject.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyRelatedReference
 * ModificationRejection2Code.mmUnableToModifyRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyPaymentServiceLevel
 * ModificationRejection2Code.mmUnableToModifyPaymentServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyCategoryPurpose
 * ModificationRejection2Code.mmUnableToModifyCategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyRequestedExecutionDate
 * ModificationRejection2Code.mmUnableToModifyRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInterbankSettlementDate
 * ModificationRejection2Code.mmUnableToModifyInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInterbankSettlementAccount
 * ModificationRejection2Code.mmUnableToModifyInterbankSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyDebtor
 * ModificationRejection2Code.mmUnableToModifyDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyDebtorAccount
 * ModificationRejection2Code.mmUnableToModifyDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInstructedReimbursementAgent
 * ModificationRejection2Code.mmUnableToModifyInstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyThirdReimbursementAgent
 * ModificationRejection2Code.mmUnableToModifyThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyPaymentClearingChannel
 * ModificationRejection2Code.mmUnableToModifyPaymentClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyCreditorAgentAccount
 * ModificationRejection2Code.mmUnableToModifyCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyCreditor
 * ModificationRejection2Code.mmUnableToModifyCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyCreditorAccount
 * ModificationRejection2Code.mmUnableToModifyCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyRemittanceInformation
 * ModificationRejection2Code.mmUnableToModifyRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyPaymentPurpose
 * ModificationRejection2Code.mmUnableToModifyPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyChargeBearer
 * ModificationRejection2Code.mmUnableToModifyChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInstructionForNextAgent
 * ModificationRejection2Code.mmUnableToModifyInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInstructionForCreditorAgent
 * ModificationRejection2Code.mmUnableToModifyInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#InstructionCancelledSubmitNewInstruction
 * ModificationRejection2Code.mmInstructionCancelledSubmitNewInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifySubmitCancellation
 * ModificationRejection2Code.mmUnableToModifySubmitCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyDebtorAgentAccount
 * ModificationRejection2Code.mmUnableToModifyDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInterbankSettlementAmount
 * ModificationRejection2Code.mmUnableToModifyInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInstructionForDebtorAgent
 * ModificationRejection2Code.mmUnableToModifyInstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyRequestedCollectionDate
 * ModificationRejection2Code.mmUnableToModifyRequestedCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyPaymentType
 * ModificationRejection2Code.mmUnableToModifyPaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code#UnableToModifyInstructedAmount
 * ModificationRejection2Code.mmUnableToModifyInstructedAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
 * PaymentModificationRejectionV2Code}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ModificationRejection2Code extends MMCode {

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
	public static final ModificationRejection2Code UnableToModifyRelatedReference = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRelatedReference";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyRelatedReference.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyPaymentServiceLevel = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentServiceLevel";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyPaymentServiceLevel.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyCategoryPurpose = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCategoryPurpose";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyCategoryPurpose.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyRequestedExecutionDate = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRequestedExecutionDate";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyRequestedExecutionDate.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyInterbankSettlementDate = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyInterbankSettlementDate.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyInterbankSettlementAccount = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyInterbankSettlementAccount.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyDebtor = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtor";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyDebtor.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyDebtorAccount = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyDebtorAccount.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyInstructedReimbursementAgent = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructedReimbursementAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyInstructedReimbursementAgent.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyThirdReimbursementAgent = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyThirdReimbursementAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyThirdReimbursementAgent.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyPaymentClearingChannel = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentClearingChannel";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyPaymentClearingChannel.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyCreditorAgentAccount = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditorAgentAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyCreditorAgentAccount.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyCreditor = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditor";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyCreditor.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyCreditorAccount = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyCreditorAccount.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyRemittanceInformation = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRemittanceInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyRemittanceInformation.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyPaymentPurpose = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentPurpose";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyPaymentPurpose.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyChargeBearer = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyChargeBearer";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyChargeBearer.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyInstructionForNextAgent = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForNextAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyInstructionForNextAgent.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyInstructionForCreditorAgent = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForCreditorAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyInstructionForCreditorAgent.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code InstructionCancelledSubmitNewInstruction = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancelledSubmitNewInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.InstructionCancelledSubmitNewInstruction.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifySubmitCancellation = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifySubmitCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifySubmitCancellation.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyDebtorAgentAccount = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtorAgentAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyDebtorAgentAccount.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyInterbankSettlementAmount = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyInterbankSettlementAmount.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyInstructionForDebtorAgent = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForDebtorAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyInstructionForDebtorAgent.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyRequestedCollectionDate = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRequestedCollectionDate";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyRequestedCollectionDate.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyPaymentType = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentType";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyPaymentType.getCodeName().orElse(name);
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
	public static final ModificationRejection2Code UnableToModifyInstructedAmount = new ModificationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructedAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationRejection2Code.mmObject();
			codeName = PaymentModificationRejectionV2Code.UnableToModifyInstructedAmount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ModificationRejection2Code> codesByName = new LinkedHashMap<>();

	protected ModificationRejection2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("UM01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ModificationRejection2Code";
				definition = "Specifies the reason for rejecting a modification reject.";
				trace_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
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

	public static ModificationRejection2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ModificationRejection2Code[] values() {
		ModificationRejection2Code[] values = new ModificationRejection2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ModificationRejection2Code> {
		@Override
		public ModificationRejection2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ModificationRejection2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}