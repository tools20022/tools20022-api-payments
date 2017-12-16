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
import com.tools20022.repository.codeset.InvestigationStatus1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.InvestigationStatus1Code#DataFound
 * InvestigationStatus1Code.mmDataFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationStatus1Code#DataNotFound
 * InvestigationStatus1Code.mmDataNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationStatus1Code#NotApplicable
 * InvestigationStatus1Code.mmNotApplicable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InvestigationStatusCode
 * InvestigationStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
 * "InvestigationStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the status of the investigation response related to a previously sent request."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestigationStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationStatus1Code
	 * InvestigationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataFound"</li>
	 * </ul>
	 */
	public static final InvestigationStatus1Code DataFound = new InvestigationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataFound";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationStatus1Code.mmObject();
			codeName = InvestigationStatusCode.DataFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationStatus1Code
	 * InvestigationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataNotFound"</li>
	 * </ul>
	 */
	public static final InvestigationStatus1Code DataNotFound = new InvestigationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationStatus1Code.mmObject();
			codeName = InvestigationStatusCode.DataNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationStatus1Code
	 * InvestigationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotApplicable"</li>
	 * </ul>
	 */
	public static final InvestigationStatus1Code NotApplicable = new InvestigationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotApplicable";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationStatus1Code.mmObject();
			codeName = InvestigationStatusCode.NotApplicable.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestigationStatus1Code> codesByName = new LinkedHashMap<>();

	protected InvestigationStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FOUN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestigationStatus1Code";
				definition = "Provides the status of the investigation response related to a previously sent request.";
				trace_lazy = () -> InvestigationStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestigationStatus1Code.DataFound, com.tools20022.repository.codeset.InvestigationStatus1Code.DataNotFound,
						com.tools20022.repository.codeset.InvestigationStatus1Code.NotApplicable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DataFound.getCodeName().get(), DataFound);
		codesByName.put(DataNotFound.getCodeName().get(), DataNotFound);
		codesByName.put(NotApplicable.getCodeName().get(), NotApplicable);
	}

	public static InvestigationStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestigationStatus1Code[] values() {
		InvestigationStatus1Code[] values = new InvestigationStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestigationStatus1Code> {
		@Override
		public InvestigationStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestigationStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}