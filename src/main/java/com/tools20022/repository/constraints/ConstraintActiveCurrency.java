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
import com.tools20022.repository.codeset.ActiveCurrencyCode;

/**
 * The currency code must be a valid active currency code, not yet withdrawn on
 * the day the message containing the currency is exchanged. Valid active
 * currency codes are registered with the ISO 4217 Maintenance Agency, consist
 * of three (3) contiguous letters, and are not yet withdrawn on the day the
 * message containing the Currency is exchanged.
 */
public class ConstraintActiveCurrency {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The currency code must be a valid active currency code, not yet withdrawn on the day the message containing the currency is exchanged. Valid active currency codes are registered with the ISO 4217 Maintenance Agency, consist of three (3) contiguous letters, and are not yet withdrawn on the day the message containing the Currency is exchanged."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ActiveCurrencyCode> forActiveCurrencyCode = new MMConstraint<ActiveCurrencyCode>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveCurrency";
			definition = "The currency code must be a valid active currency code, not yet withdrawn on the day the message containing the currency is exchanged. Valid active currency codes are registered with the ISO 4217 Maintenance Agency, consist of three (3) contiguous letters, and are not yet withdrawn on the day the message containing the Currency is exchanged.";
			owner_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public void executeValidator(ActiveCurrencyCode obj) throws Exception {
			checkActiveCurrencyCode(obj);
		}
	};

	/**
	 * The currency code must be a valid active currency code, not yet withdrawn
	 * on the day the message containing the currency is exchanged. Valid active
	 * currency codes are registered with the ISO 4217 Maintenance Agency,
	 * consist of three (3) contiguous letters, and are not yet withdrawn on the
	 * day the message containing the Currency is exchanged.
	 */
	public static void checkActiveCurrencyCode(ActiveCurrencyCode obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}