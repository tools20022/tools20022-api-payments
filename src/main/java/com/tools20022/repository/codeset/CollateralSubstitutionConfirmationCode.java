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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the status of the collateral substitution, either returned or
 * released.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionConfirmationCode#CollateralSubstitutionReleased
 * CollateralSubstitutionConfirmationCode.CollateralSubstitutionReleased}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionConfirmationCode#CollateralSubstitutionReturned
 * CollateralSubstitutionConfirmationCode.CollateralSubstitutionReturned}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CREL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralSubstitutionConfirmationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the status of the collateral substitution, either returned or released."
 * </li>
 * </ul>
 */
public class CollateralSubstitutionConfirmationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Notification that the collateral substitution, that is new piece(s) of
	 * collateral, have been released.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionConfirmationCode
	 * CollateralSubstitutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CREL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionReleased"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notification that the collateral substitution, that is new piece(s) of collateral, have been released."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CollateralSubstitutionReleased = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionReleased";
			definition = "Notification that the collateral substitution, that is new piece(s) of collateral, have been released.";
			owner_lazy = () -> CollateralSubstitutionConfirmationCode.mmObject();
			codeName = "CREL";
		}
	};
	/**
	 * Confirmation that the collateral substitution, that is new piece(s) of
	 * collateral, have been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionConfirmationCode
	 * CollateralSubstitutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionReturned"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation that the collateral substitution, that is new piece(s) of collateral, have been received."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CollateralSubstitutionReturned = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionReturned";
			definition = "Confirmation that the collateral substitution, that is new piece(s) of collateral, have been received.";
			owner_lazy = () -> CollateralSubstitutionConfirmationCode.mmObject();
			codeName = "CRET";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CREL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralSubstitutionConfirmationCode";
				definition = "Provides the status of the collateral substitution, either returned or released.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralSubstitutionConfirmationCode.CollateralSubstitutionReleased,
						com.tools20022.repository.codeset.CollateralSubstitutionConfirmationCode.CollateralSubstitutionReturned);
			}
		});
		return mmObject_lazy.get();
	}
}