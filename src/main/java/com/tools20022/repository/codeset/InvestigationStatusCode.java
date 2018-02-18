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
import com.tools20022.repository.codeset.InvestigationStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Provides the status of the investigation response related to a previously
 * sent request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationStatusCode#DataFound
 * InvestigationStatusCode.DataFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationStatusCode#DataNotFound
 * InvestigationStatusCode.DataNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationStatusCode#NotApplicable
 * InvestigationStatusCode.NotApplicable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InvestigationStatus1Code
 * InvestigationStatus1Code}</li>
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
 * <li>"FOUN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestigationStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the status of the investigation response related to a previously sent request."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestigationStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Search for requested data is complete, the data has been found and will
	 * be sent using a separate message flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationStatusCode
	 * InvestigationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FOUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Search for requested data is complete, the data has been found and will be sent using a separate message flow."
	 * </li>
	 * </ul>
	 */
	public static final InvestigationStatusCode DataFound = new InvestigationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataFound";
			definition = "Search for requested data is complete, the data has been found and will be sent using a separate message flow.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationStatusCode.mmObject();
			codeName = "FOUN";
		}
	};
	/**
	 * Search for requested data is complete, data not found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationStatusCode
	 * InvestigationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NFOU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Search for requested data is complete, data not found."</li>
	 * </ul>
	 */
	public static final InvestigationStatusCode DataNotFound = new InvestigationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataNotFound";
			definition = "Search for requested data is complete, data not found.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationStatusCode.mmObject();
			codeName = "NFOU";
		}
	};
	/**
	 * Search for requested data not complete yet.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationStatusCode
	 * InvestigationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotApplicable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Search for requested data not complete yet."</li>
	 * </ul>
	 */
	public static final InvestigationStatusCode NotApplicable = new InvestigationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotApplicable";
			definition = "Search for requested data not complete yet.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationStatusCode.mmObject();
			codeName = "NOAP";
		}
	};
	final static private LinkedHashMap<String, InvestigationStatusCode> codesByName = new LinkedHashMap<>();

	protected InvestigationStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FOUN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestigationStatusCode";
				definition = "Provides the status of the investigation response related to a previously sent request.";
				derivation_lazy = () -> Arrays.asList(InvestigationStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestigationStatusCode.DataFound, com.tools20022.repository.codeset.InvestigationStatusCode.DataNotFound,
						com.tools20022.repository.codeset.InvestigationStatusCode.NotApplicable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DataFound.getCodeName().get(), DataFound);
		codesByName.put(DataNotFound.getCodeName().get(), DataNotFound);
		codesByName.put(NotApplicable.getCodeName().get(), NotApplicable);
	}

	public static InvestigationStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestigationStatusCode[] values() {
		InvestigationStatusCode[] values = new InvestigationStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestigationStatusCode> {
		@Override
		public InvestigationStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestigationStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}