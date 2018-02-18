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
import com.tools20022.repository.msg.PaymentInstruction22;
import com.tools20022.repository.msg.PaymentInstruction23;

/**
 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and
 * is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor)
 * or RGCD (RegisteredMailToCreditor), then
 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if
 * different from CreditTransferTransaction/Creditor.
 */
public class ConstraintChequeInstructionDeliverToCreditorGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransaction/Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forPaymentInstruction23 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransaction/Creditor.";
			owner_lazy = () -> PaymentInstruction23.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkPaymentInstruction23((PaymentInstruction23) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forPaymentInstruction22 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor.";
			owner_lazy = () -> PaymentInstruction22.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkPaymentInstruction22((PaymentInstruction22) obj);
		}
	};

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD
	 * (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different from CreditTransferTransaction/Creditor.
	 */
	public static void checkPaymentInstruction23(PaymentInstruction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformation/CreditTransferTransactionInformation/
	 * ChequeInstruction/DeliveryMethod is present and is CRCD
	 * (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or
	 * RGCD (RegisteredMailToCreditor), then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstruction22(PaymentInstruction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}