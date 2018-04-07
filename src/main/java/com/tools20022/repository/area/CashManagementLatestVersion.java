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

package com.tools20022.repository.area;

import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the reporting and advicing of the cash side of any
 * financial transactions, including cash movements, transactions and balances,
 * plus any exceptions and investigations related to cash transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "camt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04
 * NotificationOfCaseAssignmentV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CancelCaseAssignmentV03
 * CancelCaseAssignmentV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequestV03
 * CaseStatusReportRequestV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04
 * CaseStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankServicesBillingStatementV02
 * BankServicesBillingStatementV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV05
 * NotificationToReceiveStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV05
 * NotificationToReceiveCancellationAdviceV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.NotificationToReceiveV05
 * NotificationToReceiveV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV07
 * BankToCustomerAccountReportV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV07
 * FIToFIPaymentCancellationRequestV07}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.DuplicateV05
 * DuplicateV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.RejectInvestigationV05
 * RejectInvestigationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV04
 * ProprietaryFormatInvestigationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.RequestForDuplicateV05
 * RequestForDuplicateV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV05
 * RequestToModifyPaymentV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV06
 * ClaimNonReceiptV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07
 * BankToCustomerStatementV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV06
 * DebitAuthorisationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08
 * ResolutionOfInvestigationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV04
 * DebitAuthorisationResponseV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV06
 * UnableToApplyV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AccountReportingRequestV04
 * AccountReportingRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV07
 * BankToCustomerDebitCreditNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV08
 * AdditionalPaymentInformationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV07
 * CustomerPaymentCancellationRequestV07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Cash Management - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the reporting and advicing of the cash side of any financial transactions, including cash movements, transactions and balances, plus any exceptions and investigations related to cash transactions."
 * </li>
 * </ul>
 */
public class CashManagementLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cash Management - Latest version - master";
				definition = "Messages that support the reporting and advicing of the cash side of any financial transactions, including cash movements, transactions and balances, plus any exceptions and investigations related to cash transactions.";
				code = "camt";
				messageDefinition_lazy = () -> Arrays.asList(NotificationOfCaseAssignmentV04.mmObject(), CancelCaseAssignmentV03.mmObject(), CaseStatusReportRequestV03.mmObject(), CaseStatusReportV04.mmObject(),
						BankServicesBillingStatementV02.mmObject(), NotificationToReceiveStatusReportV05.mmObject(), NotificationToReceiveCancellationAdviceV05.mmObject(), NotificationToReceiveV05.mmObject(),
						BankToCustomerAccountReportV07.mmObject(), FIToFIPaymentCancellationRequestV07.mmObject(), DuplicateV05.mmObject(), RejectInvestigationV05.mmObject(), ProprietaryFormatInvestigationV04.mmObject(),
						RequestForDuplicateV05.mmObject(), RequestToModifyPaymentV05.mmObject(), ClaimNonReceiptV06.mmObject(), BankToCustomerStatementV07.mmObject(), DebitAuthorisationRequestV06.mmObject(),
						ResolutionOfInvestigationV08.mmObject(), DebitAuthorisationResponseV04.mmObject(), UnableToApplyV06.mmObject(), AccountReportingRequestV04.mmObject(), BankToCustomerDebitCreditNotificationV07.mmObject(),
						AdditionalPaymentInformationV08.mmObject(), CustomerPaymentCancellationRequestV07.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}