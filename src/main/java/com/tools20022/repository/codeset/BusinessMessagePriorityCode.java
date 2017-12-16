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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.BusinessMessagePriorityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the priority levels for the BusinessMessage.<br>
 * The different priorities are typically user / service / implementation
 * dependent. The semantics of the different values for a Mesage (Set) need to
 * be defined by the relevant user community (SEG, ...).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"high"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessMessagePriorityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the priority levels for the BusinessMessage.\r\nThe different priorities are typically user / service / implementation dependent. The semantics of the different values for a Mesage (Set) need to be defined by the relevant user community (SEG, ...)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BusinessMessagePriorityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	final static private LinkedHashMap<String, BusinessMessagePriorityCode> codesByName = new LinkedHashMap<>();

	protected BusinessMessagePriorityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("high");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessMessagePriorityCode";
				definition = "Specifies the priority levels for the BusinessMessage.\r\nThe different priorities are typically user / service / implementation dependent. The semantics of the different values for a Mesage (Set) need to be defined by the relevant user community (SEG, ...).";
			}
		});
		return mmObject_lazy.get();
	}

	static {
	}

	public static BusinessMessagePriorityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BusinessMessagePriorityCode[] values() {
		BusinessMessagePriorityCode[] values = new BusinessMessagePriorityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BusinessMessagePriorityCode> {
		@Override
		public BusinessMessagePriorityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BusinessMessagePriorityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}