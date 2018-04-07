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
import com.tools20022.repository.msg.OriginalGroupHeader9;
import com.tools20022.repository.msg.OriginalPaymentInstruction26;

/**
 * If PaymentInformationCancellationStatus is present and is different from RJCR
 * (RejectedCancellationRequest) or PNCR (PendingCancellationRequest), then
 * CancellationStatusReasonInformation/AdditionalInformation is not allowed.
 */
public class ConstraintCancellationStatusReasonInformationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26
	 * OriginalPaymentInstruction26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PendingCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;RejectedCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformationCancellationStatus is present and is different from RJCR (RejectedCancellationRequest) or PNCR (PendingCancellationRequest), then CancellationStatusReasonInformation/AdditionalInformation is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction26> forOriginalPaymentInstruction26 = new MMConstraint<OriginalPaymentInstruction26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReasonInformationRule";
			definition = "If PaymentInformationCancellationStatus is present and is different from RJCR (RejectedCancellationRequest) or PNCR (PendingCancellationRequest), then CancellationStatusReasonInformation/AdditionalInformation is not allowed.";
			owner_lazy = () -> OriginalPaymentInstruction26.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand><rightOperand>PendingCancellationRequest</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand><rightOperand>RejectedCancellationRequest</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(OriginalPaymentInstruction26 obj) throws Exception {
			checkOriginalPaymentInstruction26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader9
	 * OriginalGroupHeader9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PendingCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;RejectedCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupCancellationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupCancellationStatus is present and is different from RJCR or PNCR, then CancellationStatusReasonInformation/AdditionalInformation is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupHeader9> forOriginalGroupHeader9 = new MMConstraint<OriginalGroupHeader9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReasonInformationRule";
			definition = "If GroupCancellationStatus is present and is different from RJCR or PNCR, then CancellationStatusReasonInformation/AdditionalInformation is not allowed.";
			owner_lazy = () -> OriginalGroupHeader9.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupCancellationStatus</leftOperand><rightOperand>PendingCancellationRequest</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupCancellationStatus</leftOperand><rightOperand>RejectedCancellationRequest</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupCancellationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(OriginalGroupHeader9 obj) throws Exception {
			checkOriginalGroupHeader9(obj);
		}
	};

	/**
	 * If PaymentInformationCancellationStatus is present and is different from
	 * RJCR (RejectedCancellationRequest) or PNCR (PendingCancellationRequest),
	 * then CancellationStatusReasonInformation/AdditionalInformation is not
	 * allowed.
	 */
	public static void checkOriginalPaymentInstruction26(OriginalPaymentInstruction26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupCancellationStatus is present and is different from RJCR or PNCR,
	 * then CancellationStatusReasonInformation/AdditionalInformation is not
	 * allowed.
	 */
	public static void checkOriginalGroupHeader9(OriginalGroupHeader9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}