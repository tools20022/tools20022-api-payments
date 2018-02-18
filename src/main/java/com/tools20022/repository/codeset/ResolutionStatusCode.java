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
import com.tools20022.repository.codeset.ResolutionStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a resolution in a meeting agenda.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResolutionStatusCode#Active
 * ResolutionStatusCode.Active}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResolutionStatusCode#Withdrawn
 * ResolutionStatusCode.Withdrawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResolutionStatusCode#Rejected
 * ResolutionStatusCode.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResolutionStatusCode#Accepted
 * ResolutionStatusCode.Accepted}</li>
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
 * <li>"ACTV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResolutionStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a resolution in a meeting agenda."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ResolutionStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting resolution has to be voted for by the participants to a general
	 * meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionStatusCode
	 * ResolutionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Active"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting resolution has to be voted for by the participants to a general meeting."
	 * </li>
	 * </ul>
	 */
	public static final ResolutionStatusCode Active = new ResolutionStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Active";
			definition = "Meeting resolution has to be voted for by the participants to a general meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResolutionStatusCode.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * Meeting resolution has been withdrawn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionStatusCode
	 * ResolutionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WDRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting resolution has been withdrawn."</li>
	 * </ul>
	 */
	public static final ResolutionStatusCode Withdrawn = new ResolutionStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Withdrawn";
			definition = "Meeting resolution has been withdrawn.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResolutionStatusCode.mmObject();
			codeName = "WDRA";
		}
	};
	/**
	 * Meeting resolution has been rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionStatusCode
	 * ResolutionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting resolution has been rejected."</li>
	 * </ul>
	 */
	public static final ResolutionStatusCode Rejected = new ResolutionStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Meeting resolution has been rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResolutionStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Meeting resolution has been accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionStatusCode
	 * ResolutionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting resolution has been accepted."</li>
	 * </ul>
	 */
	public static final ResolutionStatusCode Accepted = new ResolutionStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Meeting resolution has been accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResolutionStatusCode.mmObject();
			codeName = "ACPT";
		}
	};
	final static private LinkedHashMap<String, ResolutionStatusCode> codesByName = new LinkedHashMap<>();

	protected ResolutionStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResolutionStatusCode";
				definition = "Specifies the status of a resolution in a meeting agenda.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResolutionStatusCode.Active, com.tools20022.repository.codeset.ResolutionStatusCode.Withdrawn,
						com.tools20022.repository.codeset.ResolutionStatusCode.Rejected, com.tools20022.repository.codeset.ResolutionStatusCode.Accepted);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Active.getCodeName().get(), Active);
		codesByName.put(Withdrawn.getCodeName().get(), Withdrawn);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
	}

	public static ResolutionStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ResolutionStatusCode[] values() {
		ResolutionStatusCode[] values = new ResolutionStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ResolutionStatusCode> {
		@Override
		public ResolutionStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ResolutionStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}