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
import com.tools20022.repository.msg.PaymentTransaction76;

/**
 * If ReturnedInstructedAmount is present and the currency is different from the
 * currency in ReturnedInterbankSettlementAmount, then ExchangeRate must be
 * present.
 */
public class ConstraintReturnedInstructedAmountAndExchangeRate1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76
	 * PaymentTransaction76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnedInstructedAmountAndExchangeRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnedInstructedAmount is present and the currency is different from the currency in ReturnedInterbankSettlementAmount, then ExchangeRate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forPaymentTransaction76 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnedInstructedAmountAndExchangeRate1Rule";
			definition = "If ReturnedInstructedAmount is present and the currency is different from the currency in ReturnedInterbankSettlementAmount, then ExchangeRate must be present.";
			owner_lazy = () -> PaymentTransaction76.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/ReturnedInstructedAmount/@Currency</leftOperand><rightOperand>/ReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkPaymentTransaction76((PaymentTransaction76) obj);
		}
	};

	/**
	 * If ReturnedInstructedAmount is present and the currency is different from
	 * the currency in ReturnedInterbankSettlementAmount, then ExchangeRate must
	 * be present.
	 */
	public static void checkPaymentTransaction76(PaymentTransaction76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}