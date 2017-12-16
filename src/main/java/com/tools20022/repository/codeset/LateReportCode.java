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
import com.tools20022.repository.codeset.LateReportCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether a transaction report is late.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.LateReportCode#Late
 * LateReportCode.mmLate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LateReportCode#LateBecausePartial
 * LateReportCode.mmLateBecausePartial}</li>
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
 * <li>"LAT1"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LateReportCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether a transaction report is late."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LateReportCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The confirmation is late.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LateReportCode
	 * LateReportCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LAT1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Late"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The confirmation is late."</li>
	 * </ul>
	 */
	public static final LateReportCode Late = new LateReportCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Late";
			definition = "The confirmation is late.";
			owner_lazy = () -> com.tools20022.repository.codeset.LateReportCode.mmObject();
			codeName = "LAT1";
		}
	};
	/**
	 * The confirmation is late because the trade was executed as a number of
	 * partials.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LateReportCode
	 * LateReportCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LAT2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateBecausePartial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The confirmation is late because the trade was executed as a number of partials."
	 * </li>
	 * </ul>
	 */
	public static final LateReportCode LateBecausePartial = new LateReportCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LateBecausePartial";
			definition = "The confirmation is late because the trade was executed as a number of partials.";
			owner_lazy = () -> com.tools20022.repository.codeset.LateReportCode.mmObject();
			codeName = "LAT2";
		}
	};
	final static private LinkedHashMap<String, LateReportCode> codesByName = new LinkedHashMap<>();

	protected LateReportCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("LAT1");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LateReportCode";
				definition = "Specifies whether a transaction report is late.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LateReportCode.Late, com.tools20022.repository.codeset.LateReportCode.LateBecausePartial);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Late.getCodeName().get(), Late);
		codesByName.put(LateBecausePartial.getCodeName().get(), LateBecausePartial);
	}

	public static LateReportCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LateReportCode[] values() {
		LateReportCode[] values = new LateReportCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LateReportCode> {
		@Override
		public LateReportCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LateReportCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}