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

/**
 * If InstructionForDebtorAgent is present, then
 * CreditTransferTransactionInformation/InstructionForDebtorAgent is not
 * allowed.<br>
 * If CreditTransferTransactionInformation/InstructionForDebtorAgent is present,
 * then InstructionForDebtorAgent is not allowed.<br>
 * CreditTransferTransactionInformation/InstructionForDebtorAgent and
 * InstructionForDebtorAgent may both be absent.
 */
public class ConstraintInstructionForDebtorAgentRule {

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
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructionForDebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InstructionForDebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForDebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionForDebtorAgent is present, then CreditTransferTransactionInformation/InstructionForDebtorAgent  is not allowed.\r\nIf CreditTransferTransactionInformation/InstructionForDebtorAgent is present, then InstructionForDebtorAgent is not allowed.\r\nCreditTransferTransactionInformation/InstructionForDebtorAgent and InstructionForDebtorAgent may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forPaymentInstruction22 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForDebtorAgentRule";
			definition = "If InstructionForDebtorAgent is present, then CreditTransferTransactionInformation/InstructionForDebtorAgent  is not allowed.\r\nIf CreditTransferTransactionInformation/InstructionForDebtorAgent is present, then InstructionForDebtorAgent is not allowed.\r\nCreditTransferTransactionInformation/InstructionForDebtorAgent and InstructionForDebtorAgent may both be absent.";
			owner_lazy = () -> PaymentInstruction22.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructionForDebtorAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InstructionForDebtorAgent</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkPaymentInstruction22((PaymentInstruction22) obj);
		}
	};

	/**
	 * If InstructionForDebtorAgent is present, then
	 * CreditTransferTransactionInformation/InstructionForDebtorAgent is not
	 * allowed.<br>
	 * If CreditTransferTransactionInformation/InstructionForDebtorAgent is
	 * present, then InstructionForDebtorAgent is not allowed.<br>
	 * CreditTransferTransactionInformation/InstructionForDebtorAgent and
	 * InstructionForDebtorAgent may both be absent.
	 */
	public static void checkPaymentInstruction22(PaymentInstruction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}