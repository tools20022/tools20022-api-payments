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
import com.tools20022.repository.msg.PaymentInstruction22;
import com.tools20022.repository.msg.PaymentInstruction23;

/**
 * If ChargeBearer is present, then
 * DirectDebitTransactionInformation/ChargeBearer is not allowed. If
 * DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer
 * is not allowed. DirectDebitTransactionInformation/ChargeBearer and
 * ChargeBearer may both be absent.
 */
public class ConstraintChargeBearerRule {

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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forPaymentInstruction21 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			owner_lazy = () -> PaymentInstruction21.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkPaymentInstruction21((PaymentInstruction21) obj);
		}
	};
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
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer is not allowed.\r\nIf CreditTransferTransaction/ChargeBearer is present, then ChargeBearer  is not allowed.\r\nCreditTransferTransaction/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forPaymentInstruction23 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer is not allowed.\r\nIf CreditTransferTransaction/ChargeBearer is present, then ChargeBearer  is not allowed.\r\nCreditTransferTransaction/ChargeBearer and ChargeBearer may both be absent.";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forPaymentInstruction22 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			owner_lazy = () -> PaymentInstruction22.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkPaymentInstruction22((PaymentInstruction22) obj);
		}
	};

	/**
	 * If ChargeBearer is present, then
	 * DirectDebitTransactionInformation/ChargeBearer is not allowed. If
	 * DirectDebitTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * DirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both
	 * be absent.
	 */
	public static void checkPaymentInstruction21(PaymentInstruction21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer
	 * is not allowed.<br>
	 * If CreditTransferTransaction/ChargeBearer is present, then ChargeBearer
	 * is not allowed.<br>
	 * CreditTransferTransaction/ChargeBearer and ChargeBearer may both be
	 * absent.
	 */
	public static void checkPaymentInstruction23(PaymentInstruction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * CreditTransferTransactionInformation/ChargeBearer is not allowed. If
	 * CreditTransferTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * CreditTransferTransactionInformation/ChargeBearer and ChargeBearer may
	 * both be absent.
	 */
	public static void checkPaymentInstruction22(PaymentInstruction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}