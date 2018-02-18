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
import com.tools20022.repository.codeset.PoliticalExposureTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the political exposure type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureTypeCode#PoliticalExposureDomestic
 * PoliticalExposureTypeCode.PoliticalExposureDomestic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureTypeCode#PoliticalExposureForeign
 * PoliticalExposureTypeCode.PoliticalExposureForeign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureTypeCode#NoPoliticalExposure
 * PoliticalExposureTypeCode.NoPoliticalExposure}</li>
 * </ul>
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
 * "PoliticalExposureTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the political exposure type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PoliticalExposureTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Political exposure type is domestic.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureTypeCode
	 * PoliticalExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEXD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoliticalExposureDomestic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Political exposure type is domestic."</li>
	 * </ul>
	 */
	public static final PoliticalExposureTypeCode PoliticalExposureDomestic = new PoliticalExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoliticalExposureDomestic";
			definition = "Political exposure type is domestic.";
			owner_lazy = () -> com.tools20022.repository.codeset.PoliticalExposureTypeCode.mmObject();
			codeName = "PEXD";
		}
	};
	/**
	 * Political exposure type is foreign.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureTypeCode
	 * PoliticalExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEXF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoliticalExposureForeign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Political exposure type is foreign."</li>
	 * </ul>
	 */
	public static final PoliticalExposureTypeCode PoliticalExposureForeign = new PoliticalExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoliticalExposureForeign";
			definition = "Political exposure type is foreign.";
			owner_lazy = () -> com.tools20022.repository.codeset.PoliticalExposureTypeCode.mmObject();
			codeName = "PEXF";
		}
	};
	/**
	 * No political exposure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureTypeCode
	 * PoliticalExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoPoliticalExposure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No political exposure."</li>
	 * </ul>
	 */
	public static final PoliticalExposureTypeCode NoPoliticalExposure = new PoliticalExposureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoPoliticalExposure";
			definition = "No political exposure.";
			owner_lazy = () -> com.tools20022.repository.codeset.PoliticalExposureTypeCode.mmObject();
			codeName = "NPEX";
		}
	};
	final static private LinkedHashMap<String, PoliticalExposureTypeCode> codesByName = new LinkedHashMap<>();

	protected PoliticalExposureTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PoliticalExposureTypeCode";
				definition = "Specifies the political exposure type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PoliticalExposureTypeCode.PoliticalExposureDomestic, com.tools20022.repository.codeset.PoliticalExposureTypeCode.PoliticalExposureForeign,
						com.tools20022.repository.codeset.PoliticalExposureTypeCode.NoPoliticalExposure);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PoliticalExposureDomestic.getCodeName().get(), PoliticalExposureDomestic);
		codesByName.put(PoliticalExposureForeign.getCodeName().get(), PoliticalExposureForeign);
		codesByName.put(NoPoliticalExposure.getCodeName().get(), NoPoliticalExposure);
	}

	public static PoliticalExposureTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PoliticalExposureTypeCode[] values() {
		PoliticalExposureTypeCode[] values = new PoliticalExposureTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PoliticalExposureTypeCode> {
		@Override
		public PoliticalExposureTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PoliticalExposureTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}