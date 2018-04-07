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
import com.tools20022.repository.datatype.IBAN2007Identifier;

/**
 * A valid IBAN consists of all three of the following components: Country Code,
 * check digits and BBAN.
 */
public class ConstraintIBAN {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.datatype.IBAN2007Identifier
	 * IBAN2007Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A valid IBAN consists of all three of the following components: Country Code, check digits and BBAN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IBAN2007Identifier> forIBAN2007Identifier = new MMConstraint<IBAN2007Identifier>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IBAN";
			definition = "A valid IBAN consists of all three of the following components: Country Code, check digits and BBAN.";
			owner_lazy = () -> IBAN2007Identifier.mmObject();
		}

		@Override
		public void executeValidator(IBAN2007Identifier obj) throws Exception {
			checkIBAN2007Identifier(obj);
		}
	};

	/**
	 * A valid IBAN consists of all three of the following components: Country
	 * Code, check digits and BBAN.
	 */
	public static void checkIBAN2007Identifier(IBAN2007Identifier obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}