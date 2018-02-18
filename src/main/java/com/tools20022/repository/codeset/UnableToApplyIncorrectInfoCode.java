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
import com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Used when the unable to apply is due to incorrect information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectRelatedReference
 * UnableToApplyIncorrectInfoCode.IncorrectRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectBankOperationCode
 * UnableToApplyIncorrectInfoCode.IncorrectBankOperationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectInstructionCode
 * UnableToApplyIncorrectInfoCode.IncorrectInstructionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectRequestedExecutionDate
 * UnableToApplyIncorrectInfoCode.IncorrectRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectValueDate
 * UnableToApplyIncorrectInfoCode.IncorrectValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectInterbankSettledAmount
 * UnableToApplyIncorrectInfoCode.IncorrectInterbankSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectDebtor
 * UnableToApplyIncorrectInfoCode.IncorrectDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectDebtorAccount
 * UnableToApplyIncorrectInfoCode.IncorrectDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectReceiverCorrespondent
 * UnableToApplyIncorrectInfoCode.IncorrectReceiverCorrespondent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectThirdReimbursementInstitution
 * UnableToApplyIncorrectInfoCode.IncorrectThirdReimbursementInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectPaymentScheme
 * UnableToApplyIncorrectInfoCode.IncorrectPaymentScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectAccountOfBeneficiaryInstitution
 * UnableToApplyIncorrectInfoCode.IncorrectAccountOfBeneficiaryInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectCreditor
 * UnableToApplyIncorrectInfoCode.IncorrectCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectCreditorAccount
 * UnableToApplyIncorrectInfoCode.IncorrectCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectRemittanceInformation
 * UnableToApplyIncorrectInfoCode.IncorrectRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectPaymentPurpose
 * UnableToApplyIncorrectInfoCode.IncorrectPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectDetailsOfCharges
 * UnableToApplyIncorrectInfoCode.IncorrectDetailsOfCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectSenderToReceiverInformation
 * UnableToApplyIncorrectInfoCode.IncorrectSenderToReceiverInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#IncorrectInstructionForFinalAgent
 * UnableToApplyIncorrectInfoCode.IncorrectInstructionForFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#MismatchCreditorNameAccount
 * UnableToApplyIncorrectInfoCode.MismatchCreditorNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#MismatchDebtorNameAccount
 * UnableToApplyIncorrectInfoCode.MismatchDebtorNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#MismatchFinalAgentNameAccount
 * UnableToApplyIncorrectInfoCode.MismatchFinalAgentNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#InsufficientDebtorDetails
 * UnableToApplyIncorrectInfoCode.InsufficientDebtorDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode#InsufficientCreditorDetails
 * UnableToApplyIncorrectInfoCode.InsufficientCreditorDetails}</li>
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
 * "UnableToApplyIncorrectInfoCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Used when the unable to apply is due to incorrect information."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnableToApplyIncorrectInfoCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * RelatedReference is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RelatedReference is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectRelatedReference = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectRelatedReference";
			definition = "RelatedReference is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN01";
		}
	};
	/**
	 * BankOperationCode is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectBankOperationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "BankOperationCode is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectBankOperationCode = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectBankOperationCode";
			definition = "BankOperationCode is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN02";
		}
	};
	/**
	 * InstructionCode is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "InstructionCode is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectInstructionCode = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectInstructionCode";
			definition = "InstructionCode is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN03";
		}
	};
	/**
	 * RequestedExecutionDate is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RequestedExecutionDate is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectRequestedExecutionDate = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectRequestedExecutionDate";
			definition = "RequestedExecutionDate is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN04";
		}
	};
	/**
	 * ValueDate is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ValueDate is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectValueDate = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectValueDate";
			definition = "ValueDate is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN05";
		}
	};
	/**
	 * InterbankSettledAmount is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInterbankSettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "InterbankSettledAmount is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectInterbankSettledAmount = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectInterbankSettledAmount";
			definition = "InterbankSettledAmount is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN06";
		}
	};
	/**
	 * Debtor is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN07"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debtor is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectDebtor = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectDebtor";
			definition = "Debtor is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN07";
		}
	};
	/**
	 * DebtorAccount is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN08"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DebtorAccount is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectDebtorAccount = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectDebtorAccount";
			definition = "DebtorAccount is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN08";
		}
	};
	/**
	 * ReceiverCorrespondent is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN09"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectReceiverCorrespondent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ReceiverCorrespondent is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectReceiverCorrespondent = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectReceiverCorrespondent";
			definition = "ReceiverCorrespondent is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN09";
		}
	};
	/**
	 * ThirdReimbursementInstitution is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN10"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectThirdReimbursementInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ThirdReimbursementInstitution is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectThirdReimbursementInstitution = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectThirdReimbursementInstitution";
			definition = "ThirdReimbursementInstitution is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN10";
		}
	};
	/**
	 * PaymentScheme is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN11"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "PaymentScheme is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectPaymentScheme = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectPaymentScheme";
			definition = "PaymentScheme is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN11";
		}
	};
	/**
	 * AccountOfBeneficiaryInstitution is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN12"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAccountOfBeneficiaryInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "AccountOfBeneficiaryInstitution is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectAccountOfBeneficiaryInstitution = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectAccountOfBeneficiaryInstitution";
			definition = "AccountOfBeneficiaryInstitution is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN12";
		}
	};
	/**
	 * Creditor is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN13"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creditor is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectCreditor = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectCreditor";
			definition = "Creditor is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN13";
		}
	};
	/**
	 * CreditorAccount is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN14"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CreditorAccount is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectCreditorAccount = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectCreditorAccount";
			definition = "CreditorAccount is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN14";
		}
	};
	/**
	 * RemittanceInformation is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN15"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RemittanceInformation is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectRemittanceInformation = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectRemittanceInformation";
			definition = "RemittanceInformation is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN15";
		}
	};
	/**
	 * PaymentPurpose is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN16"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "PaymentPurpose is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectPaymentPurpose = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectPaymentPurpose";
			definition = "PaymentPurpose is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN16";
		}
	};
	/**
	 * DetailsOfCharges is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN17"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDetailsOfCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DetailsOfCharges is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectDetailsOfCharges = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectDetailsOfCharges";
			definition = "DetailsOfCharges is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN17";
		}
	};
	/**
	 * SenderToReceiverInformation is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN18"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectSenderToReceiverInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "SenderToReceiverInformation is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectSenderToReceiverInformation = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectSenderToReceiverInformation";
			definition = "SenderToReceiverInformation is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN18";
		}
	};
	/**
	 * InstructionForFinalAgent is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IN19"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructionForFinalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "InstructionForFinalAgent is incorrect."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode IncorrectInstructionForFinalAgent = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectInstructionForFinalAgent";
			definition = "InstructionForFinalAgent is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "IN19";
		}
	};
	/**
	 * Name and Account of Creditor mismatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM20"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchCreditorNameAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and Account of Creditor mismatched."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode MismatchCreditorNameAccount = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MismatchCreditorNameAccount";
			definition = "Name and Account of Creditor mismatched.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "MM20";
		}
	};
	/**
	 * Name and Account of Debtor mismatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM21"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchDebtorNameAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and Account of Debtor mismatched."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode MismatchDebtorNameAccount = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MismatchDebtorNameAccount";
			definition = "Name and Account of Debtor mismatched.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "MM21";
		}
	};
	/**
	 * Name and Account of FinalAgent mismatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM22"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchFinalAgentNameAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and Account of FinalAgent mismatched."</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode MismatchFinalAgentNameAccount = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MismatchFinalAgentNameAccount";
			definition = "Name and Account of FinalAgent mismatched.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM23"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientDebtorDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insufficient or incoherent details about the debtor with respect to regulatory requirements."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode InsufficientDebtorDetails = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsufficientDebtorDetails";
			definition = "Insufficient or incoherent details about the debtor with respect to regulatory requirements.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM24"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCreditorDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insufficient or incoherent details about the creditor with respect to regulatory requirements."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfoCode InsufficientCreditorDetails = new UnableToApplyIncorrectInfoCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsufficientCreditorDetails";
			definition = "Insufficient or incoherent details about the creditor with respect to regulatory requirements.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.mmObject();
			codeName = "MM24";
		}
	};
	final static private LinkedHashMap<String, UnableToApplyIncorrectInfoCode> codesByName = new LinkedHashMap<>();

	protected UnableToApplyIncorrectInfoCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("IN01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyIncorrectInfoCode";
				definition = "Used when the unable to apply is due to incorrect information.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectRelatedReference, com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectBankOperationCode,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectInstructionCode, com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectRequestedExecutionDate,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectValueDate, com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectInterbankSettledAmount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectDebtor, com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectDebtorAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectReceiverCorrespondent, com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectThirdReimbursementInstitution,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectPaymentScheme, com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectAccountOfBeneficiaryInstitution,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectCreditor, com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectCreditorAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectRemittanceInformation, com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectPaymentPurpose,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectDetailsOfCharges, com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectSenderToReceiverInformation,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.IncorrectInstructionForFinalAgent, com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.MismatchCreditorNameAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.MismatchDebtorNameAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.MismatchFinalAgentNameAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.InsufficientDebtorDetails, com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode.InsufficientCreditorDetails);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IncorrectRelatedReference.getCodeName().get(), IncorrectRelatedReference);
		codesByName.put(IncorrectBankOperationCode.getCodeName().get(), IncorrectBankOperationCode);
		codesByName.put(IncorrectInstructionCode.getCodeName().get(), IncorrectInstructionCode);
		codesByName.put(IncorrectRequestedExecutionDate.getCodeName().get(), IncorrectRequestedExecutionDate);
		codesByName.put(IncorrectValueDate.getCodeName().get(), IncorrectValueDate);
		codesByName.put(IncorrectInterbankSettledAmount.getCodeName().get(), IncorrectInterbankSettledAmount);
		codesByName.put(IncorrectDebtor.getCodeName().get(), IncorrectDebtor);
		codesByName.put(IncorrectDebtorAccount.getCodeName().get(), IncorrectDebtorAccount);
		codesByName.put(IncorrectReceiverCorrespondent.getCodeName().get(), IncorrectReceiverCorrespondent);
		codesByName.put(IncorrectThirdReimbursementInstitution.getCodeName().get(), IncorrectThirdReimbursementInstitution);
		codesByName.put(IncorrectPaymentScheme.getCodeName().get(), IncorrectPaymentScheme);
		codesByName.put(IncorrectAccountOfBeneficiaryInstitution.getCodeName().get(), IncorrectAccountOfBeneficiaryInstitution);
		codesByName.put(IncorrectCreditor.getCodeName().get(), IncorrectCreditor);
		codesByName.put(IncorrectCreditorAccount.getCodeName().get(), IncorrectCreditorAccount);
		codesByName.put(IncorrectRemittanceInformation.getCodeName().get(), IncorrectRemittanceInformation);
		codesByName.put(IncorrectPaymentPurpose.getCodeName().get(), IncorrectPaymentPurpose);
		codesByName.put(IncorrectDetailsOfCharges.getCodeName().get(), IncorrectDetailsOfCharges);
		codesByName.put(IncorrectSenderToReceiverInformation.getCodeName().get(), IncorrectSenderToReceiverInformation);
		codesByName.put(IncorrectInstructionForFinalAgent.getCodeName().get(), IncorrectInstructionForFinalAgent);
		codesByName.put(MismatchCreditorNameAccount.getCodeName().get(), MismatchCreditorNameAccount);
		codesByName.put(MismatchDebtorNameAccount.getCodeName().get(), MismatchDebtorNameAccount);
		codesByName.put(MismatchFinalAgentNameAccount.getCodeName().get(), MismatchFinalAgentNameAccount);
		codesByName.put(InsufficientDebtorDetails.getCodeName().get(), InsufficientDebtorDetails);
		codesByName.put(InsufficientCreditorDetails.getCodeName().get(), InsufficientCreditorDetails);
	}

	public static UnableToApplyIncorrectInfoCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnableToApplyIncorrectInfoCode[] values() {
		UnableToApplyIncorrectInfoCode[] values = new UnableToApplyIncorrectInfoCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnableToApplyIncorrectInfoCode> {
		@Override
		public UnableToApplyIncorrectInfoCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnableToApplyIncorrectInfoCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}