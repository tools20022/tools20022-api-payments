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
import com.tools20022.repository.codeset.AccountLevel2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the level of an account within the account hierarchy.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountLevel2Code#Intermediate
 * AccountLevel2Code.Intermediate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountLevel2Code#Summary
 * AccountLevel2Code.Summary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountLevel2Code#Detail
 * AccountLevel2Code.Detail}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AccountLevelCode
 * AccountLevelCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INTM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountLevel2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the level of an account within the account hierarchy."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountLevel2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountLevel2Code
	 * AccountLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediate"</li>
	 * </ul>
	 */
	public static final AccountLevel2Code Intermediate = new AccountLevel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediate";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountLevel2Code.mmObject();
			codeName = AccountLevelCode.Intermediate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountLevel2Code
	 * AccountLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Summary"</li>
	 * </ul>
	 */
	public static final AccountLevel2Code Summary = new AccountLevel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Summary";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountLevel2Code.mmObject();
			codeName = AccountLevelCode.Summary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountLevel2Code
	 * AccountLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detail"</li>
	 * </ul>
	 */
	public static final AccountLevel2Code Detail = new AccountLevel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detail";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountLevel2Code.mmObject();
			codeName = AccountLevelCode.Detail.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AccountLevel2Code> codesByName = new LinkedHashMap<>();

	protected AccountLevel2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INTM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountLevel2Code";
				definition = "Defines the level of an account within the account hierarchy.";
				trace_lazy = () -> AccountLevelCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountLevel2Code.Intermediate, com.tools20022.repository.codeset.AccountLevel2Code.Summary, com.tools20022.repository.codeset.AccountLevel2Code.Detail);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Intermediate.getCodeName().get(), Intermediate);
		codesByName.put(Summary.getCodeName().get(), Summary);
		codesByName.put(Detail.getCodeName().get(), Detail);
	}

	public static AccountLevel2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountLevel2Code[] values() {
		AccountLevel2Code[] values = new AccountLevel2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountLevel2Code> {
		@Override
		public AccountLevel2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountLevel2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}