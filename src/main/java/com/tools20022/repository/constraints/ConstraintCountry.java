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
import com.tools20022.repository.codeset.CountryCode;

/**
 * The code is checked against the list of country names obtained from the
 * United Nations (ISO 3166, Alpha-2 code).
 */
public class ConstraintCountry {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CountryCode CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The code is checked against the list of country names obtained from the United Nations (ISO 3166, Alpha-2 code)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CountryCode> forCountryCode = new MMConstraint<CountryCode>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "The code is checked against the list of country names obtained from the United Nations (ISO 3166, Alpha-2 code).";
			owner_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public void executeValidator(CountryCode obj) throws Exception {
			checkCountryCode(obj);
		}
	};

	/**
	 * The code is checked against the list of country names obtained from the
	 * United Nations (ISO 3166, Alpha-2 code).
	 */
	public static void checkCountryCode(CountryCode obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}