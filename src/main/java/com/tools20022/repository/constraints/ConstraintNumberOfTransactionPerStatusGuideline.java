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
import com.tools20022.repository.msg.OriginalGroupHeader13;
import com.tools20022.repository.msg.OriginalGroupInformation28;

/**
 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only
 * be present if GroupStatus equals 'PART'.
 */
public class ConstraintNumberOfTransactionPerStatusGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader13
	 * OriginalGroupHeader13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionPerStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupHeader13> forOriginalGroupHeader13 = new MMConstraint<OriginalGroupHeader13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionPerStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'.";
			owner_lazy = () -> OriginalGroupHeader13.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupHeader13 obj) throws Exception {
			checkOriginalGroupHeader13(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionPerStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation28> forOriginalGroupInformation28 = new MMConstraint<OriginalGroupInformation28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionPerStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'.";
			owner_lazy = () -> OriginalGroupInformation28.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupInformation28 obj) throws Exception {
			checkOriginalGroupInformation28(obj);
		}
	};

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupStatus equals 'PART'.
	 */
	public static void checkOriginalGroupHeader13(OriginalGroupHeader13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupStatus equals 'PART'.
	 */
	public static void checkOriginalGroupInformation28(OriginalGroupInformation28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}