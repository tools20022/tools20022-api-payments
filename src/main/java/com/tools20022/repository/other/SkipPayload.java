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
 * Specifies a data structure that allows to include any valid XML Structure
 * (e.g. through an XML Schema). The property namespace is set to 'any'.<br>
 * The processContents value is 'skip' which according to the above
 * specification and to Iso20022: 2013 means that the application will not
 * perform further validation processing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMExternalSchema#getProcessContent
 * processContent} = com.tools20022.metamodel.MMProcessContent.SKIP</li>
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
 * "SkipPayload"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a data structure that allows to include any valid XML Structure (e.g. through an XML Schema). The property namespace is set to 'any'.\r\nThe processContents value is 'skip' which according to the above specification and to Iso20022: 2013 means that the application will not perform further validation processing."
 * </li>
 * </ul>
 */
public class SkipPayload {

	final static private AtomicReference<MMExternalSchema> mmObject_lazy = new AtomicReference<>();

	final static public MMExternalSchema mmObject() {
		mmObject_lazy.compareAndSet(null, new MMExternalSchema() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SkipPayload";
				definition = "Specifies a data structure that allows to include any valid XML Structure (e.g. through an XML Schema). The property namespace is set to 'any'.\r\nThe processContents value is 'skip' which according to the above specification and to Iso20022: 2013 means that the application will not perform further validation processing.";
				processContent = MMProcessContent.SKIP;
			}
		});
		return mmObject_lazy.get();
	}
}