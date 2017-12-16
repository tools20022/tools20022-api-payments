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
import com.tools20022.repository.codeset.ExternalMandateSetupReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the external mandate setup reason code in the format of character
 * string with a maximum length of 4 characters.<br>
 * External code sets can be downloaded from www.iso20022.org.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ExternalMandateSetupReasonCode
 * ExternalMandateSetupReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExternalMandateSetupReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the external mandate setup reason code in the format of character string with a maximum length of 4 characters.\r\nExternal code sets can be downloaded from www.iso20022.org."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExternalMandateSetupReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	final static private LinkedHashMap<String, ExternalMandateSetupReason1Code> codesByName = new LinkedHashMap<>();

	protected ExternalMandateSetupReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExternalMandateSetupReason1Code";
				definition = "Specifies the external mandate setup reason code in the format of character string with a maximum length of 4 characters.\r\nExternal code sets can be downloaded from www.iso20022.org.";
				trace_lazy = () -> ExternalMandateSetupReasonCode.mmObject();
				minLength = 1;
				maxLength = 4;
			}
		});
		return mmObject_lazy.get();
	}

	static {
	}

	public static ExternalMandateSetupReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExternalMandateSetupReason1Code[] values() {
		ExternalMandateSetupReason1Code[] values = new ExternalMandateSetupReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExternalMandateSetupReason1Code> {
		@Override
		public ExternalMandateSetupReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExternalMandateSetupReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}