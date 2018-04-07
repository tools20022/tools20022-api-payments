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
 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only
 * be present if GroupCancellationStatus equals PACR
 * (PartialCancellationRequest).
 */
public class ConstraintNumberOfTransactionsPerCancellationStatusGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26
	 * OriginalPaymentInstruction26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerCancellationStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR (PartialCancellationRequest)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction26> forOriginalPaymentInstruction26 = new MMConstraint<OriginalPaymentInstruction26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerCancellationStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR (PartialCancellationRequest).";
			owner_lazy = () -> OriginalPaymentInstruction26.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerCancellationStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupHeader9> forOriginalGroupHeader9 = new MMConstraint<OriginalGroupHeader9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerCancellationStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR.";
			owner_lazy = () -> OriginalGroupHeader9.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupHeader9 obj) throws Exception {
			checkOriginalGroupHeader9(obj);
		}
	};

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupCancellationStatus equals PACR
	 * (PartialCancellationRequest).
	 */
	public static void checkOriginalPaymentInstruction26(OriginalPaymentInstruction26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupCancellationStatus equals PACR.
	 */
	public static void checkOriginalGroupHeader9(OriginalGroupHeader9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}