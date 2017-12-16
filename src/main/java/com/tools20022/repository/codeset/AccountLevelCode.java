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
import com.tools20022.repository.codeset.AccountLevelCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.AccountLevelCode#Intermediate
 * AccountLevelCode.mmIntermediate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountLevelCode#Summary
 * AccountLevelCode.mmSummary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountLevelCode#Detail
 * AccountLevelCode.mmDetail}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountLevel2Code
 * AccountLevel2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountLevel1Code
 * AccountLevel1Code}</li>
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
 * <li>"INTM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountLevelCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the level of an account within the account hierarchy."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountLevelCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Intermediate level within an account hierarchy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountLevelCode
	 * AccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intermediate level within an account hierarchy."</li>
	 * </ul>
	 */
	public static final AccountLevelCode Intermediate = new AccountLevelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediate";
			definition = "Intermediate level within an account hierarchy.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountLevelCode.mmObject();
			codeName = "INTM";
		}
	};
	/**
	 * Highest level within an account hierarchy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountLevelCode
	 * AccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMRY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Summary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Highest level within an account hierarchy."</li>
	 * </ul>
	 */
	public static final AccountLevelCode Summary = new AccountLevelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Summary";
			definition = "Highest level within an account hierarchy.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountLevelCode.mmObject();
			codeName = "SMRY";
		}
	};
	/**
	 * Account is a real deposit/current account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountLevelCode
	 * AccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DETL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is a real deposit/current account."</li>
	 * </ul>
	 */
	public static final AccountLevelCode Detail = new AccountLevelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detail";
			definition = "Account is a real deposit/current account.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountLevelCode.mmObject();
			codeName = "DETL";
		}
	};
	final static private LinkedHashMap<String, AccountLevelCode> codesByName = new LinkedHashMap<>();

	protected AccountLevelCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("INTM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountLevelCode";
				definition = "Defines the level of an account within the account hierarchy.";
				derivation_lazy = () -> Arrays.asList(AccountLevel2Code.mmObject(), AccountLevel1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountLevelCode.Intermediate, com.tools20022.repository.codeset.AccountLevelCode.Summary, com.tools20022.repository.codeset.AccountLevelCode.Detail);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Intermediate.getCodeName().get(), Intermediate);
		codesByName.put(Summary.getCodeName().get(), Summary);
		codesByName.put(Detail.getCodeName().get(), Detail);
	}

	public static AccountLevelCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountLevelCode[] values() {
		AccountLevelCode[] values = new AccountLevelCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountLevelCode> {
		@Override
		public AccountLevelCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountLevelCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}