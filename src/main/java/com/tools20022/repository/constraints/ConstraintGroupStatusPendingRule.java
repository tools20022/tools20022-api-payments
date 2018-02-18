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
import com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08;
import com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08;

/**
 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to
 * PDNG (Pending), then
 * OriginalPaymentInformationAndStatus/PaymentInformationStatus must be
 * different from RJCT (Rejected).
 */
public class ConstraintGroupStatusPendingRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08
	 * CustomerPaymentStatusReportV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Pending&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatusPendingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to PDNG (Pending), then OriginalPaymentInformationAndStatus/PaymentInformationStatus must be different from RJCT (Rejected)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCustomerPaymentStatusReportV08 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatusPendingRule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to PDNG (Pending), then OriginalPaymentInformationAndStatus/PaymentInformationStatus must be different from RJCT (Rejected).";
			owner_lazy = () -> CustomerPaymentStatusReportV08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand><rightOperand>Pending</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCustomerPaymentStatusReportV08((CustomerPaymentStatusReportV08) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08
	 * FIToFIPaymentStatusReportV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus[*]/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus[*]/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Pending&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatusPendingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to PDNG (Pending), then TransactionInformationAndStatus/TransactionStatus must be different from RJCT (Rejected)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFIToFIPaymentStatusReportV08 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatusPendingRule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to PDNG (Pending), then TransactionInformationAndStatus/TransactionStatus must be different from RJCT (Rejected).";
			owner_lazy = () -> FIToFIPaymentStatusReportV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus[*]/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndStatus[*]/GroupStatus</leftOperand><rightOperand>Pending</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFIToFIPaymentStatusReportV08((FIToFIPaymentStatusReportV08) obj);
		}
	};

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to PDNG (Pending), then
	 * OriginalPaymentInformationAndStatus/PaymentInformationStatus must be
	 * different from RJCT (Rejected).
	 */
	public static void checkCustomerPaymentStatusReportV08(CustomerPaymentStatusReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to PDNG (Pending), then TransactionInformationAndStatus/TransactionStatus
	 * must be different from RJCT (Rejected).
	 */
	public static void checkFIToFIPaymentStatusReportV08(FIToFIPaymentStatusReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}