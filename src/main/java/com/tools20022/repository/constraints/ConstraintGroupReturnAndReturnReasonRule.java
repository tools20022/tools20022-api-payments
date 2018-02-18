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
import com.tools20022.repository.area.pacs.PaymentReturnV07;

/**
 * If GroupHeader/GroupReturn is true, then
 * OriginalGroupInformation/ReturnReasonInformation/ReturnReason must be
 * present.
 */
public class ConstraintGroupReturnAndReturnReasonRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV07
	 * PaymentReturnV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformation/ReturnReasonInformation[*]/Reason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReturn&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReturn&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformation/ReturnReasonInformation[*]/AdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReturnAndReturnReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReturn is true, then OriginalGroupInformation/ReturnReasonInformation/ReturnReason must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forPaymentReturnV07 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReturnAndReturnReasonRule";
			definition = "If GroupHeader/GroupReturn is true, then OriginalGroupInformation/ReturnReasonInformation/ReturnReason must be present.";
			owner_lazy = () -> PaymentReturnV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformation/ReturnReasonInformation[*]/Reason</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/GroupReturn</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/GroupReturn</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformation/ReturnReasonInformation[*]/AdditionalInformation[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkPaymentReturnV07((PaymentReturnV07) obj);
		}
	};

	/**
	 * If GroupHeader/GroupReturn is true, then
	 * OriginalGroupInformation/ReturnReasonInformation/ReturnReason must be
	 * present.
	 */
	public static void checkPaymentReturnV07(PaymentReturnV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}