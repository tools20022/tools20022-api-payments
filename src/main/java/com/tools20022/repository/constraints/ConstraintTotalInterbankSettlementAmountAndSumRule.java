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
import com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06;
import com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06;
import com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07;
import com.tools20022.repository.msg.CreditTransferTransaction9;

/**
 * If GroupHeader/TotalInterbankSettlementAmount is present, then it must equal
 * the sum of all occurrences of
 * CreditTransferTransactionInformation/InterbankSettlementAmount.
 */
public class ConstraintTotalInterbankSettlementAmountAndSumRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06
	 * FinancialInstitutionCreditTransferV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;rightOperand&gt;sum of /CreditTransferTransactionInformation/InterbankSettlementAmount&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterbankSettlementAmountAndSumRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalInterbankSettlementAmount is present, then it must equal the sum of all occurrences of CreditTransferTransactionInformation/InterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFinancialInstitutionCreditTransferV06 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementAmountAndSumRule";
			definition = "If GroupHeader/TotalInterbankSettlementAmount is present, then it must equal the sum of all occurrences of CreditTransferTransactionInformation/InterbankSettlementAmount.";
			owner_lazy = () -> FinancialInstitutionCreditTransferV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/TotalInterbankSettlementAmount</leftOperand><rightOperand>sum of /CreditTransferTransactionInformation/InterbankSettlementAmount</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFinancialInstitutionCreditTransferV06((FinancialInstitutionCreditTransferV06) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06
	 * FIToFICustomerCreditTransferV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;rightOperand&gt;sum of /CreditTransferTransactionInformation/InterbankSettlementAmount&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterbankSettlementAmountAndSumRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalInterbankSettlementAmount is present, then it must equal the sum of all occurrences of CreditTransferTransactionInformation/InterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFIToFICustomerCreditTransferV06 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementAmountAndSumRule";
			definition = "If GroupHeader/TotalInterbankSettlementAmount is present, then it must equal the sum of all occurrences of CreditTransferTransactionInformation/InterbankSettlementAmount.";
			owner_lazy = () -> FIToFICustomerCreditTransferV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/TotalInterbankSettlementAmount</leftOperand><rightOperand>sum of /CreditTransferTransactionInformation/InterbankSettlementAmount</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFIToFICustomerCreditTransferV06((FIToFICustomerCreditTransferV06) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07
	 * FIToFICustomerDirectDebitV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;rightOperand&gt;sum of /DirectDebitTransactionInformation/InterbankSettlementAmount&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterbankSettlementAmountAndSumRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalInterbankSettlementAmount is present, then it must equal the sum of all occurrences of DirectDebitTransactionInformation/InterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFIToFICustomerDirectDebitV07 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementAmountAndSumRule";
			definition = "If GroupHeader/TotalInterbankSettlementAmount is present, then it must equal the sum of all occurrences of DirectDebitTransactionInformation/InterbankSettlementAmount.";
			owner_lazy = () -> FIToFICustomerDirectDebitV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/TotalInterbankSettlementAmount</leftOperand><rightOperand>sum of /DirectDebitTransactionInformation/InterbankSettlementAmount</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFIToFICustomerDirectDebitV07((FIToFICustomerDirectDebitV07) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9
	 * CreditTransferTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TotalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;rightOperand&gt;sum of /DirectDebitTransactionInformation[*]/InterbankSettlementAmount&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TotalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterbankSettlementAmountAndSumRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TotalInterbankSettlementAmount is present, then it must equal the sum of all occurrences of DirectDebitTransactionInformation/InterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCreditTransferTransaction9 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementAmountAndSumRule";
			definition = "If TotalInterbankSettlementAmount is present, then it must equal the sum of all occurrences of DirectDebitTransactionInformation/InterbankSettlementAmount.";
			owner_lazy = () -> CreditTransferTransaction9.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TotalInterbankSettlementAmount</leftOperand><rightOperand>sum of /DirectDebitTransactionInformation[*]/InterbankSettlementAmount</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TotalInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCreditTransferTransaction9((CreditTransferTransaction9) obj);
		}
	};

	/**
	 * If GroupHeader/TotalInterbankSettlementAmount is present, then it must
	 * equal the sum of all occurrences of
	 * CreditTransferTransactionInformation/InterbankSettlementAmount.
	 */
	public static void checkFinancialInstitutionCreditTransferV06(FinancialInstitutionCreditTransferV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalInterbankSettlementAmount is present, then it must
	 * equal the sum of all occurrences of
	 * CreditTransferTransactionInformation/InterbankSettlementAmount.
	 */
	public static void checkFIToFICustomerCreditTransferV06(FIToFICustomerCreditTransferV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalInterbankSettlementAmount is present, then it must
	 * equal the sum of all occurrences of
	 * DirectDebitTransactionInformation/InterbankSettlementAmount.
	 */
	public static void checkFIToFICustomerDirectDebitV07(FIToFICustomerDirectDebitV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TotalInterbankSettlementAmount is present, then it must equal the sum
	 * of all occurrences of
	 * DirectDebitTransactionInformation/InterbankSettlementAmount.
	 */
	public static void checkCreditTransferTransaction9(CreditTransferTransaction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}