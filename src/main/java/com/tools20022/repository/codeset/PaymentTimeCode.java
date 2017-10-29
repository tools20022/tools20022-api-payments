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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the payment conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode#PaymentOnDelivery
 * PaymentTimeCode.PaymentOnDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode#EndOfMonthOfDelivery
 * PaymentTimeCode.EndOfMonthOfDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode#EndOfPeriodAfterDelivery
 * PaymentTimeCode.EndOfPeriodAfterDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode#EndOfPeriodAfterEndOfDeliveryMonth
 * PaymentTimeCode.EndOfPeriodAfterEndOfDeliveryMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode#PaymentOnReceiptOfInvoice
 * PaymentTimeCode.PaymentOnReceiptOfInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode#EndOfPeriodAfterEndOfReceiptMonth
 * PaymentTimeCode.EndOfPeriodAfterEndOfReceiptMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode#EndOfPeriodAfterReceipt
 * PaymentTimeCode.EndOfPeriodAfterReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode#EndOfMonthOfReceipt
 * PaymentTimeCode.EndOfMonthOfReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode#EndOfPeriodAfterMatch
 * PaymentTimeCode.EndOfPeriodAfterMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode#EndOfPeriodAfterShipmentDate
 * PaymentTimeCode.EndOfPeriodAfterShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode#EndOfPeriodAfterPurchaseOrderDate
 * PaymentTimeCode.EndOfPeriodAfterPurchaseOrderDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode#EndOfPeriodAfterBaselineEstablishment
 * PaymentTimeCode.EndOfPeriodAfterBaselineEstablishment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode#EndOfPeriodAfterInvoiceDate
 * PaymentTimeCode.EndOfPeriodAfterInvoiceDate}</li>
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
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTimeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the payment conditions."</li>
 * </ul>
 */
public class PaymentTimeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code for payment on delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
	 * PaymentTimeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOnDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for payment on delivery."</li>
	 * </ul>
	 */
	public static final MMCode PaymentOnDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOnDelivery";
			definition = "Code for payment on delivery.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Code for payment at end of month of delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
	 * PaymentTimeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfMonthOfDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for payment at end of month of delivery."</li>
	 * </ul>
	 */
	public static final MMCode EndOfMonthOfDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonthOfDelivery";
			definition = "Code for payment at end of month of delivery.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EMTD";
		}
	};
	/**
	 * Code for payment at end of period after delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
	 * PaymentTimeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EPRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for payment at end of period after delivery."</li>
	 * </ul>
	 */
	public static final MMCode EndOfPeriodAfterDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterDelivery";
			definition = "Code for payment at end of period after delivery.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EPRD";
		}
	};
	/**
	 * Code for payment at end of period after end of month of delivery
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
	 * PaymentTimeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRMD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterEndOfDeliveryMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code for payment at end of period after end of month of delivery"</li>
	 * </ul>
	 */
	public static final MMCode EndOfPeriodAfterEndOfDeliveryMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterEndOfDeliveryMonth";
			definition = "Code for payment at end of period after end of month of delivery";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "PRMD";
		}
	};
	/**
	 * Code for payment on receipt of invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
	 * PaymentTimeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOnReceiptOfInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for payment on receipt of invoice."</li>
	 * </ul>
	 */
	public static final MMCode PaymentOnReceiptOfInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOnReceiptOfInvoice";
			definition = "Code for payment on receipt of invoice.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "IREC";
		}
	};
	/**
	 * Code for payment at end of period after end of month of receipt of
	 * invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
	 * PaymentTimeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRMR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterEndOfReceiptMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code for payment at end of period after end of month of receipt of invoice."
	 * </li>
	 * </ul>
	 */
	public static final MMCode EndOfPeriodAfterEndOfReceiptMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterEndOfReceiptMonth";
			definition = "Code for payment at end of period after end of month of receipt of invoice.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "PRMR";
		}
	};
	/**
	 * Code for payment at end of period after receipt of invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
	 * PaymentTimeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EPRR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code for payment at end of period after receipt of invoice."</li>
	 * </ul>
	 */
	public static final MMCode EndOfPeriodAfterReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterReceipt";
			definition = "Code for payment at end of period after receipt of invoice.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EPRR";
		}
	};
	/**
	 * Code for payment at end of month of receipt of invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
	 * PaymentTimeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfMonthOfReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for payment at end of month of receipt of invoice."</li>
	 * </ul>
	 */
	public static final MMCode EndOfMonthOfReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonthOfReceipt";
			definition = "Code for payment at end of month of receipt of invoice.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EMTR";
		}
	};
	/**
	 * Code for payment at end of period after match or mismatch acceptance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
	 * PaymentTimeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EPAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code for payment at end of period after match or mismatch acceptance."</li>
	 * </ul>
	 */
	public static final MMCode EndOfPeriodAfterMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterMatch";
			definition = "Code for payment at end of period after match or mismatch acceptance.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EPAM";
		}
	};
	/**
	 * Payment at end of period after shipment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
	 * PaymentTimeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EPSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment at end of period after shipment date."</li>
	 * </ul>
	 */
	public static final MMCode EndOfPeriodAfterShipmentDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterShipmentDate";
			definition = "Payment at end of period after shipment date.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EPSD";
		}
	};
	/**
	 * Payment at end of period after purchase order date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
	 * PaymentTimeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EPPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterPurchaseOrderDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment at end of period after purchase order date."</li>
	 * </ul>
	 */
	public static final MMCode EndOfPeriodAfterPurchaseOrderDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterPurchaseOrderDate";
			definition = "Payment at end of period after purchase order date.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EPPO";
		}
	};
	/**
	 * Payment at end of period after baseline establishment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
	 * PaymentTimeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EPBE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterBaselineEstablishment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment at end of period after baseline establishment date."</li>
	 * </ul>
	 */
	public static final MMCode EndOfPeriodAfterBaselineEstablishment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterBaselineEstablishment";
			definition = "Payment at end of period after baseline establishment date.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EPBE";
		}
	};
	/**
	 * Payment at end of period after invoice date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
	 * PaymentTimeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EPIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterInvoiceDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment at end of period after invoice date."</li>
	 * </ul>
	 */
	public static final MMCode EndOfPeriodAfterInvoiceDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterInvoiceDate";
			definition = "Payment at end of period after invoice date.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EPIN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentTimeCode";
				definition = "Specifies the payment conditions.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentTimeCode.PaymentOnDelivery, com.tools20022.repository.codeset.PaymentTimeCode.EndOfMonthOfDelivery,
						com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterDelivery, com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterEndOfDeliveryMonth,
						com.tools20022.repository.codeset.PaymentTimeCode.PaymentOnReceiptOfInvoice, com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterEndOfReceiptMonth,
						com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterReceipt, com.tools20022.repository.codeset.PaymentTimeCode.EndOfMonthOfReceipt,
						com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterMatch, com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterShipmentDate,
						com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterPurchaseOrderDate, com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterBaselineEstablishment,
						com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterInvoiceDate);
			}
		});
		return mmObject_lazy.get();
	}
}