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
import com.tools20022.repository.codeset.PaymentTimeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentTimeCode extends MMCode {

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
	public static final PaymentTimeCode PaymentOnDelivery = new PaymentTimeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOnDelivery";
			definition = "Code for payment on delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTimeCode.mmObject();
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
	public static final PaymentTimeCode EndOfMonthOfDelivery = new PaymentTimeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonthOfDelivery";
			definition = "Code for payment at end of month of delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTimeCode.mmObject();
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
	public static final PaymentTimeCode EndOfPeriodAfterDelivery = new PaymentTimeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterDelivery";
			definition = "Code for payment at end of period after delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTimeCode.mmObject();
			codeName = "EPRD";
		}
	};
	/**
	 * Code for payment at end of period after end of month of delivery.
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
	 * "Code for payment at end of period after end of month of delivery."</li>
	 * </ul>
	 */
	public static final PaymentTimeCode EndOfPeriodAfterEndOfDeliveryMonth = new PaymentTimeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterEndOfDeliveryMonth";
			definition = "Code for payment at end of period after end of month of delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTimeCode.mmObject();
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
	public static final PaymentTimeCode PaymentOnReceiptOfInvoice = new PaymentTimeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOnReceiptOfInvoice";
			definition = "Code for payment on receipt of invoice.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTimeCode.mmObject();
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
	public static final PaymentTimeCode EndOfPeriodAfterEndOfReceiptMonth = new PaymentTimeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterEndOfReceiptMonth";
			definition = "Code for payment at end of period after end of month of receipt of invoice.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTimeCode.mmObject();
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
	public static final PaymentTimeCode EndOfPeriodAfterReceipt = new PaymentTimeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterReceipt";
			definition = "Code for payment at end of period after receipt of invoice.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTimeCode.mmObject();
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
	public static final PaymentTimeCode EndOfMonthOfReceipt = new PaymentTimeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonthOfReceipt";
			definition = "Code for payment at end of month of receipt of invoice.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTimeCode.mmObject();
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
	public static final PaymentTimeCode EndOfPeriodAfterMatch = new PaymentTimeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterMatch";
			definition = "Code for payment at end of period after match or mismatch acceptance.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTimeCode.mmObject();
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
	public static final PaymentTimeCode EndOfPeriodAfterShipmentDate = new PaymentTimeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterShipmentDate";
			definition = "Payment at end of period after shipment date.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTimeCode.mmObject();
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
	public static final PaymentTimeCode EndOfPeriodAfterPurchaseOrderDate = new PaymentTimeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterPurchaseOrderDate";
			definition = "Payment at end of period after purchase order date.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTimeCode.mmObject();
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
	public static final PaymentTimeCode EndOfPeriodAfterBaselineEstablishment = new PaymentTimeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterBaselineEstablishment";
			definition = "Payment at end of period after baseline establishment date.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTimeCode.mmObject();
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
	public static final PaymentTimeCode EndOfPeriodAfterInvoiceDate = new PaymentTimeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterInvoiceDate";
			definition = "Payment at end of period after invoice date.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTimeCode.mmObject();
			codeName = "EPIN";
		}
	};
	final static private LinkedHashMap<String, PaymentTimeCode> codesByName = new LinkedHashMap<>();

	protected PaymentTimeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
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

	static {
		codesByName.put(PaymentOnDelivery.getCodeName().get(), PaymentOnDelivery);
		codesByName.put(EndOfMonthOfDelivery.getCodeName().get(), EndOfMonthOfDelivery);
		codesByName.put(EndOfPeriodAfterDelivery.getCodeName().get(), EndOfPeriodAfterDelivery);
		codesByName.put(EndOfPeriodAfterEndOfDeliveryMonth.getCodeName().get(), EndOfPeriodAfterEndOfDeliveryMonth);
		codesByName.put(PaymentOnReceiptOfInvoice.getCodeName().get(), PaymentOnReceiptOfInvoice);
		codesByName.put(EndOfPeriodAfterEndOfReceiptMonth.getCodeName().get(), EndOfPeriodAfterEndOfReceiptMonth);
		codesByName.put(EndOfPeriodAfterReceipt.getCodeName().get(), EndOfPeriodAfterReceipt);
		codesByName.put(EndOfMonthOfReceipt.getCodeName().get(), EndOfMonthOfReceipt);
		codesByName.put(EndOfPeriodAfterMatch.getCodeName().get(), EndOfPeriodAfterMatch);
		codesByName.put(EndOfPeriodAfterShipmentDate.getCodeName().get(), EndOfPeriodAfterShipmentDate);
		codesByName.put(EndOfPeriodAfterPurchaseOrderDate.getCodeName().get(), EndOfPeriodAfterPurchaseOrderDate);
		codesByName.put(EndOfPeriodAfterBaselineEstablishment.getCodeName().get(), EndOfPeriodAfterBaselineEstablishment);
		codesByName.put(EndOfPeriodAfterInvoiceDate.getCodeName().get(), EndOfPeriodAfterInvoiceDate);
	}

	public static PaymentTimeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentTimeCode[] values() {
		PaymentTimeCode[] values = new PaymentTimeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentTimeCode> {
		@Override
		public PaymentTimeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentTimeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}