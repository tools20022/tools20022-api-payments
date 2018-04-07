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
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;

/**
 * The Currency Code must be registered, or have already been registered. Valid
 * active or historic currency codes are registered with the ISO 4217
 * Maintenance Agency, consist of three (3) contiguous letters, and may be or
 * not be withdrawn on the day the message containing the Currency is exchanged.
 */
public class ConstraintActiveOrHistoricCurrency {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveOrHistoricCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Currency Code must be registered, or have already been registered. Valid active or historic currency codes are registered with the ISO 4217 Maintenance Agency, consist of three (3) contiguous letters, and may be or not be withdrawn on the day the message containing the Currency is exchanged."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ActiveOrHistoricCurrencyCode> forActiveOrHistoricCurrencyCode = new MMConstraint<ActiveOrHistoricCurrencyCode>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveOrHistoricCurrency";
			definition = "The Currency Code must be registered, or have already been registered. Valid active or historic currency codes are registered with the ISO 4217 Maintenance Agency, consist of three (3) contiguous letters, and may be or not be withdrawn on the day the message containing the Currency is exchanged.";
			owner_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public void executeValidator(ActiveOrHistoricCurrencyCode obj) throws Exception {
			checkActiveOrHistoricCurrencyCode(obj);
		}
	};

	/**
	 * The Currency Code must be registered, or have already been registered.
	 * Valid active or historic currency codes are registered with the ISO 4217
	 * Maintenance Agency, consist of three (3) contiguous letters, and may be
	 * or not be withdrawn on the day the message containing the Currency is
	 * exchanged.
	 */
	public static void checkActiveOrHistoricCurrencyCode(ActiveOrHistoricCurrencyCode obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}