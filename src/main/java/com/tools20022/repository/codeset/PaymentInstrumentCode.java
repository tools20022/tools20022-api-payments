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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the payment instrument used or the underlying financial transaction
 * that resulted in a payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#mmBankDebitTransfer
 * PaymentInstrumentCode.mmBankDebitTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#mmBankCreditTransfer
 * PaymentInstrumentCode.mmBankCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#mmCustomerDebitTransfer
 * PaymentInstrumentCode.mmCustomerDebitTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#mmCustomerCreditTransfer
 * PaymentInstrumentCode.mmCustomerCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#mmCheque
 * PaymentInstrumentCode.mmCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#mmBookTransfer
 * PaymentInstrumentCode.mmBookTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#mmDebitCardPayment
 * PaymentInstrumentCode.mmDebitCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#mmCreditCardPayment
 * PaymentInstrumentCode.mmCreditCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#mmReturn
 * PaymentInstrumentCode.mmReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode#mmCancellationRequest
 * PaymentInstrumentCode.mmCancellationRequest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class PaymentInstrumentCode {

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
	public static final MMCode mmBankDebitTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankDebitTransfer";
			definition = "Direct debit instruction in which the debtor and the creditor are financial institutions.";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
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
	public static final MMCode mmBankCreditTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankCreditTransfer";
			definition = "Funds transfer in which the debtor and the creditor are financial institutions.";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
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
	public static final MMCode mmCustomerDebitTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomerDebitTransfer";
			definition = "Direct debit instruction in which the debtor or the creditor or both are non-financial institutions.";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
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
	public static final MMCode mmCustomerCreditTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomerCreditTransfer";
			definition = "Funds transfer in which the debtor or the creditor or both are non-financial institutions.";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
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
	public static final MMCode mmCheque = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cheque";
			definition = "Payment instrument is a cheque. (A written order on which instructions are given to an account holder (a financial institution) to pay a stated sum to a named recipient (the payee)).";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
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
	public static final MMCode mmBookTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookTransfer";
			definition = "Transfer that is a movement of cash on the books of the account servicer.";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
			codeName = "BKT";
		}
	};
	/**
	 * Payment instrument is a debit card. (The payment originated using a debit
	 * card scheme.)
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
	 * "Payment instrument is a debit card. (The payment originated using a debit card scheme.)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDebitCardPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitCardPayment";
			definition = "Payment instrument is a debit card. (The payment originated using a debit card scheme.)";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
			codeName = "DCP";
		}
	};
	/**
	 * Payment instrument is a credit card. (The payment originated using a
	 * credit card scheme.)
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
	 * "Payment instrument is a credit card. (The payment originated using a credit card scheme.)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCreditCardPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditCardPayment";
			definition = "Payment instrument is a credit card. (The payment originated using a credit card scheme.)";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
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
	public static final MMCode mmReturn = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Return";
			definition = "Entry related to a returned or unpaid item.";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
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
	public static final MMCode mmCancellationRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationRequest";
			definition = "Reverse entry that is the result of the cancellation of a previously booked entry.";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
			codeName = "CAN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BDT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstrumentCode";
				definition = "Specifies the payment instrument used or the underlying financial transaction that resulted in a payment transaction.";
				code_lazy = () -> Arrays.asList(PaymentInstrumentCode.mmBankDebitTransfer, PaymentInstrumentCode.mmBankCreditTransfer, PaymentInstrumentCode.mmCustomerDebitTransfer, PaymentInstrumentCode.mmCustomerCreditTransfer,
						PaymentInstrumentCode.mmCheque, PaymentInstrumentCode.mmBookTransfer, PaymentInstrumentCode.mmDebitCardPayment, PaymentInstrumentCode.mmCreditCardPayment, PaymentInstrumentCode.mmReturn,
						PaymentInstrumentCode.mmCancellationRequest);
			}
		});
		return mmObject_lazy.get();
	}
}