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
import com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06;
import com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06;

/**
 * Case may be present at either Case, OriginalGroupInformationAndCancellation,
 * OriginalPaymentInformationAndCancellation or TransactionInformation level.
 */
public class ConstraintMessageOrGroupCaseRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06
	 * CustomerPaymentCancellationRequestV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/OriginalGroupInformationAndCancellation/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/OriginalGroupInformationAndCancellation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrGroupCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCustomerPaymentCancellationRequestV06 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrGroupCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level.";
			owner_lazy = () -> CustomerPaymentCancellationRequestV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/OriginalGroupInformationAndCancellation/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/OriginalGroupInformationAndCancellation</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCustomerPaymentCancellationRequestV06((CustomerPaymentCancellationRequestV06) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06
	 * FIToFIPaymentCancellationRequestV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/OriginalGroupInformationAndCancellation/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/OriginalGroupInformationAndCancellation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrGroupCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFIToFIPaymentCancellationRequestV06 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrGroupCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level.";
			owner_lazy = () -> FIToFIPaymentCancellationRequestV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/OriginalGroupInformationAndCancellation/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/OriginalGroupInformationAndCancellation</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFIToFIPaymentCancellationRequestV06((FIToFIPaymentCancellationRequestV06) obj);
		}
	};

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation,
	 * OriginalPaymentInformationAndCancellation or TransactionInformation
	 * level.
	 */
	public static void checkCustomerPaymentCancellationRequestV06(CustomerPaymentCancellationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation or TransactionInformation level.
	 */
	public static void checkFIToFIPaymentCancellationRequestV06(FIToFIPaymentCancellationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}