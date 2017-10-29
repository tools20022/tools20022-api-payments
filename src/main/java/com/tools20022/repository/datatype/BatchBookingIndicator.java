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
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies whether the sending party requests a single debit or credit entry
 * per individual transaction or a batch entry for the sum of the amounts of all
 * transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMIndicator#getMeaningWhenTrue
 * meaningWhenTrue} =
 * "Identifies that a batch entry for the sum of the amounts of all transactions in the batch or message is requested."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMIndicator#getMeaningWhenFalse
 * meaningWhenFalse} =
 * "Identifies that a single entry for each of the transactions in the batch or message is requested. "
 * </li>
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
 * "BatchBookingIndicator"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies whether the sending party requests a single debit or credit entry per individual transaction or a batch entry for the sum of the amounts of all transactions."
 * </li>
 * </ul>
 */
public class BatchBookingIndicator {

	final static private AtomicReference<MMIndicator> mmObject_lazy = new AtomicReference<>();

	final static public MMIndicator mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIndicator() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BatchBookingIndicator";
				definition = "Identifies whether the sending party requests a single debit or credit entry per individual transaction or a batch entry for the sum of the amounts of all transactions.";
				meaningWhenFalse = "Identifies that a single entry for each of the transactions in the batch or message is requested. ";
				meaningWhenTrue = "Identifies that a batch entry for the sum of the amounts of all transactions in the batch or message is requested.";
			}
		});
		return mmObject_lazy.get();
	}
}