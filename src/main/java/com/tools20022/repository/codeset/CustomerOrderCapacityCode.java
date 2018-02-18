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
import com.tools20022.repository.codeset.CustomerOrderCapacityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Designation of the capacity of the firm placing the order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacityCode#MemberOwnAccount
 * CustomerOrderCapacityCode.MemberOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacityCode#ClearingProprietary
 * CustomerOrderCapacityCode.ClearingProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacityCode#MemberOtherMember
 * CustomerOrderCapacityCode.MemberOtherMember}</li>
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
 * <li>"OWNE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerOrderCapacityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Designation of the capacity of the firm placing the order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CustomerOrderCapacityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Member trading for their own account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacityCode
	 * CustomerOrderCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OWNE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberOwnAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Member trading for their own account."</li>
	 * </ul>
	 */
	public static final CustomerOrderCapacityCode MemberOwnAccount = new CustomerOrderCapacityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MemberOwnAccount";
			definition = "Member trading for their own account.";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerOrderCapacityCode.mmObject();
			codeName = "OWNE";
		}
	};
	/**
	 * Clearing firm trading for its proprietary account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacityCode
	 * CustomerOrderCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingProprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing firm trading for its proprietary account."</li>
	 * </ul>
	 */
	public static final CustomerOrderCapacityCode ClearingProprietary = new CustomerOrderCapacityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingProprietary";
			definition = "Clearing firm trading for its proprietary account.";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerOrderCapacityCode.mmObject();
			codeName = "CLAR";
		}
	};
	/**
	 * Member trading for another member.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacityCode
	 * CustomerOrderCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberOtherMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Member trading for another member."</li>
	 * </ul>
	 */
	public static final CustomerOrderCapacityCode MemberOtherMember = new CustomerOrderCapacityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MemberOtherMember";
			definition = "Member trading for another member.";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerOrderCapacityCode.mmObject();
			codeName = "OTHM";
		}
	};
	final static private LinkedHashMap<String, CustomerOrderCapacityCode> codesByName = new LinkedHashMap<>();

	protected CustomerOrderCapacityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OWNE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerOrderCapacityCode";
				definition = "Designation of the capacity of the firm placing the order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CustomerOrderCapacityCode.MemberOwnAccount, com.tools20022.repository.codeset.CustomerOrderCapacityCode.ClearingProprietary,
						com.tools20022.repository.codeset.CustomerOrderCapacityCode.MemberOtherMember);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MemberOwnAccount.getCodeName().get(), MemberOwnAccount);
		codesByName.put(ClearingProprietary.getCodeName().get(), ClearingProprietary);
		codesByName.put(MemberOtherMember.getCodeName().get(), MemberOtherMember);
	}

	public static CustomerOrderCapacityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CustomerOrderCapacityCode[] values() {
		CustomerOrderCapacityCode[] values = new CustomerOrderCapacityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CustomerOrderCapacityCode> {
		@Override
		public CustomerOrderCapacityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CustomerOrderCapacityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}