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
import com.tools20022.repository.codeset.RenounceableStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the renounceable status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RenounceableStatusCode#NonRenounceable
 * RenounceableStatusCode.mmNonRenounceable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RenounceableStatusCode#Renounceable
 * RenounceableStatusCode.mmRenounceable}</li>
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
 * <li>"NREN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RenounceableStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the renounceable status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RenounceableStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Intermediate securities cannot be sold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RenounceableStatusCode
	 * RenounceableStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NREN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonRenounceable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intermediate securities cannot be sold."</li>
	 * </ul>
	 */
	public static final RenounceableStatusCode NonRenounceable = new RenounceableStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonRenounceable";
			definition = "Intermediate securities cannot be sold.";
			owner_lazy = () -> com.tools20022.repository.codeset.RenounceableStatusCode.mmObject();
			codeName = "NREN";
		}
	};
	/**
	 * Intermediate securities can be sold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RenounceableStatusCode
	 * RenounceableStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RENO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Renounceable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intermediate securities can be sold."</li>
	 * </ul>
	 */
	public static final RenounceableStatusCode Renounceable = new RenounceableStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Renounceable";
			definition = "Intermediate securities can be sold.";
			owner_lazy = () -> com.tools20022.repository.codeset.RenounceableStatusCode.mmObject();
			codeName = "RENO";
		}
	};
	final static private LinkedHashMap<String, RenounceableStatusCode> codesByName = new LinkedHashMap<>();

	protected RenounceableStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NREN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RenounceableStatusCode";
				definition = "Specifies the renounceable status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RenounceableStatusCode.NonRenounceable, com.tools20022.repository.codeset.RenounceableStatusCode.Renounceable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NonRenounceable.getCodeName().get(), NonRenounceable);
		codesByName.put(Renounceable.getCodeName().get(), Renounceable);
	}

	public static RenounceableStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RenounceableStatusCode[] values() {
		RenounceableStatusCode[] values = new RenounceableStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RenounceableStatusCode> {
		@Override
		public RenounceableStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RenounceableStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}