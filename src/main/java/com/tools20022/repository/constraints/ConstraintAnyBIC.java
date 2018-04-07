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
import com.tools20022.repository.datatype.AnyBICIdentifier;

/**
 * Only a valid Business identifier code is allowed. Business identifier codes
 * for financial or non-financial institutions are registered by the ISO 9362
 * Registration Authority in the BIC directory, and consists of eight (8) or
 * eleven (11) contiguous characters.
 */
public class ConstraintAnyBIC {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a valid Business identifier code is allowed. Business identifier codes for financial or non-financial institutions are registered by the ISO 9362 Registration Authority in the BIC directory, and consists of eight (8) or eleven (11) contiguous characters."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AnyBICIdentifier> forAnyBICIdentifier = new MMConstraint<AnyBICIdentifier>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyBIC";
			definition = "Only a valid Business identifier code is allowed. Business identifier codes for financial or non-financial institutions are registered by the ISO 9362 Registration Authority in the BIC directory, and consists of eight (8) or eleven (11) contiguous characters.";
			owner_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public void executeValidator(AnyBICIdentifier obj) throws Exception {
			checkAnyBICIdentifier(obj);
		}
	};

	/**
	 * Only a valid Business identifier code is allowed. Business identifier
	 * codes for financial or non-financial institutions are registered by the
	 * ISO 9362 Registration Authority in the BIC directory, and consists of
	 * eight (8) or eleven (11) contiguous characters.
	 */
	public static void checkAnyBICIdentifier(AnyBICIdentifier obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}