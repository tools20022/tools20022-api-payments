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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;

/**
 * The number of fractional digits (or minor unit of currency) must comply with
 * ISO 4217. Note: The decimal separator is a dot.
 */
public class ConstraintCurrencyAmount {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The number of fractional digits (or minor unit of currency) must comply with ISO 4217.\nNote: The decimal separator is a dot."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ActiveOrHistoricCurrencyAndAmount> forActiveOrHistoricCurrencyAndAmount = new MMConstraint<ActiveOrHistoricCurrencyAndAmount>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyAmount";
			definition = "The number of fractional digits (or minor unit of currency) must comply with ISO 4217.\nNote: The decimal separator is a dot.";
			owner_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public void executeValidator(ActiveOrHistoricCurrencyAndAmount obj) throws Exception {
			checkActiveOrHistoricCurrencyAndAmount(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The number of fractional digits (or minor unit of currency) must comply with ISO 4217.\nNote: The decimal separator is a dot."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ActiveCurrencyAndAmount> forActiveCurrencyAndAmount = new MMConstraint<ActiveCurrencyAndAmount>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyAmount";
			definition = "The number of fractional digits (or minor unit of currency) must comply with ISO 4217.\nNote: The decimal separator is a dot.";
			owner_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public void executeValidator(ActiveCurrencyAndAmount obj) throws Exception {
			checkActiveCurrencyAndAmount(obj);
		}
	};

	/**
	 * The number of fractional digits (or minor unit of currency) must comply
	 * with ISO 4217. Note: The decimal separator is a dot.
	 */
	public static void checkActiveOrHistoricCurrencyAndAmount(ActiveOrHistoricCurrencyAndAmount obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The number of fractional digits (or minor unit of currency) must comply
	 * with ISO 4217. Note: The decimal separator is a dot.
	 */
	public static void checkActiveCurrencyAndAmount(ActiveCurrencyAndAmount obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}