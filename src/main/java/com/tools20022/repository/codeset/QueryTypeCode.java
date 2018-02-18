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
import com.tools20022.repository.codeset.QueryTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifyies the nature of the query, i.e. whether the query requests that all
 * matching items be returned or only new matching items since the last similar
 * query be returned.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QueryTypeCode#All
 * QueryTypeCode.All}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QueryTypeCode#Changed
 * QueryTypeCode.Changed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QueryTypeCode#Modified
 * QueryTypeCode.Modified}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QueryTypeCode#Deleted
 * QueryTypeCode.Deleted}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QueryType3Code
 * QueryType3Code}</li>
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
 * <li>"ALLL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QueryTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifyies the nature of the query, i.e. whether the query requests that all matching items be returned or only new matching items since the last similar query be returned."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QueryTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the query requests that all matching items be returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTypeCode
	 * QueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "All"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the query requests that all matching items be returned."</li>
	 * </ul>
	 */
	public static final QueryTypeCode All = new QueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "All";
			definition = "Specifies that the query requests that all matching items be returned.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTypeCode.mmObject();
			codeName = "ALLL";
		}
	};
	/**
	 * Specifies that the query requests that only new matching items since the
	 * last similar query be returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTypeCode
	 * QueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Changed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the query requests that only new matching items since the last similar query be returned."
	 * </li>
	 * </ul>
	 */
	public static final QueryTypeCode Changed = new QueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Changed";
			definition = "Specifies that the query requests that only new matching items since the last similar query be returned.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTypeCode.mmObject();
			codeName = "CHNG";
		}
	};
	/**
	 * Specifies that the query requests that only items that have changed since
	 * the last query be returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTypeCode
	 * QueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the query requests that only items that have changed since the last query be returned."
	 * </li>
	 * </ul>
	 */
	public static final QueryTypeCode Modified = new QueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modified";
			definition = "Specifies that the query requests that only items that have changed since the last query be returned.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTypeCode.mmObject();
			codeName = "MODF";
		}
	};
	/**
	 * Specifies that the query requests that items that have been deleted since
	 * the last query be returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTypeCode
	 * QueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the query requests that items that have been deleted since the last query be returned."
	 * </li>
	 * </ul>
	 */
	public static final QueryTypeCode Deleted = new QueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deleted";
			definition = "Specifies that the query requests that items that have been deleted since the last query be returned.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTypeCode.mmObject();
			codeName = "DELD";
		}
	};
	final static private LinkedHashMap<String, QueryTypeCode> codesByName = new LinkedHashMap<>();

	protected QueryTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ALLL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QueryTypeCode";
				definition = "Specifyies the nature of the query, i.e. whether the query requests that all matching items be returned or only new matching items since the last similar query be returned.";
				derivation_lazy = () -> Arrays.asList(QueryType3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QueryTypeCode.All, com.tools20022.repository.codeset.QueryTypeCode.Changed, com.tools20022.repository.codeset.QueryTypeCode.Modified,
						com.tools20022.repository.codeset.QueryTypeCode.Deleted);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(All.getCodeName().get(), All);
		codesByName.put(Changed.getCodeName().get(), Changed);
		codesByName.put(Modified.getCodeName().get(), Modified);
		codesByName.put(Deleted.getCodeName().get(), Deleted);
	}

	public static QueryTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QueryTypeCode[] values() {
		QueryTypeCode[] values = new QueryTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QueryTypeCode> {
		@Override
		public QueryTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QueryTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}