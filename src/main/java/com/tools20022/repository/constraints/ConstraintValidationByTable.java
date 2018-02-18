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
import com.tools20022.repository.codeset.BusinessMessagePriorityCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.codeset.UnicodeChartsCode;

/**
 * Must be a valid currency code which is registered with the ISO 4217
 * Maintenance Agency, and consist of three contiguous letters.
 */
public class ConstraintValidationByTable {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyCode CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationByTable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Must be a valid currency code which is registered with the ISO 4217 Maintenance Agency, and consist of three contiguous letters."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forCurrencyCode = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationByTable";
			definition = "Must be a valid currency code which is registered with the ISO 4217 Maintenance Agency, and consist of three contiguous letters.";
			owner_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCurrencyCode((CurrencyCode) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LanguageCode LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationByTable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Must be a valid terrestrial language."</li>
	 * </ul>
	 */
	public static final MMConstraint forLanguageCode = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationByTable";
			definition = "Must be a valid terrestrial language.";
			owner_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkLanguageCode((LanguageCode) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnicodeChartsCode
	 * UnicodeChartsCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationByTable"</li>
	 * </ul>
	 */
	public static final MMConstraint forUnicodeChartsCode = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationByTable";
			owner_lazy = () -> UnicodeChartsCode.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkUnicodeChartsCode((UnicodeChartsCode) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessMessagePriorityCode
	 * BusinessMessagePriorityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationByTable"</li>
	 * </ul>
	 */
	public static final MMConstraint forBusinessMessagePriorityCode = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationByTable";
			owner_lazy = () -> BusinessMessagePriorityCode.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkBusinessMessagePriorityCode((BusinessMessagePriorityCode) obj);
		}
	};

	/**
	 * Must be a valid currency code which is registered with the ISO 4217
	 * Maintenance Agency, and consist of three contiguous letters.
	 */
	public static void checkCurrencyCode(CurrencyCode obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Must be a valid terrestrial language.
	 */
	public static void checkLanguageCode(LanguageCode obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * - no definition -
	 */
	public static void checkUnicodeChartsCode(UnicodeChartsCode obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * - no definition -
	 */
	public static void checkBusinessMessagePriorityCode(BusinessMessagePriorityCode obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}