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
import com.tools20022.repository.msg.AccountNotification13;
import com.tools20022.repository.msg.OriginalNotificationReference7;
import com.tools20022.repository.msg.OriginalNotificationReference8;

/**
 * If TotalAmount is present, then all occurrences of Item/Amount must have the
 * same currency as the currency of TotalAmount.
 */
public class ConstraintTotalAmountAndAmount1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13
	 * AccountNotification13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/Item[*]/Amount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/TotalAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TotalAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountAndAmount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TotalAmount is present, then all occurrences of Item/Amount must have the same currency as the currency of TotalAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forAccountNotification13 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountAndAmount1Rule";
			definition = "If TotalAmount is present, then all occurrences of Item/Amount must have the same currency as the currency of TotalAmount.";
			owner_lazy = () -> AccountNotification13.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/Item[*]/Amount/@Currency</leftOperand><rightOperand>/TotalAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TotalAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkAccountNotification13((AccountNotification13) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8
	 * OriginalNotificationReference8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/OriginalItem[*]/Amount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/TotalAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TotalAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountAndAmount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TotalAmount is present, then all occurrences of OriginalItem/Amount must have the same currency as the currency of TotalAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forOriginalNotificationReference8 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountAndAmount1Rule";
			definition = "If TotalAmount is present, then all occurrences of OriginalItem/Amount must have the same currency as the currency of TotalAmount.";
			owner_lazy = () -> OriginalNotificationReference8.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/OriginalItem[*]/Amount/@Currency</leftOperand><rightOperand>/TotalAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TotalAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkOriginalNotificationReference8((OriginalNotificationReference8) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7
	 * OriginalNotificationReference7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/OriginalItemAndStatus[*]/Amount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/TotalAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TotalAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountAndAmount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TotalAmount is present, then all occurrences of OriginalItem/Amount must have the same currency as the currency of TotalAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forOriginalNotificationReference7 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountAndAmount1Rule";
			definition = "If TotalAmount is present, then all occurrences of OriginalItem/Amount must have the same currency as the currency of TotalAmount.";
			owner_lazy = () -> OriginalNotificationReference7.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/OriginalItemAndStatus[*]/Amount/@Currency</leftOperand><rightOperand>/TotalAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TotalAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkOriginalNotificationReference7((OriginalNotificationReference7) obj);
		}
	};

	/**
	 * If TotalAmount is present, then all occurrences of Item/Amount must have
	 * the same currency as the currency of TotalAmount.
	 */
	public static void checkAccountNotification13(AccountNotification13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TotalAmount is present, then all occurrences of OriginalItem/Amount
	 * must have the same currency as the currency of TotalAmount.
	 */
	public static void checkOriginalNotificationReference8(OriginalNotificationReference8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TotalAmount is present, then all occurrences of OriginalItem/Amount
	 * must have the same currency as the currency of TotalAmount.
	 */
	public static void checkOriginalNotificationReference7(OriginalNotificationReference7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}