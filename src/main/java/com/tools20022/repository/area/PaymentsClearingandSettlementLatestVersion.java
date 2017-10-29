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
import com.tools20022.repository.area.pacs.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the clearing and settlement processes for payment
 * transactions between financial institutions
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "pacs"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06
 * FinancialInstitutionCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06
 * FIToFICustomerCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionDirectDebitV02
 * FinancialInstitutionDirectDebitV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01
 * FIToFIPaymentStatusRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.PaymentReturnV07
 * PaymentReturnV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08
 * FIToFIPaymentStatusReportV08}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07
 * FIToFIPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07
 * FIToFICustomerDirectDebitV07}</li>
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
 * "Payments Clearing and Settlement - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the clearing and settlement processes for payment transactions between financial institutions "
 * </li>
 * </ul>
 */
public class PaymentsClearingandSettlementLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Payments Clearing and Settlement - Latest version - master";
				definition = "Messages that support the clearing and settlement processes for payment transactions between financial institutions ";
				messageDefinition_lazy = () -> Arrays.asList(FinancialInstitutionCreditTransferV06.mmObject(), FIToFICustomerCreditTransferV06.mmObject(), FinancialInstitutionDirectDebitV02.mmObject(),
						FIToFIPaymentStatusRequestV01.mmObject(), PaymentReturnV07.mmObject(), FIToFIPaymentStatusReportV08.mmObject(), FIToFIPaymentReversalV07.mmObject(), FIToFICustomerDirectDebitV07.mmObject());
				code = "pacs";
			}
		});
		return mmObject_lazy.get();
	}
}