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
import com.tools20022.repository.codeset.MatchingStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Provides the matching status of the instruction at the time the settlement
 * instruction was sent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MatchingStatusCode#Matched
 * MatchingStatusCode.Matched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MatchingStatusCode#Unmatched
 * MatchingStatusCode.Unmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MatchingStatusCode#MatchingAlleged
 * MatchingStatusCode.MatchingAlleged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MatchingStatusCode#MisMatched
 * MatchingStatusCode.MisMatched}</li>
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
 * <li>"MACH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MatchingStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the matching status of the instruction at the time the settlement instruction was sent."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MatchingStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction has been matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MatchingStatusCode
	 * MatchingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MACH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been matched."</li>
	 * </ul>
	 */
	public static final MatchingStatusCode Matched = new MatchingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			definition = "Instruction has been matched.";
			owner_lazy = () -> com.tools20022.repository.codeset.MatchingStatusCode.mmObject();
			codeName = "MACH";
		}
	};
	/**
	 * Instruction has not been matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MatchingStatusCode
	 * MatchingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has not been matched."</li>
	 * </ul>
	 */
	public static final MatchingStatusCode Unmatched = new MatchingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			definition = "Instruction has not been matched.";
			owner_lazy = () -> com.tools20022.repository.codeset.MatchingStatusCode.mmObject();
			codeName = "NMAT";
		}
	};
	/**
	 * Instruction has been alleged matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MatchingStatusCode
	 * MatchingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALGE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingAlleged"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been alleged matched."</li>
	 * </ul>
	 */
	public static final MatchingStatusCode MatchingAlleged = new MatchingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingAlleged";
			definition = "Instruction has been alleged matched.";
			owner_lazy = () -> com.tools20022.repository.codeset.MatchingStatusCode.mmObject();
			codeName = "ALGE";
		}
	};
	/**
	 * Instruction has been mis-matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MatchingStatusCode
	 * MatchingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MMAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MisMatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been mis-matched."</li>
	 * </ul>
	 */
	public static final MatchingStatusCode MisMatched = new MatchingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MisMatched";
			definition = "Instruction has been mis-matched.";
			owner_lazy = () -> com.tools20022.repository.codeset.MatchingStatusCode.mmObject();
			codeName = "MMAT";
		}
	};
	final static private LinkedHashMap<String, MatchingStatusCode> codesByName = new LinkedHashMap<>();

	protected MatchingStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MACH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MatchingStatusCode";
				definition = "Provides the matching status of the instruction at the time the settlement instruction was sent.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MatchingStatusCode.Matched, com.tools20022.repository.codeset.MatchingStatusCode.Unmatched,
						com.tools20022.repository.codeset.MatchingStatusCode.MatchingAlleged, com.tools20022.repository.codeset.MatchingStatusCode.MisMatched);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Matched.getCodeName().get(), Matched);
		codesByName.put(Unmatched.getCodeName().get(), Unmatched);
		codesByName.put(MatchingAlleged.getCodeName().get(), MatchingAlleged);
		codesByName.put(MisMatched.getCodeName().get(), MisMatched);
	}

	public static MatchingStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MatchingStatusCode[] values() {
		MatchingStatusCode[] values = new MatchingStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MatchingStatusCode> {
		@Override
		public MatchingStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MatchingStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}