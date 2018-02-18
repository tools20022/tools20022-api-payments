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
import com.tools20022.repository.area.pain.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the initiation of a payment from the ordering customer
 * to a financial institution that services a cash account and reporting its
 * status
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "pain"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV05
 * MandateAcceptanceReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV05
 * MandateAmendmentRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV05
 * MandateInitiationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08
 * CustomerCreditTransferInitiationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV05
 * MandateCancellationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07
 * CustomerDirectDebitInitiationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06
 * CreditorPaymentActivationRequestStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08
 * CustomerPaymentStatusReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV06
 * CreditorPaymentActivationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07
 * CustomerPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateSuspensionRequestV01
 * MandateSuspensionRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.pain.MandateCopyRequestV01
 * MandateCopyRequestV01}</li>
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
 * "Payments Initiation - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the initiation of a payment from the ordering customer to a financial institution that services a cash account and reporting its status"
 * </li>
 * </ul>
 */
public class PaymentsInitiationLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Payments Initiation - Latest version - master";
				definition = "Messages that support the initiation of a payment from the ordering customer to a financial institution that services a cash account and reporting its status";
				messageDefinition_lazy = () -> Arrays.asList(MandateAcceptanceReportV05.mmObject(), MandateAmendmentRequestV05.mmObject(), MandateInitiationRequestV05.mmObject(), CustomerCreditTransferInitiationV08.mmObject(),
						MandateCancellationRequestV05.mmObject(), CustomerDirectDebitInitiationV07.mmObject(), CreditorPaymentActivationRequestStatusReportV06.mmObject(), CustomerPaymentStatusReportV08.mmObject(),
						CreditorPaymentActivationRequestV06.mmObject(), CustomerPaymentReversalV07.mmObject(), MandateSuspensionRequestV01.mmObject(), MandateCopyRequestV01.mmObject());
				code = "pain";
			}
		});
		return mmObject_lazy.get();
	}
}