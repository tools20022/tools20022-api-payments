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
import com.tools20022.repository.codeset.QueryType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifyies the nature of the request, that is whether all information be
 * returned or only information that has changed since the last similar request
 * was returned.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QueryType3Code#All
 * QueryType3Code.All}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QueryType3Code#Changed
 * QueryType3Code.Changed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QueryType3Code#Modified
 * QueryType3Code.Modified}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.QueryTypeCode QueryTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ALLL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QueryType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifyies the nature of the request, that is whether all information be returned or only information that has changed since the last similar request was returned."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QueryType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryType3Code
	 * QueryType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "All"</li>
	 * </ul>
	 */
	public static final QueryType3Code All = new QueryType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "All";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryType3Code.mmObject();
			codeName = QueryTypeCode.All.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryType3Code
	 * QueryType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Changed"</li>
	 * </ul>
	 */
	public static final QueryType3Code Changed = new QueryType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Changed";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryType3Code.mmObject();
			codeName = QueryTypeCode.Changed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryType3Code
	 * QueryType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modified"</li>
	 * </ul>
	 */
	public static final QueryType3Code Modified = new QueryType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modified";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryType3Code.mmObject();
			codeName = QueryTypeCode.Modified.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, QueryType3Code> codesByName = new LinkedHashMap<>();

	protected QueryType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ALLL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QueryType3Code";
				definition = "Specifyies the nature of the request, that is whether all information be returned or only information that has changed since the last similar request was returned.";
				trace_lazy = () -> QueryTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QueryType3Code.All, com.tools20022.repository.codeset.QueryType3Code.Changed, com.tools20022.repository.codeset.QueryType3Code.Modified);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(All.getCodeName().get(), All);
		codesByName.put(Changed.getCodeName().get(), Changed);
		codesByName.put(Modified.getCodeName().get(), Modified);
	}

	public static QueryType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QueryType3Code[] values() {
		QueryType3Code[] values = new QueryType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QueryType3Code> {
		@Override
		public QueryType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QueryType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}