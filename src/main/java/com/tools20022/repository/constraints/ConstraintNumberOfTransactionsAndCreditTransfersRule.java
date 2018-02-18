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
import com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06;

/**
 * GroupHeader/NumberOfTransactions must equal the number of occurrences of
 * CreditTransferTransactionInformation.
 */
public class ConstraintNumberOfTransactionsAndCreditTransfersRule {

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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/NumberOfTransactions&lt;/leftOperand&gt;&lt;rightOperand&gt;number of occurrences of CreditTransferTransactionInformation&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsAndCreditTransfersRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/NumberOfTransactions must equal the number of occurrences of CreditTransferTransactionInformation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forFIToFICustomerCreditTransferV06 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsAndCreditTransfersRule";
			definition = "GroupHeader/NumberOfTransactions must equal the number of occurrences of CreditTransferTransactionInformation.";
			owner_lazy = () -> FIToFICustomerCreditTransferV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/NumberOfTransactions</leftOperand><rightOperand>number of occurrences of CreditTransferTransactionInformation</rightOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkFIToFICustomerCreditTransferV06((FIToFICustomerCreditTransferV06) obj);
		}
	};

	/**
	 * GroupHeader/NumberOfTransactions must equal the number of occurrences of
	 * CreditTransferTransactionInformation.
	 */
	public static void checkFIToFICustomerCreditTransferV06(FIToFICustomerCreditTransferV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}