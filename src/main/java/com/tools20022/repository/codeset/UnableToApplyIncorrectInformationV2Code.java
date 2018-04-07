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
import com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectRelatedReference
 * UnableToApplyIncorrectInformationV2Code.IncorrectRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectPaymentServiceLevel
 * UnableToApplyIncorrectInformationV2Code.IncorrectPaymentServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectCategoryPurpose
 * UnableToApplyIncorrectInformationV2Code.IncorrectCategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectRequestedExecutionDate
 * UnableToApplyIncorrectInformationV2Code.IncorrectRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectInterbankSettlementDate
 * UnableToApplyIncorrectInformationV2Code.IncorrectInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectInterbankSettlementAmount
 * UnableToApplyIncorrectInformationV2Code.IncorrectInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectDebtor
 * UnableToApplyIncorrectInformationV2Code.IncorrectDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectDebtorAccount
 * UnableToApplyIncorrectInformationV2Code.IncorrectDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectInstructedReimbursementAgent
 * UnableToApplyIncorrectInformationV2Code.IncorrectInstructedReimbursementAgent
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectThirdReimbursementAgent
 * UnableToApplyIncorrectInformationV2Code.IncorrectThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectPaymentClearingChannel
 * UnableToApplyIncorrectInformationV2Code.IncorrectPaymentClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectCreditorAgentAccount
 * UnableToApplyIncorrectInformationV2Code.IncorrectCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectCreditor
 * UnableToApplyIncorrectInformationV2Code.IncorrectCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectCreditorAccount
 * UnableToApplyIncorrectInformationV2Code.IncorrectCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectRemittanceInformation
 * UnableToApplyIncorrectInformationV2Code.IncorrectRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectPaymentPurpose
 * UnableToApplyIncorrectInformationV2Code.IncorrectPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectChargeBearer
 * UnableToApplyIncorrectInformationV2Code.IncorrectChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectInstructionForNextAgent
 * UnableToApplyIncorrectInformationV2Code.IncorrectInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectInstructionForCreditorAgent
 * UnableToApplyIncorrectInformationV2Code.IncorrectInstructionForCreditorAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#MismatchCreditorNameAccount
 * UnableToApplyIncorrectInformationV2Code.MismatchCreditorNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#MismatchDebtorNameAccount
 * UnableToApplyIncorrectInformationV2Code.MismatchDebtorNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#MismatchCreditorAgentNameAccount
 * UnableToApplyIncorrectInformationV2Code.MismatchCreditorAgentNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#InsufficientDebtorDetails
 * UnableToApplyIncorrectInformationV2Code.InsufficientDebtorDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#InsufficientCreditorDetails
 * UnableToApplyIncorrectInformationV2Code.InsufficientCreditorDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#PendingExecutionDebtorAccountOrIdentification
 * UnableToApplyIncorrectInformationV2Code.
 * PendingExecutionDebtorAccountOrIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#PendingExecutionDebtorNameOrAddress
 * UnableToApplyIncorrectInformationV2Code.PendingExecutionDebtorNameOrAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#PaymentExecutedDebtorAccountOrIdentification
 * UnableToApplyIncorrectInformationV2Code.
 * PaymentExecutedDebtorAccountOrIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#PaymentExecutedDebtorNameOrAddress
 * UnableToApplyIncorrectInformationV2Code.PaymentExecutedDebtorNameOrAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#PendingExecutionCreditorAccountOrIdentification
 * UnableToApplyIncorrectInformationV2Code.
 * PendingExecutionCreditorAccountOrIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#PendingExecutionCreditorNameOrAddress
 * UnableToApplyIncorrectInformationV2Code.PendingExecutionCreditorNameOrAddress
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#PaymentExecutedCreditorAccountOrIdentification
 * UnableToApplyIncorrectInformationV2Code.
 * PaymentExecutedCreditorAccountOrIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#PaymentExecutedCreditorNameOrAddress
 * UnableToApplyIncorrectInformationV2Code.PaymentExecutedCreditorNameOrAddress}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectReportEntryAmount
 * UnableToApplyIncorrectInformationV2Code.IncorrectReportEntryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#InsufficientChargesDetails
 * UnableToApplyIncorrectInformationV2Code.InsufficientChargesDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#InsufficientPaymentPurpose
 * UnableToApplyIncorrectInformationV2Code.InsufficientPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectSettlementAccount
 * UnableToApplyIncorrectInformationV2Code.IncorrectSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectInstructingReimbursementAgent
 * UnableToApplyIncorrectInformationV2Code.
 * IncorrectInstructingReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectDebtorAddress
 * UnableToApplyIncorrectInformationV2Code.IncorrectDebtorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#IncorrectCreditorAddress
 * UnableToApplyIncorrectInformationV2Code.IncorrectCreditorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code#Narrative
 * UnableToApplyIncorrectInformationV2Code.Narrative}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
 * UnableToApplyIncorrectInformation4Code}</li>
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
 * <li>"IN01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnableToApplyIncorrectInformationV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason of an unable to apply due to incorrect information."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnableToApplyIncorrectInformationV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Related transaction reference is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related transaction reference is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectRelatedReference = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRelatedReference";
			definition = "Related transaction reference is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN01";
		}
	};
	/**
	 * Payment type service level is incorrect (former
	 * IncorrectBankOperationCode).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentServiceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment type service level is incorrect (former IncorrectBankOperationCode)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectPaymentServiceLevel = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentServiceLevel";
			definition = "Payment type service level is incorrect (former IncorrectBankOperationCode).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN02";
		}
	};
	/**
	 * Payment type category purpose is incorrect (former
	 * IncorrectInstructionCode).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCategoryPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment type category purpose is incorrect (former IncorrectInstructionCode)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectCategoryPurpose = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCategoryPurpose";
			definition = "Payment type category purpose is incorrect (former IncorrectInstructionCode).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN03";
		}
	};
	/**
	 * RequestedExecutionDate is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RequestedExecutionDate is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectRequestedExecutionDate = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRequestedExecutionDate";
			definition = "RequestedExecutionDate is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN04";
		}
	};
	/**
	 * Interbank settlement date is incorrect (former IncorrectValueDate).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interbank settlement date is incorrect (former IncorrectValueDate)."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectInterbankSettlementDate = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInterbankSettlementDate";
			definition = "Interbank settlement date is incorrect (former IncorrectValueDate).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN05";
		}
	};
	/**
	 * Interbank settlement amount is incorrect (former IncorrectSettledAmount).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interbank settlement amount is incorrect (former IncorrectSettledAmount)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectInterbankSettlementAmount = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInterbankSettlementAmount";
			definition = "Interbank settlement amount is incorrect (former IncorrectSettledAmount).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN06";
		}
	};
	/**
	 * Debtor is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN07"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debtor is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectDebtor = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDebtor";
			definition = "Debtor is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN07";
		}
	};
	/**
	 * DebtorAccount is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN08"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DebtorAccount is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectDebtorAccount = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDebtorAccount";
			definition = "DebtorAccount is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN08";
		}
	};
	/**
	 * InstructedReimbursementAgent is incorrect (former
	 * IncorrectReceiverCorrespondent).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN09"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructedReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InstructedReimbursementAgent is incorrect (former IncorrectReceiverCorrespondent)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectInstructedReimbursementAgent = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructedReimbursementAgent";
			definition = "InstructedReimbursementAgent is incorrect (former IncorrectReceiverCorrespondent).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN09";
		}
	};
	/**
	 * ThirdReimbursementAgent is incorrect (former
	 * IncorrectThirdReimbursementInstitution).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN10"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectThirdReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ThirdReimbursementAgent is incorrect (former IncorrectThirdReimbursementInstitution)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectThirdReimbursementAgent = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectThirdReimbursementAgent";
			definition = "ThirdReimbursementAgent is incorrect (former IncorrectThirdReimbursementInstitution).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN10";
		}
	};
	/**
	 * Payment type clearing channel is incorrect (former PaymentScheme).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN11"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentClearingChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment type clearing channel is incorrect (former PaymentScheme)."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectPaymentClearingChannel = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentClearingChannel";
			definition = "Payment type clearing channel is incorrect (former PaymentScheme).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN11";
		}
	};
	/**
	 * CreditorAgentAccount is incorrect (former
	 * IncorrectAccountOfBeneficiaryInstitution).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN12"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CreditorAgentAccount is incorrect (former IncorrectAccountOfBeneficiaryInstitution)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectCreditorAgentAccount = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditorAgentAccount";
			definition = "CreditorAgentAccount is incorrect (former IncorrectAccountOfBeneficiaryInstitution).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN12";
		}
	};
	/**
	 * Creditor is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN13"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creditor is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectCreditor = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditor";
			definition = "Creditor is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN13";
		}
	};
	/**
	 * Creditor account is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN14"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creditor account is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectCreditorAccount = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditorAccount";
			definition = "Creditor account is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN14";
		}
	};
	/**
	 * RemittanceInformation is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN15"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RemittanceInformation is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectRemittanceInformation = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRemittanceInformation";
			definition = "RemittanceInformation is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN15";
		}
	};
	/**
	 * Transaction payment purpose is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN16"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction payment purpose is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectPaymentPurpose = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentPurpose";
			definition = "Transaction payment purpose is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN16";
		}
	};
	/**
	 * ChargeBearer is incorrect (former IncorrectDetailsOfCharges).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN17"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectChargeBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChargeBearer is incorrect (former IncorrectDetailsOfCharges)."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectChargeBearer = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectChargeBearer";
			definition = "ChargeBearer is incorrect (former IncorrectDetailsOfCharges).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN17";
		}
	};
	/**
	 * Instruction for next agent is incorrect (former
	 * IncorrectSenderToReceiverInformation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN18"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructionForNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction for next agent is incorrect (former IncorrectSenderToReceiverInformation)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectInstructionForNextAgent = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructionForNextAgent";
			definition = "Instruction for next agent is incorrect (former IncorrectSenderToReceiverInformation).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN18";
		}
	};
	/**
	 * Instruction for creditor agent is incorrect (former
	 * IncorrectInstructionForFinalAgent).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN19"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructionForCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction for creditor agent is incorrect (former IncorrectInstructionForFinalAgent)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectInstructionForCreditorAgent = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructionForCreditorAgent";
			definition = "Instruction for creditor agent is incorrect (former IncorrectInstructionForFinalAgent).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN19";
		}
	};
	/**
	 * Name and account of creditor are not matching.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM20"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchCreditorNameAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and account of creditor are not matching."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code MismatchCreditorNameAccount = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchCreditorNameAccount";
			definition = "Name and account of creditor are not matching.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM20";
		}
	};
	/**
	 * Name and account of debtor are not matching.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM21"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchDebtorNameAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and account of debtor are not matching."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code MismatchDebtorNameAccount = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchDebtorNameAccount";
			definition = "Name and account of debtor are not matching.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM21";
		}
	};
	/**
	 * Name and account of creditor agent (former FinalAgent) are not matching.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM22"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchCreditorAgentNameAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name and account of creditor agent (former FinalAgent) are not matching."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code MismatchCreditorAgentNameAccount = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchCreditorAgentNameAccount";
			definition = "Name and account of creditor agent (former FinalAgent) are not matching.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM22";
		}
	};
	/**
	 * Insufficient or incoherent details about the debtor with respect to
	 * regulatory requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM23"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientDebtorDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insufficient or incoherent details about the debtor with respect to regulatory requirements."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code InsufficientDebtorDetails = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientDebtorDetails";
			definition = "Insufficient or incoherent details about the debtor with respect to regulatory requirements.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM23";
		}
	};
	/**
	 * Insufficient or incoherent details about the creditor with respect to
	 * regulatory requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM24"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCreditorDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insufficient or incoherent details about the creditor with respect to regulatory requirements."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code InsufficientCreditorDetails = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCreditorDetails";
			definition = "Insufficient or incoherent details about the creditor with respect to regulatory requirements.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM24";
		}
	};
	/**
	 * Payment is pending execution. For reasons of regulatory requirements we
	 * request further information on the account number or unique
	 * identification of the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM25"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingExecutionDebtorAccountOrIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment is pending execution. For reasons of regulatory requirements we request further information on the account number or unique identification of the debtor."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code PendingExecutionDebtorAccountOrIdentification = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingExecutionDebtorAccountOrIdentification";
			definition = "Payment is pending execution. For reasons of regulatory requirements we request further information on the account number or unique identification of the debtor.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM25";
		}
	};
	/**
	 * Payment is pending execution. For reasons of regulatory requirements we
	 * request further information on the name and/or address of the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM26"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingExecutionDebtorNameOrAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment is pending execution. For reasons of regulatory requirements we request further information on the name and/or address of the debtor."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code PendingExecutionDebtorNameOrAddress = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingExecutionDebtorNameOrAddress";
			definition = "Payment is pending execution. For reasons of regulatory requirements we request further information on the name and/or address of the debtor.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM26";
		}
	};
	/**
	 * Payment has been executed. For reasons of regulatory requirements we
	 * request further information on the account number or unique
	 * identification of the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM27"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecutedDebtorAccountOrIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment has been executed. For reasons of regulatory requirements we request further information on the account number or unique identification of the debtor."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code PaymentExecutedDebtorAccountOrIdentification = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentExecutedDebtorAccountOrIdentification";
			definition = "Payment has been executed. For reasons of regulatory requirements we request further information on the account number or unique identification of the debtor.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM27";
		}
	};
	/**
	 * Payment has been executed. For reasons of regulatory requirements we
	 * request further information on the name and/or address of the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM28"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecutedDebtorNameOrAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment has been executed. For reasons of regulatory requirements we request further information on the name and/or address of the debtor."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code PaymentExecutedDebtorNameOrAddress = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentExecutedDebtorNameOrAddress";
			definition = "Payment has been executed. For reasons of regulatory requirements we request further information on the name and/or address of the debtor.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM28";
		}
	};
	/**
	 * Payment is pending execution. For reasons of regulatory requirements we
	 * request further information on the account number or unique
	 * identification of the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM29"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingExecutionCreditorAccountOrIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment is pending execution. For reasons of regulatory requirements we request further information on the account number or unique identification of the creditor."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code PendingExecutionCreditorAccountOrIdentification = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingExecutionCreditorAccountOrIdentification";
			definition = "Payment is pending execution. For reasons of regulatory requirements we request further information on the account number or unique identification of the creditor.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM29";
		}
	};
	/**
	 * Payment is pending execution. For reasons of regulatory requirements we
	 * request further information on the name and/or address of the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM30"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingExecutionCreditorNameOrAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment is pending execution. For reasons of regulatory requirements we request further information on the name and/or address of the creditor."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code PendingExecutionCreditorNameOrAddress = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingExecutionCreditorNameOrAddress";
			definition = "Payment is pending execution. For reasons of regulatory requirements we request further information on the name and/or address of the creditor.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM30";
		}
	};
	/**
	 * Payment has been executed. For reasons of regulatory requirements we
	 * request further information on the account number or unique
	 * identification of the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM31"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecutedCreditorAccountOrIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment has been executed. For reasons of regulatory requirements we request further information on the account number or unique identification of the creditor."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code PaymentExecutedCreditorAccountOrIdentification = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentExecutedCreditorAccountOrIdentification";
			definition = "Payment has been executed. For reasons of regulatory requirements we request further information on the account number or unique identification of the creditor.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM31";
		}
	};
	/**
	 * Payment has been executed. For reasons of regulatory requirements we
	 * request further information on the name and/or address of the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM32"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecutedCreditorNameOrAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment has been executed. For reasons of regulatory requirements we request further information on the name and/or address of the creditor."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code PaymentExecutedCreditorNameOrAddress = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentExecutedCreditorNameOrAddress";
			definition = "Payment has been executed. For reasons of regulatory requirements we request further information on the name and/or address of the creditor.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM32";
		}
	};
	/**
	 * Amount in statement entry is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN33"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectReportEntryAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount in statement entry is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectReportEntryAmount = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectReportEntryAmount";
			definition = "Amount in statement entry is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN33";
		}
	};
	/**
	 * Insufficient charges details provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM34"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientChargesDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient charges details provided."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code InsufficientChargesDetails = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientChargesDetails";
			definition = "Insufficient charges details provided.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM34";
		}
	};
	/**
	 * Payment purpose needs to be further specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM35"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientPaymentPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment purpose needs to be further specified."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code InsufficientPaymentPurpose = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientPaymentPurpose";
			definition = "Payment purpose needs to be further specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "MM35";
		}
	};
	/**
	 * SettlementAccount is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN36"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectSettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "SettlementAccount is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectSettlementAccount = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectSettlementAccount";
			definition = "SettlementAccount is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN36";
		}
	};
	/**
	 * Instructing reimbursement agent is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN37"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructingReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instructing reimbursement agent is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectInstructingReimbursementAgent = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructingReimbursementAgent";
			definition = "Instructing reimbursement agent is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN37";
		}
	};
	/**
	 * Debtor's address is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN38"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtorAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debtor's address is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectDebtorAddress = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDebtorAddress";
			definition = "Debtor's address is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN38";
		}
	};
	/**
	 * Creditor's address is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN39"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditorAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creditor's address is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code IncorrectCreditorAddress = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditorAddress";
			definition = "Creditor's address is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "IN39";
		}
	};
	/**
	 * See narrative field for additional information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
	 * UnableToApplyIncorrectInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Narrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "See narrative field for additional information."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformationV2Code Narrative = new UnableToApplyIncorrectInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Narrative";
			definition = "See narrative field for additional information.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.mmObject();
			codeName = "NARR";
		}
	};
	final static private LinkedHashMap<String, UnableToApplyIncorrectInformationV2Code> codesByName = new LinkedHashMap<>();

	protected UnableToApplyIncorrectInformationV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("IN01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyIncorrectInformationV2Code";
				definition = "Specifies the reason of an unable to apply due to incorrect information.";
				derivation_lazy = () -> Arrays.asList(UnableToApplyIncorrectInformation4Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectRelatedReference,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectPaymentServiceLevel, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectCategoryPurpose,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectRequestedExecutionDate, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectInterbankSettlementDate,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectInterbankSettlementAmount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectDebtor,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectDebtorAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectInstructedReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectThirdReimbursementAgent, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectPaymentClearingChannel,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectCreditorAgentAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectCreditor,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectCreditorAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectRemittanceInformation,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectPaymentPurpose, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectChargeBearer,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectInstructionForNextAgent,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectInstructionForCreditorAgent, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.MismatchCreditorNameAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.MismatchDebtorNameAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.MismatchCreditorAgentNameAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.InsufficientDebtorDetails, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.InsufficientCreditorDetails,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.PendingExecutionDebtorAccountOrIdentification,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.PendingExecutionDebtorNameOrAddress,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.PaymentExecutedDebtorAccountOrIdentification,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.PaymentExecutedDebtorNameOrAddress,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.PendingExecutionCreditorAccountOrIdentification,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.PendingExecutionCreditorNameOrAddress,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.PaymentExecutedCreditorAccountOrIdentification,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.PaymentExecutedCreditorNameOrAddress, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectReportEntryAmount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.InsufficientChargesDetails, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.InsufficientPaymentPurpose,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectSettlementAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectInstructingReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectDebtorAddress, com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.IncorrectCreditorAddress,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code.Narrative);
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
		codesByName.put(InsufficientDebtorDetails.getCodeName().get(), InsufficientDebtorDetails);
		codesByName.put(InsufficientCreditorDetails.getCodeName().get(), InsufficientCreditorDetails);
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

	public static UnableToApplyIncorrectInformationV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnableToApplyIncorrectInformationV2Code[] values() {
		UnableToApplyIncorrectInformationV2Code[] values = new UnableToApplyIncorrectInformationV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnableToApplyIncorrectInformationV2Code> {
		@Override
		public UnableToApplyIncorrectInformationV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnableToApplyIncorrectInformationV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}