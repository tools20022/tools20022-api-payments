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
import com.tools20022.repository.msg.CreditTransferTransaction23;
import com.tools20022.repository.msg.CreditTransferTransaction24;
import com.tools20022.repository.msg.CreditTransferTransaction25;
import com.tools20022.repository.msg.PaymentComplementaryInformation6;

/**
 * If PreviousInstructingAgentAccount is present, then PreviousInstructingAgent
 * must be present.
 */
public class ConstraintPreviousInstructingAgentAccountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23
	 * CreditTransferTransaction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PreviousInstructingAgentAccount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PreviousInstructingAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructingAgentAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PreviousInstructingAgentAccount is present, then PreviousInstructingAgent must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCreditTransferTransaction23 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructingAgentAccountRule";
			definition = "If PreviousInstructingAgentAccount is present, then PreviousInstructingAgent must be present.";
			owner_lazy = () -> CreditTransferTransaction23.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/PreviousInstructingAgentAccount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/PreviousInstructingAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCreditTransferTransaction23((CreditTransferTransaction23) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25
	 * CreditTransferTransaction25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PreviousInstructingAgentAccount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PreviousInstructingAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructingAgentAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PreviousInstructingAgentAccount is present, then PreviousInstructingAgent must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCreditTransferTransaction25 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructingAgentAccountRule";
			definition = "If PreviousInstructingAgentAccount is present, then PreviousInstructingAgent must be present.";
			owner_lazy = () -> CreditTransferTransaction25.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/PreviousInstructingAgentAccount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/PreviousInstructingAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCreditTransferTransaction25((CreditTransferTransaction25) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24
	 * CreditTransferTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PreviousInstructingAgentAccount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PreviousInstructingAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructingAgentAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PreviousInstructingAgentAccount is present, then PreviousInstructingAgent must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCreditTransferTransaction24 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructingAgentAccountRule";
			definition = "If PreviousInstructingAgentAccount is present, then PreviousInstructingAgent must be present.";
			owner_lazy = () -> CreditTransferTransaction24.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/PreviousInstructingAgentAccount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/PreviousInstructingAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCreditTransferTransaction24((CreditTransferTransaction24) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6
	 * PaymentComplementaryInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PreviousInstructingAgentAccount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PreviousInstructingAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructingAgentAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PreviousInstructingAgentAccount is present, then PreviousInstructingAgent must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forPaymentComplementaryInformation6 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructingAgentAccountRule";
			definition = "If PreviousInstructingAgentAccount is present, then PreviousInstructingAgent must be present.";
			owner_lazy = () -> PaymentComplementaryInformation6.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/PreviousInstructingAgentAccount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/PreviousInstructingAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkPaymentComplementaryInformation6((PaymentComplementaryInformation6) obj);
		}
	};

	/**
	 * If PreviousInstructingAgentAccount is present, then
	 * PreviousInstructingAgent must be present.
	 */
	public static void checkCreditTransferTransaction23(CreditTransferTransaction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PreviousInstructingAgentAccount is present, then
	 * PreviousInstructingAgent must be present.
	 */
	public static void checkCreditTransferTransaction25(CreditTransferTransaction25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PreviousInstructingAgentAccount is present, then
	 * PreviousInstructingAgent must be present.
	 */
	public static void checkCreditTransferTransaction24(CreditTransferTransaction24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PreviousInstructingAgentAccount is present, then
	 * PreviousInstructingAgent must be present.
	 */
	public static void checkPaymentComplementaryInformation6(PaymentComplementaryInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}