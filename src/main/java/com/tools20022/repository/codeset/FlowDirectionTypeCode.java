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
import com.tools20022.repository.codeset.FlowDirectionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the direction of a cash flow.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FlowDirectionTypeCode#Incoming
 * FlowDirectionTypeCode.mmIncoming}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FlowDirectionTypeCode#Outgoing
 * FlowDirectionTypeCode.mmOutgoing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INCG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FlowDirectionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the direction of a cash flow."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FlowDirectionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of money received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FlowDirectionTypeCode
	 * FlowDirectionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incoming"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money received."</li>
	 * </ul>
	 */
	public static final FlowDirectionTypeCode Incoming = new FlowDirectionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Incoming";
			definition = "Amount of money received.";
			owner_lazy = () -> com.tools20022.repository.codeset.FlowDirectionTypeCode.mmObject();
			codeName = "INCG";
		}
	};
	/**
	 * Amount of money paid out.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FlowDirectionTypeCode
	 * FlowDirectionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OUTG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Outgoing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money paid out."</li>
	 * </ul>
	 */
	public static final FlowDirectionTypeCode Outgoing = new FlowDirectionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Outgoing";
			definition = "Amount of money paid out.";
			owner_lazy = () -> com.tools20022.repository.codeset.FlowDirectionTypeCode.mmObject();
			codeName = "OUTG";
		}
	};
	final static private LinkedHashMap<String, FlowDirectionTypeCode> codesByName = new LinkedHashMap<>();

	protected FlowDirectionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("INCG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FlowDirectionTypeCode";
				definition = "Specifies the direction of a cash flow.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FlowDirectionTypeCode.Incoming, com.tools20022.repository.codeset.FlowDirectionTypeCode.Outgoing);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Incoming.getCodeName().get(), Incoming);
		codesByName.put(Outgoing.getCodeName().get(), Outgoing);
	}

	public static FlowDirectionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FlowDirectionTypeCode[] values() {
		FlowDirectionTypeCode[] values = new FlowDirectionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FlowDirectionTypeCode> {
		@Override
		public FlowDirectionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FlowDirectionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}