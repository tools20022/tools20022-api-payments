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

package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIndicator;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies whether or not the party and/or account identification information
 * is correct.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMIndicator#getMeaningWhenTrue
 * meaningWhenTrue} =
 * "Indicates that the identification information received is correct."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMIndicator#getMeaningWhenFalse
 * meaningWhenFalse} =
 * "Indicates that the identification information received is incorrect."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IdentificationVerificationIndicator"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies whether or not the party and/or account identification information is correct."
 * </li>
 * </ul>
 */
public class IdentificationVerificationIndicator {

	final static private AtomicReference<MMIndicator> mmObject_lazy = new AtomicReference<>();

	final static public MMIndicator mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIndicator() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IdentificationVerificationIndicator";
				definition = "Identifies whether or not the party and/or account identification information is correct.";
				meaningWhenTrue = "Indicates that the identification information received is correct.";
				meaningWhenFalse = "Indicates that the identification information received is incorrect.";
			}
		});
		return mmObject_lazy.get();
	}
}