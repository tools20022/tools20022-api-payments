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
import com.tools20022.repository.codeset.StatusResponseCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of the response.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusResponseCode#NoResponseYet
 * StatusResponseCode.NoResponseYet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusResponseCode#PartialResponse
 * StatusResponseCode.PartialResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusResponseCode#CompleteResponse
 * StatusResponseCode.CompleteResponse}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.StatusResponse1Code
 * StatusResponse1Code}</li>
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
 * <li>"NRES"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusResponseCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the response."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StatusResponseCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Response not provided yet.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusResponseCode
	 * StatusResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoResponseYet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response not provided yet."</li>
	 * </ul>
	 */
	public static final StatusResponseCode NoResponseYet = new StatusResponseCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoResponseYet";
			definition = "Response not provided yet.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusResponseCode.mmObject();
			codeName = "NRES";
		}
	};
	/**
	 * Response is partially provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusResponseCode
	 * StatusResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response is partially provided."</li>
	 * </ul>
	 */
	public static final StatusResponseCode PartialResponse = new StatusResponseCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialResponse";
			definition = "Response is partially provided.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusResponseCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Response is complete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusResponseCode
	 * StatusResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompleteResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response is complete."</li>
	 * </ul>
	 */
	public static final StatusResponseCode CompleteResponse = new StatusResponseCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompleteResponse";
			definition = "Response is complete.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusResponseCode.mmObject();
			codeName = "COMP";
		}
	};
	final static private LinkedHashMap<String, StatusResponseCode> codesByName = new LinkedHashMap<>();

	protected StatusResponseCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NRES");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusResponseCode";
				definition = "Specifies the status of the response.";
				derivation_lazy = () -> Arrays.asList(StatusResponse1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StatusResponseCode.NoResponseYet, com.tools20022.repository.codeset.StatusResponseCode.PartialResponse,
						com.tools20022.repository.codeset.StatusResponseCode.CompleteResponse);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NoResponseYet.getCodeName().get(), NoResponseYet);
		codesByName.put(PartialResponse.getCodeName().get(), PartialResponse);
		codesByName.put(CompleteResponse.getCodeName().get(), CompleteResponse);
	}

	public static StatusResponseCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StatusResponseCode[] values() {
		StatusResponseCode[] values = new StatusResponseCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StatusResponseCode> {
		@Override
		public StatusResponseCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StatusResponseCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}