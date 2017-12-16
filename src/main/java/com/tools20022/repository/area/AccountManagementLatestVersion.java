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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the management of account related activities, such as
 * the opening and maintenance of an account
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "acmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02
 * AccountAdditionalInformationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02
 * AccountClosingAdditionalInformationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02
 * AccountClosingAmendmentRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02
 * AccountClosingRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02
 * AccountExcludedMandateMaintenanceAmendmentRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02
 * AccountExcludedMandateMaintenanceRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02
 * AccountMandateMaintenanceAmendmentRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02
 * AccountMandateMaintenanceRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02
 * AccountOpeningAdditionalInformationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02
 * AccountOpeningAmendmentRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV02
 * AccountOpeningRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV02
 * AccountReportRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountReportV02
 * AccountReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02
 * AccountRequestAcknowledgementV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV02
 * AccountRequestRejectionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02
 * IdentificationModificationAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationRequestV02
 * IdentificationVerificationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02
 * IdentificationVerificationReportV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmcatalogue
 * GeneratedRepository.mmcatalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Account Management - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the management of account related activities, such as the opening and maintenance of an account"
 * </li>
 * </ul>
 */
public class AccountManagementLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Account Management - Latest version - master";
				definition = "Messages that support the management of account related activities, such as the opening and maintenance of an account";
				code = "acmt";
				messageDefinition_lazy = () -> Arrays.asList(AccountAdditionalInformationRequestV02.mmObject(), AccountClosingAdditionalInformationRequestV02.mmObject(), AccountClosingAmendmentRequestV02.mmObject(),
						AccountClosingRequestV02.mmObject(), AccountExcludedMandateMaintenanceAmendmentRequestV02.mmObject(), AccountExcludedMandateMaintenanceRequestV02.mmObject(), AccountMandateMaintenanceAmendmentRequestV02.mmObject(),
						AccountMandateMaintenanceRequestV02.mmObject(), AccountOpeningAdditionalInformationRequestV02.mmObject(), AccountOpeningAmendmentRequestV02.mmObject(), AccountOpeningRequestV02.mmObject(),
						AccountReportRequestV02.mmObject(), AccountReportV02.mmObject(), AccountRequestAcknowledgementV02.mmObject(), AccountRequestRejectionV02.mmObject(), IdentificationModificationAdviceV02.mmObject(),
						IdentificationVerificationRequestV02.mmObject(), IdentificationVerificationReportV02.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}