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
import com.tools20022.repository.codeset.CaseStatus2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of an investigation case.
 * 
 * Note: The cases that have been rejected (not accepted) are unknown to the
 * Party reporting the status of cases. They will be reported with the
 * CaseStatusCode = Unknown.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CaseStatus2Code#Closed
 * CaseStatus2Code.Closed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CaseStatus2Code#Assigned
 * CaseStatus2Code.Assigned}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseStatus2Code#UnderInvestigation
 * CaseStatus2Code.UnderInvestigation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CaseStatus2Code#Unknown
 * CaseStatus2Code.Unknown}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CaseStatus2Code#Overdue
 * CaseStatus2Code.Overdue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CaseStatusCode CaseStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CLSD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CaseStatus2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of an investigation case.\n\nNote: \nThe cases that have been rejected (not accepted) are unknown to the Party reporting the status of cases. They will be reported with the CaseStatusCode = Unknown."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CaseStatus2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseStatus2Code
	 * CaseStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closed"</li>
	 * </ul>
	 */
	public static final CaseStatus2Code Closed = new CaseStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closed";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseStatus2Code.mmObject();
			codeName = CaseStatusCode.Closed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseStatus2Code
	 * CaseStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assigned"</li>
	 * </ul>
	 */
	public static final CaseStatus2Code Assigned = new CaseStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assigned";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseStatus2Code.mmObject();
			codeName = CaseStatusCode.Assigned.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseStatus2Code
	 * CaseStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderInvestigation"</li>
	 * </ul>
	 */
	public static final CaseStatus2Code UnderInvestigation = new CaseStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderInvestigation";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseStatus2Code.mmObject();
			codeName = CaseStatusCode.UnderInvestigation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseStatus2Code
	 * CaseStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final CaseStatus2Code Unknown = new CaseStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseStatus2Code.mmObject();
			codeName = CaseStatusCode.Unknown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseStatus2Code
	 * CaseStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Overdue"</li>
	 * </ul>
	 */
	public static final CaseStatus2Code Overdue = new CaseStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Overdue";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseStatus2Code.mmObject();
			codeName = CaseStatusCode.Overdue.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CaseStatus2Code> codesByName = new LinkedHashMap<>();

	protected CaseStatus2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CLSD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CaseStatus2Code";
				definition = "Specifies the status of an investigation case.\n\nNote: \nThe cases that have been rejected (not accepted) are unknown to the Party reporting the status of cases. They will be reported with the CaseStatusCode = Unknown.";
				trace_lazy = () -> CaseStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CaseStatus2Code.Closed, com.tools20022.repository.codeset.CaseStatus2Code.Assigned, com.tools20022.repository.codeset.CaseStatus2Code.UnderInvestigation,
						com.tools20022.repository.codeset.CaseStatus2Code.Unknown, com.tools20022.repository.codeset.CaseStatus2Code.Overdue);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Closed.getCodeName().get(), Closed);
		codesByName.put(Assigned.getCodeName().get(), Assigned);
		codesByName.put(UnderInvestigation.getCodeName().get(), UnderInvestigation);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
		codesByName.put(Overdue.getCodeName().get(), Overdue);
	}

	public static CaseStatus2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CaseStatus2Code[] values() {
		CaseStatus2Code[] values = new CaseStatus2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CaseStatus2Code> {
		@Override
		public CaseStatus2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CaseStatus2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}