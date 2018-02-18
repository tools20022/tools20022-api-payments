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
import com.tools20022.repository.codeset.DebitCreditCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if an operation is an increase or a decrease.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DebitCreditCode#Credit
 * DebitCreditCode.Credit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DebitCreditCode#Debit
 * DebitCreditCode.Debit}</li>
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
 * <li>"CRDT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DebitCreditCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies if an operation is an increase or a decrease."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DebitCreditCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Operation is an increase.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Operation is an increase."</li>
	 * </ul>
	 */
	public static final DebitCreditCode Credit = new DebitCreditCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Credit";
			definition = "Operation is an increase.";
			owner_lazy = () -> com.tools20022.repository.codeset.DebitCreditCode.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Operation is a decrease.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Operation is a decrease."</li>
	 * </ul>
	 */
	public static final DebitCreditCode Debit = new DebitCreditCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Debit";
			definition = "Operation is a decrease.";
			owner_lazy = () -> com.tools20022.repository.codeset.DebitCreditCode.mmObject();
			codeName = "DBIT";
		}
	};
	final static private LinkedHashMap<String, DebitCreditCode> codesByName = new LinkedHashMap<>();

	protected DebitCreditCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CRDT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DebitCreditCode";
				definition = "Specifies if an operation is an increase or a decrease.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DebitCreditCode.Credit, com.tools20022.repository.codeset.DebitCreditCode.Debit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Credit.getCodeName().get(), Credit);
		codesByName.put(Debit.getCodeName().get(), Debit);
	}

	public static DebitCreditCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DebitCreditCode[] values() {
		DebitCreditCode[] values = new DebitCreditCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DebitCreditCode> {
		@Override
		public DebitCreditCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DebitCreditCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}