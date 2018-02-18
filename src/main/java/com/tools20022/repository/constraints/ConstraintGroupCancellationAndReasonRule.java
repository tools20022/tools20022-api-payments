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
import com.tools20022.repository.msg.UnderlyingTransaction15;
import com.tools20022.repository.msg.UnderlyingTransaction16;

/**
 * If OriginalGroupInformationAndCancellation/GroupCancellation is true, then
 * OriginalGroupInformationAndCancellation/CancellationReasonInformation/Reason
 * must present.
 */
public class ConstraintGroupCancellationAndReasonRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16
	 * UnderlyingTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/CancellationReasonInformation[*]/Reason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupCancellationAndReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then OriginalGroupInformationAndCancellation/CancellationReasonInformation/Reason must present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forUnderlyingTransaction16 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupCancellationAndReasonRule";
			definition = "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then OriginalGroupInformationAndCancellation/CancellationReasonInformation/Reason must present.";
			owner_lazy = () -> UnderlyingTransaction16.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndCancellation/CancellationReasonInformation[*]/Reason</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkUnderlyingTransaction16((UnderlyingTransaction16) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction15
	 * UnderlyingTransaction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/CancellationReasonInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/CancellationReasonInformation[*]/Reason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupCancellationAndReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then OriginalGroupInformationAndCancellation/CancellationReasonInformation/Reason must present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forUnderlyingTransaction15 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupCancellationAndReasonRule";
			definition = "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then OriginalGroupInformationAndCancellation/CancellationReasonInformation/Reason must present.";
			owner_lazy = () -> UnderlyingTransaction15.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndCancellation/CancellationReasonInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndCancellation/CancellationReasonInformation[*]/Reason</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkUnderlyingTransaction15((UnderlyingTransaction15) obj);
		}
	};

	/**
	 * If OriginalGroupInformationAndCancellation/GroupCancellation is true,
	 * then
	 * OriginalGroupInformationAndCancellation/CancellationReasonInformation
	 * /Reason must present.
	 */
	public static void checkUnderlyingTransaction16(UnderlyingTransaction16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndCancellation/GroupCancellation is true,
	 * then
	 * OriginalGroupInformationAndCancellation/CancellationReasonInformation
	 * /Reason must present.
	 */
	public static void checkUnderlyingTransaction15(UnderlyingTransaction15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}