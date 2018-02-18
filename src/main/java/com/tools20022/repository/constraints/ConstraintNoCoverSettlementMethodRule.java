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
import com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07;
import com.tools20022.repository.area.pacs.PaymentReturnV07;

/**
 * GroupHeader/SettlementInformation/SettlementMethod must be different from
 * COVE (Cover) when returning direct debit transactions.
 */
public class ConstraintNoCoverSettlementMethodRule {

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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCoverSettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE (Cover) when returning direct debit transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forPaymentReturnV07 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCoverSettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE (Cover) when returning direct debit transactions.";
			owner_lazy = () -> PaymentReturnV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/SettlementInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/SettlementInformation/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkPaymentReturnV07((PaymentReturnV07) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07
	 * FIToFIPaymentReversalV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCoverSettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE (Cover) when reversing direct debit transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFIToFIPaymentReversalV07 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCoverSettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE (Cover) when reversing direct debit transactions.";
			owner_lazy = () -> FIToFIPaymentReversalV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/SettlementInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/SettlementInformation/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFIToFIPaymentReversalV07((FIToFIPaymentReversalV07) obj);
		}
	};

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod must be different from
	 * COVE (Cover) when returning direct debit transactions.
	 */
	public static void checkPaymentReturnV07(PaymentReturnV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod must be different from
	 * COVE (Cover) when reversing direct debit transactions.
	 */
	public static void checkFIToFIPaymentReversalV07(FIToFIPaymentReversalV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}