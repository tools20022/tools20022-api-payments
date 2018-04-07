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
import com.tools20022.repository.msg.PaymentInstruction21;

/**
 * If CreditorSchemeIdentification is present, then
 * DirectDebitTransactionInformation/CreditorSchemeIdentification is not
 * allowed. If DirectDebitTransactionInformation/CreditorSchemeIdentification is
 * present, then CreditorSchemeIdentification is not allowed.
 * DirectDebitTransactionInformation/CreditorSchemeIdentification and
 * CreditorSchemeIdentification may both be absent.
 */
public class ConstraintCreditorSchemeIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21
	 * PaymentInstruction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditorSchemeIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/DirectDebitTransaction/CreditorSchemeIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorSchemeIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditorSchemeIdentification is present, then DirectDebitTransactionInformation/CreditorSchemeIdentification is not allowed.\nIf DirectDebitTransactionInformation/CreditorSchemeIdentification is present, then CreditorSchemeIdentification is not allowed.\nDirectDebitTransactionInformation/CreditorSchemeIdentification and CreditorSchemeIdentification may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction21> forPaymentInstruction21 = new MMConstraint<PaymentInstruction21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorSchemeIdentificationRule";
			definition = "If CreditorSchemeIdentification is present, then DirectDebitTransactionInformation/CreditorSchemeIdentification is not allowed.\nIf DirectDebitTransactionInformation/CreditorSchemeIdentification is present, then CreditorSchemeIdentification is not allowed.\nDirectDebitTransactionInformation/CreditorSchemeIdentification and CreditorSchemeIdentification may both be absent.";
			owner_lazy = () -> PaymentInstruction21.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditorSchemeIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/DirectDebitTransaction/CreditorSchemeIdentification</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentInstruction21 obj) throws Exception {
			checkPaymentInstruction21(obj);
		}
	};

	/**
	 * If CreditorSchemeIdentification is present, then
	 * DirectDebitTransactionInformation/CreditorSchemeIdentification is not
	 * allowed. If
	 * DirectDebitTransactionInformation/CreditorSchemeIdentification is
	 * present, then CreditorSchemeIdentification is not allowed.
	 * DirectDebitTransactionInformation/CreditorSchemeIdentification and
	 * CreditorSchemeIdentification may both be absent.
	 */
	public static void checkPaymentInstruction21(PaymentInstruction21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}