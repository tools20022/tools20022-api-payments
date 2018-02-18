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

package com.tools20022.repository.other;

import com.tools20022.metamodel.MMExternalSchema;
import com.tools20022.metamodel.MMProcessContent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Technical component that contains the validated supplementary data
 * information. This technical envelope allows to segregate the supplementary
 * data information from any other information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMExternalSchema#getProcessContent
 * processContent} = com.tools20022.metamodel.MMProcessContent.LAX</li>
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
 * "SupplementaryDataEnvelope1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Technical component that contains the validated supplementary data information. This technical envelope allows to segregate the supplementary data information from any other information."
 * </li>
 * </ul>
 */
public class SupplementaryDataEnvelope1 {

	final static private AtomicReference<MMExternalSchema> mmObject_lazy = new AtomicReference<>();

	final static public MMExternalSchema mmObject() {
		mmObject_lazy.compareAndSet(null, new MMExternalSchema() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SupplementaryDataEnvelope1";
				definition = "Technical component that contains the validated supplementary data information. This technical envelope allows to segregate the supplementary data information from any other information.";
				processContent = MMProcessContent.LAX;
			}
		});
		return mmObject_lazy.get();
	}
}