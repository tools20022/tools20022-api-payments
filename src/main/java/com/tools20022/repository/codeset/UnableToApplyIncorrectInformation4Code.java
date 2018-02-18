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
import com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason of an unable to apply due to incorrect information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectRelatedReference
 * UnableToApplyIncorrectInformation4Code.IncorrectRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectPaymentServiceLevel
 * UnableToApplyIncorrectInformation4Code.IncorrectPaymentServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectCategoryPurpose
 * UnableToApplyIncorrectInformation4Code.IncorrectCategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectRequestedExecutionDate
 * UnableToApplyIncorrectInformation4Code.IncorrectRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectInterbankSettlementDate
 * UnableToApplyIncorrectInformation4Code.IncorrectInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectInterbankSettlementAmount
 * UnableToApplyIncorrectInformation4Code.IncorrectInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectDebtor
 * UnableToApplyIncorrectInformation4Code.IncorrectDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectDebtorAccount
 * UnableToApplyIncorrectInformation4Code.IncorrectDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectInstructedReimbursementAgent
 * UnableToApplyIncorrectInformation4Code.IncorrectInstructedReimbursementAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectThirdReimbursementAgent
 * UnableToApplyIncorrectInformation4Code.IncorrectThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectPaymentClearingChannel
 * UnableToApplyIncorrectInformation4Code.IncorrectPaymentClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectCreditorAgentAccount
 * UnableToApplyIncorrectInformation4Code.IncorrectCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectCreditor
 * UnableToApplyIncorrectInformation4Code.IncorrectCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectCreditorAccount
 * UnableToApplyIncorrectInformation4Code.IncorrectCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectRemittanceInformation
 * UnableToApplyIncorrectInformation4Code.IncorrectRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectPaymentPurpose
 * UnableToApplyIncorrectInformation4Code.IncorrectPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectChargeBearer
 * UnableToApplyIncorrectInformation4Code.IncorrectChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectInstructionForNextAgent
 * UnableToApplyIncorrectInformation4Code.IncorrectInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectInstructionForCreditorAgent
 * UnableToApplyIncorrectInformation4Code.IncorrectInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#MismatchCreditorNameAccount
 * UnableToApplyIncorrectInformation4Code.MismatchCreditorNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#MismatchDebtorNameAccount
 * UnableToApplyIncorrectInformation4Code.MismatchDebtorNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#MismatchCreditorAgentNameAccount
 * UnableToApplyIncorrectInformation4Code.MismatchCreditorAgentNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#PendingExecutionDebtorAccountOrIdentification
 * UnableToApplyIncorrectInformation4Code.
 * PendingExecutionDebtorAccountOrIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#PendingExecutionDebtorNameOrAddress
 * UnableToApplyIncorrectInformation4Code.PendingExecutionDebtorNameOrAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#PaymentExecutedDebtorAccountOrIdentification
 * UnableToApplyIncorrectInformation4Code.
 * PaymentExecutedDebtorAccountOrIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#PaymentExecutedDebtorNameOrAddress
 * UnableToApplyIncorrectInformation4Code.PaymentExecutedDebtorNameOrAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#PendingExecutionCreditorAccountOrIdentification
 * UnableToApplyIncorrectInformation4Code.
 * PendingExecutionCreditorAccountOrIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#PendingExecutionCreditorNameOrAddress
 * UnableToApplyIncorrectInformation4Code.PendingExecutionCreditorNameOrAddress}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#PaymentExecutedCreditorAccountOrIdentification
 * UnableToApplyIncorrectInformation4Code.
 * PaymentExecutedCreditorAccountOrIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#PaymentExecutedCreditorNameOrAddress
 * UnableToApplyIncorrectInformation4Code.PaymentExecutedCreditorNameOrAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectReportEntryAmount
 * UnableToApplyIncorrectInformation4Code.IncorrectReportEntryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#InsufficientChargesDetails
 * UnableToApplyIncorrectInformation4Code.InsufficientChargesDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#InsufficientPaymentPurpose
 * UnableToApplyIncorrectInformation4Code.InsufficientPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectSettlementAccount
 * UnableToApplyIncorrectInformation4Code.IncorrectSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectInstructingReimbursementAgent
 * UnableToApplyIncorrectInformation4Code.IncorrectInstructingReimbursementAgent
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectDebtorAddress
 * UnableToApplyIncorrectInformation4Code.IncorrectDebtorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#IncorrectCreditorAddress
 * UnableToApplyIncorrectInformation4Code.IncorrectCreditorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code#Narrative
 * UnableToApplyIncorrectInformation4Code.Narrative}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
 * UnableToApplyIncorrectInformationV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"IN01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnableToApplyIncorrectInformation4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason of an unable to apply due to incorrect information."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnableToApplyIncorrectInformation4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRelatedReference"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectRelatedReference = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRelatedReference";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectRelatedReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentServiceLevel"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectPaymentServiceLevel = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentServiceLevel";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectPaymentServiceLevel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCategoryPurpose"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectCategoryPurpose = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCategoryPurpose";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectCategoryPurpose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRequestedExecutionDate"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectRequestedExecutionDate = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRequestedExecutionDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectRequestedExecutionDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInterbankSettlementDate"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectInterbankSettlementDate = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInterbankSettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectInterbankSettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInterbankSettlementAmount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectInterbankSettlementAmount = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInterbankSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectInterbankSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtor"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectDebtor = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDebtor";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectDebtor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtorAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectDebtorAccount = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDebtorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectDebtorAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructedReimbursementAgent"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectInstructedReimbursementAgent = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructedReimbursementAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectInstructedReimbursementAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectThirdReimbursementAgent"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectThirdReimbursementAgent = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectThirdReimbursementAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectThirdReimbursementAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentClearingChannel"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectPaymentClearingChannel = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentClearingChannel";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectPaymentClearingChannel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditorAgentAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectCreditorAgentAccount = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditorAgentAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectCreditorAgentAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditor"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectCreditor = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditor";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditorAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectCreditorAccount = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectCreditorAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRemittanceInformation"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectRemittanceInformation = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRemittanceInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectRemittanceInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentPurpose"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectPaymentPurpose = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentPurpose";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectPaymentPurpose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectChargeBearer"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectChargeBearer = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectChargeBearer";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectChargeBearer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructionForNextAgent"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectInstructionForNextAgent = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructionForNextAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectInstructionForNextAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructionForCreditorAgent"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectInstructionForCreditorAgent = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructionForCreditorAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectInstructionForCreditorAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchCreditorNameAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code MismatchCreditorNameAccount = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchCreditorNameAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.MismatchCreditorNameAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchDebtorNameAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code MismatchDebtorNameAccount = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchDebtorNameAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.MismatchDebtorNameAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchCreditorAgentNameAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code MismatchCreditorAgentNameAccount = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchCreditorAgentNameAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.MismatchCreditorAgentNameAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingExecutionDebtorAccountOrIdentification"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code PendingExecutionDebtorAccountOrIdentification = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingExecutionDebtorAccountOrIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PendingExecutionDebtorAccountOrIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingExecutionDebtorNameOrAddress"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code PendingExecutionDebtorNameOrAddress = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingExecutionDebtorNameOrAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PendingExecutionDebtorNameOrAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecutedDebtorAccountOrIdentification"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code PaymentExecutedDebtorAccountOrIdentification = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentExecutedDebtorAccountOrIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PaymentExecutedDebtorAccountOrIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecutedDebtorNameOrAddress"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code PaymentExecutedDebtorNameOrAddress = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentExecutedDebtorNameOrAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PaymentExecutedDebtorNameOrAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingExecutionCreditorAccountOrIdentification"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code PendingExecutionCreditorAccountOrIdentification = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingExecutionCreditorAccountOrIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PendingExecutionCreditorAccountOrIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingExecutionCreditorNameOrAddress"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code PendingExecutionCreditorNameOrAddress = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingExecutionCreditorNameOrAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PendingExecutionCreditorNameOrAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecutedCreditorAccountOrIdentification"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code PaymentExecutedCreditorAccountOrIdentification = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentExecutedCreditorAccountOrIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PaymentExecutedCreditorAccountOrIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecutedCreditorNameOrAddress"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code PaymentExecutedCreditorNameOrAddress = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentExecutedCreditorNameOrAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PaymentExecutedCreditorNameOrAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectReportEntryAmount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectReportEntryAmount = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectReportEntryAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectReportEntryAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientChargesDetails"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code InsufficientChargesDetails = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientChargesDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.InsufficientChargesDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientPaymentPurpose"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code InsufficientPaymentPurpose = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientPaymentPurpose";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.InsufficientPaymentPurpose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectSettlementAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectSettlementAccount = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectSettlementAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectSettlementAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructingReimbursementAgent"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectInstructingReimbursementAgent = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructingReimbursementAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectInstructingReimbursementAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtorAddress"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectDebtorAddress = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDebtorAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectDebtorAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditorAddress"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code IncorrectCreditorAddress = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditorAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectCreditorAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Narrative"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation4Code Narrative = new UnableToApplyIncorrectInformation4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Narrative";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.Narrative.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnableToApplyIncorrectInformation4Code> codesByName = new LinkedHashMap<>();

	protected UnableToApplyIncorrectInformation4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("IN01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyIncorrectInformation4Code";
				definition = "Specifies the reason of an unable to apply due to incorrect information.";
				trace_lazy = () -> UnableToApplyIncorrectInformationV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectRelatedReference,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectPaymentServiceLevel, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectCategoryPurpose,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectRequestedExecutionDate, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectInterbankSettlementDate,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectInterbankSettlementAmount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectDebtor,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectDebtorAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectInstructedReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectThirdReimbursementAgent, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectPaymentClearingChannel,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectCreditorAgentAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectCreditor,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectCreditorAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectRemittanceInformation,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectPaymentPurpose, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectChargeBearer,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectInstructionForNextAgent,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectInstructionForCreditorAgent, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.MismatchCreditorNameAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.MismatchDebtorNameAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.MismatchCreditorAgentNameAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.PendingExecutionDebtorAccountOrIdentification,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.PendingExecutionDebtorNameOrAddress,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.PaymentExecutedDebtorAccountOrIdentification,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.PaymentExecutedDebtorNameOrAddress,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.PendingExecutionCreditorAccountOrIdentification,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.PendingExecutionCreditorNameOrAddress,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.PaymentExecutedCreditorAccountOrIdentification,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.PaymentExecutedCreditorNameOrAddress, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectReportEntryAmount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.InsufficientChargesDetails, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.InsufficientPaymentPurpose,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectSettlementAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectInstructingReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectDebtorAddress, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.IncorrectCreditorAddress,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code.Narrative);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IncorrectRelatedReference.getCodeName().get(), IncorrectRelatedReference);
		codesByName.put(IncorrectPaymentServiceLevel.getCodeName().get(), IncorrectPaymentServiceLevel);
		codesByName.put(IncorrectCategoryPurpose.getCodeName().get(), IncorrectCategoryPurpose);
		codesByName.put(IncorrectRequestedExecutionDate.getCodeName().get(), IncorrectRequestedExecutionDate);
		codesByName.put(IncorrectInterbankSettlementDate.getCodeName().get(), IncorrectInterbankSettlementDate);
		codesByName.put(IncorrectInterbankSettlementAmount.getCodeName().get(), IncorrectInterbankSettlementAmount);
		codesByName.put(IncorrectDebtor.getCodeName().get(), IncorrectDebtor);
		codesByName.put(IncorrectDebtorAccount.getCodeName().get(), IncorrectDebtorAccount);
		codesByName.put(IncorrectInstructedReimbursementAgent.getCodeName().get(), IncorrectInstructedReimbursementAgent);
		codesByName.put(IncorrectThirdReimbursementAgent.getCodeName().get(), IncorrectThirdReimbursementAgent);
		codesByName.put(IncorrectPaymentClearingChannel.getCodeName().get(), IncorrectPaymentClearingChannel);
		codesByName.put(IncorrectCreditorAgentAccount.getCodeName().get(), IncorrectCreditorAgentAccount);
		codesByName.put(IncorrectCreditor.getCodeName().get(), IncorrectCreditor);
		codesByName.put(IncorrectCreditorAccount.getCodeName().get(), IncorrectCreditorAccount);
		codesByName.put(IncorrectRemittanceInformation.getCodeName().get(), IncorrectRemittanceInformation);
		codesByName.put(IncorrectPaymentPurpose.getCodeName().get(), IncorrectPaymentPurpose);
		codesByName.put(IncorrectChargeBearer.getCodeName().get(), IncorrectChargeBearer);
		codesByName.put(IncorrectInstructionForNextAgent.getCodeName().get(), IncorrectInstructionForNextAgent);
		codesByName.put(IncorrectInstructionForCreditorAgent.getCodeName().get(), IncorrectInstructionForCreditorAgent);
		codesByName.put(MismatchCreditorNameAccount.getCodeName().get(), MismatchCreditorNameAccount);
		codesByName.put(MismatchDebtorNameAccount.getCodeName().get(), MismatchDebtorNameAccount);
		codesByName.put(MismatchCreditorAgentNameAccount.getCodeName().get(), MismatchCreditorAgentNameAccount);
		codesByName.put(PendingExecutionDebtorAccountOrIdentification.getCodeName().get(), PendingExecutionDebtorAccountOrIdentification);
		codesByName.put(PendingExecutionDebtorNameOrAddress.getCodeName().get(), PendingExecutionDebtorNameOrAddress);
		codesByName.put(PaymentExecutedDebtorAccountOrIdentification.getCodeName().get(), PaymentExecutedDebtorAccountOrIdentification);
		codesByName.put(PaymentExecutedDebtorNameOrAddress.getCodeName().get(), PaymentExecutedDebtorNameOrAddress);
		codesByName.put(PendingExecutionCreditorAccountOrIdentification.getCodeName().get(), PendingExecutionCreditorAccountOrIdentification);
		codesByName.put(PendingExecutionCreditorNameOrAddress.getCodeName().get(), PendingExecutionCreditorNameOrAddress);
		codesByName.put(PaymentExecutedCreditorAccountOrIdentification.getCodeName().get(), PaymentExecutedCreditorAccountOrIdentification);
		codesByName.put(PaymentExecutedCreditorNameOrAddress.getCodeName().get(), PaymentExecutedCreditorNameOrAddress);
		codesByName.put(IncorrectReportEntryAmount.getCodeName().get(), IncorrectReportEntryAmount);
		codesByName.put(InsufficientChargesDetails.getCodeName().get(), InsufficientChargesDetails);
		codesByName.put(InsufficientPaymentPurpose.getCodeName().get(), InsufficientPaymentPurpose);
		codesByName.put(IncorrectSettlementAccount.getCodeName().get(), IncorrectSettlementAccount);
		codesByName.put(IncorrectInstructingReimbursementAgent.getCodeName().get(), IncorrectInstructingReimbursementAgent);
		codesByName.put(IncorrectDebtorAddress.getCodeName().get(), IncorrectDebtorAddress);
		codesByName.put(IncorrectCreditorAddress.getCodeName().get(), IncorrectCreditorAddress);
		codesByName.put(Narrative.getCodeName().get(), Narrative);
	}

	public static UnableToApplyIncorrectInformation4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnableToApplyIncorrectInformation4Code[] values() {
		UnableToApplyIncorrectInformation4Code[] values = new UnableToApplyIncorrectInformation4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnableToApplyIncorrectInformation4Code> {
		@Override
		public UnableToApplyIncorrectInformation4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnableToApplyIncorrectInformation4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}