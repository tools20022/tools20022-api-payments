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
import com.tools20022.repository.codeset.PaymentInstrumentCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the payment instrument used or the underlying financial transaction
 * that resulted in a payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#BankDebitTransfer
 * PaymentInstrumentCode.BankDebitTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#BankCreditTransfer
 * PaymentInstrumentCode.BankCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#CustomerDebitTransfer
 * PaymentInstrumentCode.CustomerDebitTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#CustomerCreditTransfer
 * PaymentInstrumentCode.CustomerCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#Cheque
 * PaymentInstrumentCode.Cheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#BookTransfer
 * PaymentInstrumentCode.BookTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#DebitCardPayment
 * PaymentInstrumentCode.DebitCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#CreditCardPayment
 * PaymentInstrumentCode.CreditCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#Return
 * PaymentInstrumentCode.Return}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#CancellationRequest
 * PaymentInstrumentCode.CancellationRequest}</li>
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
 * <li>"BDT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInstrumentCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the payment instrument used or the underlying financial transaction that resulted in a payment transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentInstrumentCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Direct debit instruction in which the debtor and the creditor are
	 * financial institutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankDebitTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Direct debit instruction in which the debtor and the creditor are financial institutions."
	 * </li>
	 * </ul>
	 */
	public static final PaymentInstrumentCode BankDebitTransfer = new PaymentInstrumentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankDebitTransfer";
			definition = "Direct debit instruction in which the debtor and the creditor are financial institutions.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstrumentCode.mmObject();
			codeName = "BDT";
		}
	};
	/**
	 * Funds transfer in which the debtor and the creditor are financial
	 * institutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankCreditTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Funds transfer in which the debtor and the creditor are financial institutions."
	 * </li>
	 * </ul>
	 */
	public static final PaymentInstrumentCode BankCreditTransfer = new PaymentInstrumentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankCreditTransfer";
			definition = "Funds transfer in which the debtor and the creditor are financial institutions.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstrumentCode.mmObject();
			codeName = "BCT";
		}
	};
	/**
	 * Direct debit instruction in which the debtor or the creditor or both are
	 * non-financial institutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDebitTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Direct debit instruction in which the debtor or the creditor or both are non-financial institutions."
	 * </li>
	 * </ul>
	 */
	public static final PaymentInstrumentCode CustomerDebitTransfer = new PaymentInstrumentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomerDebitTransfer";
			definition = "Direct debit instruction in which the debtor or the creditor or both are non-financial institutions.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstrumentCode.mmObject();
			codeName = "CDT";
		}
	};
	/**
	 * Funds transfer in which the debtor or the creditor or both are
	 * non-financial institutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCreditTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Funds transfer in which the debtor or the creditor or both are non-financial institutions."
	 * </li>
	 * </ul>
	 */
	public static final PaymentInstrumentCode CustomerCreditTransfer = new PaymentInstrumentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomerCreditTransfer";
			definition = "Funds transfer in which the debtor or the creditor or both are non-financial institutions.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstrumentCode.mmObject();
			codeName = "CCT";
		}
	};
	/**
	 * Payment instrument is a cheque. (A written order on which instructions
	 * are given to an account holder (a financial institution) to pay a stated
	 * sum to a named recipient (the payee)).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instrument is a cheque. (A written order on which instructions are given to an account holder (a financial institution) to pay a stated sum to a named recipient (the payee))."
	 * </li>
	 * </ul>
	 */
	public static final PaymentInstrumentCode Cheque = new PaymentInstrumentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cheque";
			definition = "Payment instrument is a cheque. (A written order on which instructions are given to an account holder (a financial institution) to pay a stated sum to a named recipient (the payee)).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstrumentCode.mmObject();
			codeName = "CHK";
		}
	};
	/**
	 * Transfer that is a movement of cash on the books of the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer that is a movement of cash on the books of the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final PaymentInstrumentCode BookTransfer = new PaymentInstrumentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookTransfer";
			definition = "Transfer that is a movement of cash on the books of the account servicer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstrumentCode.mmObject();
			codeName = "BKT";
		}
	};
	/**
	 * Payment instrument is a debit card. (The payment originated using a debit
	 * card scheme.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instrument is a debit card. (The payment originated using a debit card scheme.)."
	 * </li>
	 * </ul>
	 */
	public static final PaymentInstrumentCode DebitCardPayment = new PaymentInstrumentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitCardPayment";
			definition = "Payment instrument is a debit card. (The payment originated using a debit card scheme.).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstrumentCode.mmObject();
			codeName = "DCP";
		}
	};
	/**
	 * Payment instrument is a credit card. (The payment originated using a
	 * credit card scheme.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditCardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instrument is a credit card. (The payment originated using a credit card scheme.)."
	 * </li>
	 * </ul>
	 */
	public static final PaymentInstrumentCode CreditCardPayment = new PaymentInstrumentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditCardPayment";
			definition = "Payment instrument is a credit card. (The payment originated using a credit card scheme.).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstrumentCode.mmObject();
			codeName = "CCP";
		}
	};
	/**
	 * Entry related to a returned or unpaid item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Return"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry related to a returned or unpaid item."</li>
	 * </ul>
	 */
	public static final PaymentInstrumentCode Return = new PaymentInstrumentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Return";
			definition = "Entry related to a returned or unpaid item.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstrumentCode.mmObject();
			codeName = "RTI";
		}
	};
	/**
	 * Reverse entry that is the result of the cancellation of a previously
	 * booked entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reverse entry that is the result of the cancellation of a previously booked entry."
	 * </li>
	 * </ul>
	 */
	public static final PaymentInstrumentCode CancellationRequest = new PaymentInstrumentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationRequest";
			definition = "Reverse entry that is the result of the cancellation of a previously booked entry.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstrumentCode.mmObject();
			codeName = "CAN";
		}
	};
	final static private LinkedHashMap<String, PaymentInstrumentCode> codesByName = new LinkedHashMap<>();

	protected PaymentInstrumentCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BDT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstrumentCode";
				definition = "Specifies the payment instrument used or the underlying financial transaction that resulted in a payment transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentInstrumentCode.BankDebitTransfer, com.tools20022.repository.codeset.PaymentInstrumentCode.BankCreditTransfer,
						com.tools20022.repository.codeset.PaymentInstrumentCode.CustomerDebitTransfer, com.tools20022.repository.codeset.PaymentInstrumentCode.CustomerCreditTransfer,
						com.tools20022.repository.codeset.PaymentInstrumentCode.Cheque, com.tools20022.repository.codeset.PaymentInstrumentCode.BookTransfer, com.tools20022.repository.codeset.PaymentInstrumentCode.DebitCardPayment,
						com.tools20022.repository.codeset.PaymentInstrumentCode.CreditCardPayment, com.tools20022.repository.codeset.PaymentInstrumentCode.Return, com.tools20022.repository.codeset.PaymentInstrumentCode.CancellationRequest);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BankDebitTransfer.getCodeName().get(), BankDebitTransfer);
		codesByName.put(BankCreditTransfer.getCodeName().get(), BankCreditTransfer);
		codesByName.put(CustomerDebitTransfer.getCodeName().get(), CustomerDebitTransfer);
		codesByName.put(CustomerCreditTransfer.getCodeName().get(), CustomerCreditTransfer);
		codesByName.put(Cheque.getCodeName().get(), Cheque);
		codesByName.put(BookTransfer.getCodeName().get(), BookTransfer);
		codesByName.put(DebitCardPayment.getCodeName().get(), DebitCardPayment);
		codesByName.put(CreditCardPayment.getCodeName().get(), CreditCardPayment);
		codesByName.put(Return.getCodeName().get(), Return);
		codesByName.put(CancellationRequest.getCodeName().get(), CancellationRequest);
	}

	public static PaymentInstrumentCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentInstrumentCode[] values() {
		PaymentInstrumentCode[] values = new PaymentInstrumentCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentInstrumentCode> {
		@Override
		public PaymentInstrumentCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentInstrumentCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}