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
 * Specifies the transfer method that will be used to transfer the cash.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentMethodCode#Cheque
 * PaymentMethodCode.Cheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentMethodCode#CreditTransfer
 * PaymentMethodCode.CreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentMethodCode#DirectDebit
 * PaymentMethodCode.DirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentMethodCode#TransferAdvice
 * PaymentMethodCode.TransferAdvice}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentMethodCode#Direct
 * PaymentMethodCode.Direct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentMethodCode#Classical
 * PaymentMethodCode.Classical}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentMethod3Code
 * PaymentMethod3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentMethod2Code
 * PaymentMethod2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentMethod4Code
 * PaymentMethod4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentMethod7Code
 * PaymentMethod7Code}</li>
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
 * <li>"CHK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the transfer method that will be used  to transfer the cash."</li>
 * </ul>
 */
public class PaymentMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Written order to a bank to pay a certain amount of money from one person
	 * to another person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentMethodCode
	 * PaymentMethodCode}</li>
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
	 * "Written order to a bank to pay a certain amount of money from one person to another person."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Cheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cheque";
			definition = "Written order to a bank to pay a certain amount of money from one person to another person.";
			owner_lazy = () -> PaymentMethodCode.mmObject();
			codeName = "CHK";
		}
	};
	/**
	 * Transfer of an amount of money in the books of the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentMethodCode
	 * PaymentMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer of an amount of money in the books of the account servicer."</li>
	 * </ul>
	 */
	public static final MMCode CreditTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditTransfer";
			definition = "Transfer of an amount of money in the books of the account servicer.";
			owner_lazy = () -> PaymentMethodCode.mmObject();
			codeName = "TRF";
		}
	};
	/**
	 * Collection of an amount of money from the debtor's bank account by the
	 * creditor. The amount of money and dates of collections may vary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentMethodCode
	 * PaymentMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of an amount of money from the debtor's bank account by the creditor.  The amount of money and dates of collections may vary."
	 * </li>
	 * </ul>
	 */
	public static final MMCode DirectDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DirectDebit";
			definition = "Collection of an amount of money from the debtor's bank account by the creditor.  The amount of money and dates of collections may vary.";
			owner_lazy = () -> PaymentMethodCode.mmObject();
			codeName = "DD";
		}
	};
	/**
	 * Transfer of an amount of money in the books of the account servicer. An
	 * advice should be sent back to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentMethodCode
	 * PaymentMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer of an amount of money in the books of the account servicer. An advice should be sent back to the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMCode TransferAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferAdvice";
			definition = "Transfer of an amount of money in the books of the account servicer. An advice should be sent back to the account owner.";
			owner_lazy = () -> PaymentMethodCode.mmObject();
			codeName = "TRA";
		}
	};
	/**
	 * Direct method.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentMethodCode
	 * PaymentMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Direct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Direct method."</li>
	 * </ul>
	 */
	public static final MMCode Direct = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Direct";
			definition = "Direct method.";
			owner_lazy = () -> PaymentMethodCode.mmObject();
			codeName = "DIRE";
		}
	};
	/**
	 * Classical method.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentMethodCode
	 * PaymentMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Classical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Classical method."</li>
	 * </ul>
	 */
	public static final MMCode Classical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Classical";
			definition = "Classical method.";
			owner_lazy = () -> PaymentMethodCode.mmObject();
			codeName = "CLAS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CHK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentMethodCode";
				definition = "Specifies the transfer method that will be used  to transfer the cash.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentMethodCode.Cheque, com.tools20022.repository.codeset.PaymentMethodCode.CreditTransfer,
						com.tools20022.repository.codeset.PaymentMethodCode.DirectDebit, com.tools20022.repository.codeset.PaymentMethodCode.TransferAdvice, com.tools20022.repository.codeset.PaymentMethodCode.Direct,
						com.tools20022.repository.codeset.PaymentMethodCode.Classical);
				derivation_lazy = () -> Arrays.asList(PaymentMethod3Code.mmObject(), PaymentMethod2Code.mmObject(), PaymentMethod4Code.mmObject(), PaymentMethod7Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}