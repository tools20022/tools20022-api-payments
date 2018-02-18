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
import com.tools20022.repository.codeset.TransactionEnvironmentCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the environment of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode#Merchant
 * TransactionEnvironmentCode.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode#Private
 * TransactionEnvironmentCode.Private}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode#Public
 * TransactionEnvironmentCode.Public}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode#Branch
 * TransactionEnvironmentCode.Branch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode#Other
 * TransactionEnvironmentCode.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironment1Code
 * TransactionEnvironment1Code}</li>
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
 * <li>"MERC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionEnvironmentCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the environment of the transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionEnvironmentCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Merchant environment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode
	 * TransactionEnvironmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MERC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Merchant environment."</li>
	 * </ul>
	 */
	public static final TransactionEnvironmentCode Merchant = new TransactionEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Merchant";
			definition = "Merchant environment.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionEnvironmentCode.mmObject();
			codeName = "MERC";
		}
	};
	/**
	 * Private environment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode
	 * TransactionEnvironmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Private"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Private environment."</li>
	 * </ul>
	 */
	public static final TransactionEnvironmentCode Private = new TransactionEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Private";
			definition = "Private environment.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionEnvironmentCode.mmObject();
			codeName = "PRIV";
		}
	};
	/**
	 * Public environment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode
	 * TransactionEnvironmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Public"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Public environment."</li>
	 * </ul>
	 */
	public static final TransactionEnvironmentCode Public = new TransactionEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Public";
			definition = "Public environment.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionEnvironmentCode.mmObject();
			codeName = "PUBL";
		}
	};
	/**
	 * Bank environment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode
	 * TransactionEnvironmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Branch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank environment."</li>
	 * </ul>
	 */
	public static final TransactionEnvironmentCode Branch = new TransactionEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Branch";
			definition = "Bank environment.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionEnvironmentCode.mmObject();
			codeName = "BRCH";
		}
	};
	/**
	 * Other environments, for instance a mall or an airport.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode
	 * TransactionEnvironmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other environments, for instance a mall or an airport."</li>
	 * </ul>
	 */
	public static final TransactionEnvironmentCode Other = new TransactionEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other environments, for instance a mall or an airport.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionEnvironmentCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, TransactionEnvironmentCode> codesByName = new LinkedHashMap<>();

	protected TransactionEnvironmentCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MERC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionEnvironmentCode";
				definition = "Indicates the environment of the transaction.";
				derivation_lazy = () -> Arrays.asList(TransactionEnvironment1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionEnvironmentCode.Merchant, com.tools20022.repository.codeset.TransactionEnvironmentCode.Private,
						com.tools20022.repository.codeset.TransactionEnvironmentCode.Public, com.tools20022.repository.codeset.TransactionEnvironmentCode.Branch, com.tools20022.repository.codeset.TransactionEnvironmentCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Merchant.getCodeName().get(), Merchant);
		codesByName.put(Private.getCodeName().get(), Private);
		codesByName.put(Public.getCodeName().get(), Public);
		codesByName.put(Branch.getCodeName().get(), Branch);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static TransactionEnvironmentCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionEnvironmentCode[] values() {
		TransactionEnvironmentCode[] values = new TransactionEnvironmentCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionEnvironmentCode> {
		@Override
		public TransactionEnvironmentCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionEnvironmentCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}