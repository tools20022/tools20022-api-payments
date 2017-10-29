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
 * Identification of the type of transactions which are included in the totals.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode#Debit
 * TypeTransactionTotalsCode.Debit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode#DebitReverse
 * TypeTransactionTotalsCode.DebitReverse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode#Credit
 * TypeTransactionTotalsCode.Credit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode#CreditReverse
 * TypeTransactionTotalsCode.CreditReverse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode#Declined
 * TypeTransactionTotalsCode.Declined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode#Failed
 * TypeTransactionTotalsCode.Failed}</li>
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
 * <li>"DEBT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TypeTransactionTotalsCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of the type of transactions which are included in the totals."
 * </li>
 * </ul>
 */
public class TypeTransactionTotalsCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Debit transactions on the cardholder account .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode
	 * TypeTransactionTotalsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debit transactions on the cardholder account ."</li>
	 * </ul>
	 */
	public static final MMCode Debit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Debit";
			definition = "Debit transactions on the cardholder account .";
			owner_lazy = () -> TypeTransactionTotalsCode.mmObject();
			codeName = "DEBT";
		}
	};
	/**
	 * Reversal of debit transactions (cancellation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode
	 * TypeTransactionTotalsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitReverse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reversal of debit transactions (cancellation)."</li>
	 * </ul>
	 */
	public static final MMCode DebitReverse = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitReverse";
			definition = "Reversal of debit transactions (cancellation).";
			owner_lazy = () -> TypeTransactionTotalsCode.mmObject();
			codeName = "DBTR";
		}
	};
	/**
	 * Credit transactions (refund, account, cash service, as defined in the
	 * transaction service type).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode
	 * TypeTransactionTotalsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit transactions (refund, account, cash service, as defined  in the transaction service type)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Credit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Credit";
			definition = "Credit transactions (refund, account, cash service, as defined  in the transaction service type).";
			owner_lazy = () -> TypeTransactionTotalsCode.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Reversal of credit transactions (cancellation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode
	 * TypeTransactionTotalsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditReverse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reversal of credit transactions (cancellation)."</li>
	 * </ul>
	 */
	public static final MMCode CreditReverse = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditReverse";
			definition = "Reversal of credit transactions (cancellation).";
			owner_lazy = () -> TypeTransactionTotalsCode.mmObject();
			codeName = "CRDR";
		}
	};
	/**
	 * Declined transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode
	 * TypeTransactionTotalsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DECL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Declined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Declined transactions."</li>
	 * </ul>
	 */
	public static final MMCode Declined = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Declined";
			definition = "Declined transactions.";
			owner_lazy = () -> TypeTransactionTotalsCode.mmObject();
			codeName = "DECL";
		}
	};
	/**
	 * Failed transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode
	 * TypeTransactionTotalsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Failed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Failed transactions."</li>
	 * </ul>
	 */
	public static final MMCode Failed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Failed";
			definition = "Failed transactions.";
			owner_lazy = () -> TypeTransactionTotalsCode.mmObject();
			codeName = "FAIL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DEBT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TypeTransactionTotalsCode";
				definition = "Identification of the type of transactions which are included in the totals.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeTransactionTotalsCode.Debit, com.tools20022.repository.codeset.TypeTransactionTotalsCode.DebitReverse,
						com.tools20022.repository.codeset.TypeTransactionTotalsCode.Credit, com.tools20022.repository.codeset.TypeTransactionTotalsCode.CreditReverse, com.tools20022.repository.codeset.TypeTransactionTotalsCode.Declined,
						com.tools20022.repository.codeset.TypeTransactionTotalsCode.Failed);
			}
		});
		return mmObject_lazy.get();
	}
}