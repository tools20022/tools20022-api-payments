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
import com.tools20022.repository.msg.PaymentInstruction23;

/**
 * If PaymentMethod is CHK (Cheque), then
 * CreditTransferTransaction/CreditorAccount is not allowed. <br>
 * <br>
 * If PaymentMethod is different from CHK (Cheque) and if
 * CreditTransferTransaction/Creditor is not present, then
 * CreditTransferTransaction/CreditorAccount is mandatory. <br>
 * <br>
 * If PaymentMethod is different from CHK (Cheque) and if
 * CreditTransferTransaction/Creditor is present, then
 * CreditTransferTransaction/CreditorAccount is optional.
 */
public class ConstraintCreditorAndOrCreditorAgentRule {

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
	 * name} = "CreditorAndOrCreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK (Cheque), then CreditTransferTransaction/CreditorAccount is not allowed. \r\n\r\nIf PaymentMethod is different from CHK (Cheque) and if CreditTransferTransaction/Creditor is not present, then CreditTransferTransaction/CreditorAccount is mandatory. \r\n\r\nIf PaymentMethod is different from CHK (Cheque) and if CreditTransferTransaction/Creditor is present, then CreditTransferTransaction/CreditorAccount is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction23> forPaymentInstruction23 = new MMConstraint<PaymentInstruction23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAndOrCreditorAgentRule";
			definition = "If PaymentMethod is CHK (Cheque), then CreditTransferTransaction/CreditorAccount is not allowed. \r\n\r\nIf PaymentMethod is different from CHK (Cheque) and if CreditTransferTransaction/Creditor is not present, then CreditTransferTransaction/CreditorAccount is mandatory. \r\n\r\nIf PaymentMethod is different from CHK (Cheque) and if CreditTransferTransaction/Creditor is present, then CreditTransferTransaction/CreditorAccount is optional.";
			owner_lazy = () -> PaymentInstruction23.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction23 obj) throws Exception {
			checkPaymentInstruction23(obj);
		}
	};

	/**
	 * If PaymentMethod is CHK (Cheque), then
	 * CreditTransferTransaction/CreditorAccount is not allowed. <br>
	 * <br>
	 * If PaymentMethod is different from CHK (Cheque) and if
	 * CreditTransferTransaction/Creditor is not present, then
	 * CreditTransferTransaction/CreditorAccount is mandatory. <br>
	 * <br>
	 * If PaymentMethod is different from CHK (Cheque) and if
	 * CreditTransferTransaction/Creditor is present, then
	 * CreditTransferTransaction/CreditorAccount is optional.
	 */
	public static void checkPaymentInstruction23(PaymentInstruction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}