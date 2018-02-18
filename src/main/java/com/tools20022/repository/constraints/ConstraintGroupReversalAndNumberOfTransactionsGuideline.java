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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.pain.CustomerPaymentReversalV07;
import com.tools20022.repository.msg.GroupHeader56;
import com.tools20022.repository.msg.GroupHeader71;

/**
 * If GroupHeader/GroupReversal is false and
 * OriginalPaymentInformationAndReversal[*]/PaymentInformationReversal is false,
 * then NumberOfTransactions must equal the number of occurrences of
 * OriginalPaymentInformationAndReversal[*]/TransactionInformation.
 */
public class ConstraintGroupReversalAndNumberOfTransactionsGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07
	 * CustomerPaymentReversalV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is false and OriginalPaymentInformationAndReversal[*]/PaymentInformationReversal is false, then NumberOfTransactions must equal the number of occurrences of OriginalPaymentInformationAndReversal[*]/TransactionInformation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCustomerPaymentReversalV07 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupHeader/GroupReversal is false and OriginalPaymentInformationAndReversal[*]/PaymentInformationReversal is false, then NumberOfTransactions must equal the number of occurrences of OriginalPaymentInformationAndReversal[*]/TransactionInformation.";
			owner_lazy = () -> CustomerPaymentReversalV07.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCustomerPaymentReversalV07((CustomerPaymentReversalV07) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56 GroupHeader56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forGroupHeader56 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader56.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkGroupHeader56((GroupHeader56) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71 GroupHeader71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forGroupHeader71 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader71.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkGroupHeader71((GroupHeader71) obj);
		}
	};

	/**
	 * If GroupHeader/GroupReversal is false and
	 * OriginalPaymentInformationAndReversal[*]/PaymentInformationReversal is
	 * false, then NumberOfTransactions must equal the number of occurrences of
	 * OriginalPaymentInformationAndReversal[*]/TransactionInformation.
	 */
	public static void checkCustomerPaymentReversalV07(CustomerPaymentReversalV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupReversal is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader56(GroupHeader56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupReversal is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader71(GroupHeader71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}