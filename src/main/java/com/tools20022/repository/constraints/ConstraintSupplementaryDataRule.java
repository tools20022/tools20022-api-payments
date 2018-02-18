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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.pacs.*;
import com.tools20022.repository.area.pain.*;
import com.tools20022.repository.msg.SupplementaryData1;

/**
 * The SupplementaryData building block at message level must not be used to
 * provide additional information about a transaction. The SupplementaryData
 * element at transaction level should be used for that purpose.
 */
public class ConstraintSupplementaryDataRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV05
	 * MandateAcceptanceReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forMandateAcceptanceReportV05 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> MandateAcceptanceReportV05.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkMandateAcceptanceReportV05((MandateAcceptanceReportV05) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV05
	 * MandateAmendmentRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forMandateAmendmentRequestV05 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> MandateAmendmentRequestV05.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkMandateAmendmentRequestV05((MandateAmendmentRequestV05) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV05
	 * MandateInitiationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forMandateInitiationRequestV05 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> MandateInitiationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkMandateInitiationRequestV05((MandateInitiationRequestV05) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08
	 * CustomerCreditTransferInitiationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCustomerCreditTransferInitiationV08 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> CustomerCreditTransferInitiationV08.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCustomerCreditTransferInitiationV08((CustomerCreditTransferInitiationV08) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV05
	 * MandateCancellationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forMandateCancellationRequestV05 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> MandateCancellationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkMandateCancellationRequestV05((MandateCancellationRequestV05) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07
	 * CustomerDirectDebitInitiationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCustomerDirectDebitInitiationV07 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> CustomerDirectDebitInitiationV07.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCustomerDirectDebitInitiationV07((CustomerDirectDebitInitiationV07) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06
	 * CreditorPaymentActivationRequestStatusReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCreditorPaymentActivationRequestStatusReportV06 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV06.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCreditorPaymentActivationRequestStatusReportV06((CreditorPaymentActivationRequestStatusReportV06) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08
	 * CustomerPaymentStatusReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCustomerPaymentStatusReportV08 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> CustomerPaymentStatusReportV08.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCustomerPaymentStatusReportV08((CustomerPaymentStatusReportV08) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV06
	 * CreditorPaymentActivationRequestV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCreditorPaymentActivationRequestV06 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> CreditorPaymentActivationRequestV06.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCreditorPaymentActivationRequestV06((CreditorPaymentActivationRequestV06) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07
	 * CustomerPaymentReversalV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCustomerPaymentReversalV07 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> CustomerPaymentReversalV07.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCustomerPaymentReversalV07((CustomerPaymentReversalV07) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateSuspensionRequestV01
	 * MandateSuspensionRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forMandateSuspensionRequestV01 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> MandateSuspensionRequestV01.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkMandateSuspensionRequestV01((MandateSuspensionRequestV01) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateCopyRequestV01
	 * MandateCopyRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forMandateCopyRequestV01 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> MandateCopyRequestV01.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkMandateCopyRequestV01((MandateCopyRequestV01) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV06
	 * BankToCustomerAccountReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forBankToCustomerAccountReportV06 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> BankToCustomerAccountReportV06.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkBankToCustomerAccountReportV06((BankToCustomerAccountReportV06) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV06
	 * BankToCustomerStatementV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forBankToCustomerStatementV06 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> BankToCustomerStatementV06.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkBankToCustomerStatementV06((BankToCustomerStatementV06) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06
	 * BankToCustomerDebitCreditNotificationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forBankToCustomerDebitCreditNotificationV06 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> BankToCustomerDebitCreditNotificationV06.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkBankToCustomerDebitCreditNotificationV06((BankToCustomerDebitCreditNotificationV06) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06
	 * CustomerPaymentCancellationRequestV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCustomerPaymentCancellationRequestV06 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> CustomerPaymentCancellationRequestV06.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCustomerPaymentCancellationRequestV06((CustomerPaymentCancellationRequestV06) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06
	 * FIToFIPaymentCancellationRequestV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFIToFIPaymentCancellationRequestV06 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> FIToFIPaymentCancellationRequestV06.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFIToFIPaymentCancellationRequestV06((FIToFIPaymentCancellationRequestV06) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06
	 * FinancialInstitutionCreditTransferV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFinancialInstitutionCreditTransferV06 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> FinancialInstitutionCreditTransferV06.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFinancialInstitutionCreditTransferV06((FinancialInstitutionCreditTransferV06) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06
	 * FIToFICustomerCreditTransferV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFIToFICustomerCreditTransferV06 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> FIToFICustomerCreditTransferV06.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFIToFICustomerCreditTransferV06((FIToFICustomerCreditTransferV06) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionDirectDebitV02
	 * FinancialInstitutionDirectDebitV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFinancialInstitutionDirectDebitV02 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> FinancialInstitutionDirectDebitV02.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFinancialInstitutionDirectDebitV02((FinancialInstitutionDirectDebitV02) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01
	 * FIToFIPaymentStatusRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFIToFIPaymentStatusRequestV01 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> FIToFIPaymentStatusRequestV01.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFIToFIPaymentStatusRequestV01((FIToFIPaymentStatusRequestV01) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV07
	 * PaymentReturnV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forPaymentReturnV07 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> PaymentReturnV07.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkPaymentReturnV07((PaymentReturnV07) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08
	 * FIToFIPaymentStatusReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFIToFIPaymentStatusReportV08 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> FIToFIPaymentStatusReportV08.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFIToFIPaymentStatusReportV08((FIToFIPaymentStatusReportV08) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07
	 * FIToFIPaymentReversalV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFIToFIPaymentReversalV07 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> FIToFIPaymentReversalV07.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFIToFIPaymentReversalV07((FIToFIPaymentReversalV07) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07
	 * FIToFICustomerDirectDebitV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFIToFICustomerDirectDebitV07 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> FIToFICustomerDirectDebitV07.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFIToFICustomerDirectDebitV07((FIToFICustomerDirectDebitV07) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This component may not be used without the explicit approval of a SEG and submission to the RA of ISO 20022 compliant structure(s) to be used in the Envelope element."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forSupplementaryData1 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "This component may not be used without the explicit approval of a SEG and submission to the RA of ISO 20022 compliant structure(s) to be used in the Envelope element.";
			owner_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkSupplementaryData1((SupplementaryData1) obj);
		}
	};

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateAcceptanceReportV05(MandateAcceptanceReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateAmendmentRequestV05(MandateAmendmentRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateInitiationRequestV05(MandateInitiationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerCreditTransferInitiationV08(CustomerCreditTransferInitiationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateCancellationRequestV05(MandateCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerDirectDebitInitiationV07(CustomerDirectDebitInitiationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCreditorPaymentActivationRequestStatusReportV06(CreditorPaymentActivationRequestStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentStatusReportV08(CustomerPaymentStatusReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCreditorPaymentActivationRequestV06(CreditorPaymentActivationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentReversalV07(CustomerPaymentReversalV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateSuspensionRequestV01(MandateSuspensionRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateCopyRequestV01(MandateCopyRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerAccountReportV06(BankToCustomerAccountReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerStatementV06(BankToCustomerStatementV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerDebitCreditNotificationV06(BankToCustomerDebitCreditNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentCancellationRequestV06(CustomerPaymentCancellationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentCancellationRequestV06(FIToFIPaymentCancellationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFinancialInstitutionCreditTransferV06(FinancialInstitutionCreditTransferV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFICustomerCreditTransferV06(FIToFICustomerCreditTransferV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFinancialInstitutionDirectDebitV02(FinancialInstitutionDirectDebitV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentStatusRequestV01(FIToFIPaymentStatusRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkPaymentReturnV07(PaymentReturnV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentStatusReportV08(FIToFIPaymentStatusReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentReversalV07(FIToFIPaymentReversalV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFICustomerDirectDebitV07(FIToFICustomerDirectDebitV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * This component may not be used without the explicit approval of a SEG and
	 * submission to the RA of ISO 20022 compliant structure(s) to be used in
	 * the Envelope element.
	 */
	public static void checkSupplementaryData1(SupplementaryData1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}