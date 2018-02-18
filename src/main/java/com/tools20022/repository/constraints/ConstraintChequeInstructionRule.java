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
 * If PaymentMethod is CHK (Cheque), then
 * CreditTransferTransaction/ChequeInstruction is optional.<br>
 * If PaymentMethod is different from CHK (Cheque), then
 * CreditTransferTransaction/ChequeInstruction is not allowed. <br>
 * <br>
 * Rule rationale: ChequeInstructionDetails may be present if the payment method
 * is Cheque. It must not be present if the payment method is 'Transfer'.
 */
public class ConstraintChequeInstructionRule {

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
	 * name} = "ChequeInstructionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK (Cheque), then CreditTransferTransaction/ChequeInstruction is optional.\r\nIf PaymentMethod is different from CHK (Cheque), then CreditTransferTransaction/ChequeInstruction is not allowed. \r\n\r\nRule rationale: ChequeInstructionDetails may be present if the payment method is Cheque. It must not be present if the payment method is 'Transfer'."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forPaymentInstruction23 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionRule";
			definition = "If PaymentMethod is CHK (Cheque), then CreditTransferTransaction/ChequeInstruction is optional.\r\nIf PaymentMethod is different from CHK (Cheque), then CreditTransferTransaction/ChequeInstruction is not allowed. \r\n\r\nRule rationale: ChequeInstructionDetails may be present if the payment method is Cheque. It must not be present if the payment method is 'Transfer'.";
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
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentMethod&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;/PaymentMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;Cheque&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is different from CHK (Cheque), then CreditTransferTransactionInformation/ChequeInstruction is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forPaymentInstruction22 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionRule";
			definition = "If PaymentMethod is different from CHK (Cheque), then CreditTransferTransactionInformation/ChequeInstruction is not allowed.";
			owner_lazy = () -> PaymentInstruction22.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentMethod</leftOperand></BooleanRule><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>/PaymentMethod</leftOperand><rightOperand>Cheque</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkPaymentInstruction22((PaymentInstruction22) obj);
		}
	};

	/**
	 * If PaymentMethod is CHK (Cheque), then
	 * CreditTransferTransaction/ChequeInstruction is optional.<br>
	 * If PaymentMethod is different from CHK (Cheque), then
	 * CreditTransferTransaction/ChequeInstruction is not allowed. <br>
	 * <br>
	 * Rule rationale: ChequeInstructionDetails may be present if the payment
	 * method is Cheque. It must not be present if the payment method is
	 * 'Transfer'.
	 */
	public static void checkPaymentInstruction23(PaymentInstruction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is different from CHK (Cheque), then
	 * CreditTransferTransactionInformation/ChequeInstruction is not allowed.
	 */
	public static void checkPaymentInstruction22(PaymentInstruction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}