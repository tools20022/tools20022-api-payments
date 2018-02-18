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
import com.tools20022.repository.msg.OriginalGroupHeader7;
import com.tools20022.repository.msg.OriginalGroupInformation28;

/**
 * If GroupStatus is present and is different from RJCT or PDNG then
 * StatusReasonInformation/AdditionalInformation must be absent.
 */
public class ConstraintStatusReasonInformationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7
	 * OriginalGroupHeader7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Pending&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupStatus is present and is different from RJCT or PDNG then StatusReasonInformation/AdditionalInformation must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forOriginalGroupHeader7 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformationRule";
			definition = "If GroupStatus is present and is different from RJCT or PDNG then StatusReasonInformation/AdditionalInformation must be absent.";
			owner_lazy = () -> OriginalGroupHeader7.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Pending</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkOriginalGroupHeader7((OriginalGroupHeader7) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28
	 * OriginalGroupInformation28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Pending&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupStatus is present and is different from RJCT or PDNG then StatusReasonInformation/AdditionalInformation must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forOriginalGroupInformation28 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformationRule";
			definition = "If GroupStatus is present and is different from RJCT or PDNG then StatusReasonInformation/AdditionalInformation must be absent.";
			owner_lazy = () -> OriginalGroupInformation28.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Pending</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkOriginalGroupInformation28((OriginalGroupInformation28) obj);
		}
	};

	/**
	 * If GroupStatus is present and is different from RJCT or PDNG then
	 * StatusReasonInformation/AdditionalInformation must be absent.
	 */
	public static void checkOriginalGroupHeader7(OriginalGroupHeader7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupStatus is present and is different from RJCT or PDNG then
	 * StatusReasonInformation/AdditionalInformation must be absent.
	 */
	public static void checkOriginalGroupInformation28(OriginalGroupInformation28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}