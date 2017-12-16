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
import com.tools20022.repository.codeset.BillingSubServiceQualifierCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Qualifies the content of the subservice code.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifierCode#Lockbox
 * BillingSubServiceQualifierCode.mmLockbox}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifierCode#Store
 * BillingSubServiceQualifierCode.mmStore}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifierCode#BilaterallyAgreed
 * BillingSubServiceQualifierCode.mmBilaterallyAgreed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifierCode#SequenceNumber
 * BillingSubServiceQualifierCode.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifierCode#MemberAccount
 * BillingSubServiceQualifierCode.mmMemberAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifier1Code
 * BillingSubServiceQualifier1Code}</li>
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
 * <li>"LBOX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BillingSubServiceQualifierCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Qualifies the content of the subservice code."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BillingSubServiceQualifierCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Subservice code contains a lockbox number which identifies the lockbox
	 * using the service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifierCode
	 * BillingSubServiceQualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LBOX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lockbox"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subservice code contains a lockbox number which identifies the lockbox using the service."
	 * </li>
	 * </ul>
	 */
	public static final BillingSubServiceQualifierCode Lockbox = new BillingSubServiceQualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lockbox";
			definition = "Subservice code contains a lockbox number which identifies the lockbox using the service.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingSubServiceQualifierCode.mmObject();
			codeName = "LBOX";
		}
	};
	/**
	 * Subservice code contains a store number which identifies the store using
	 * the service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifierCode
	 * BillingSubServiceQualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Store"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subservice code contains a store number which identifies the store using the service."
	 * </li>
	 * </ul>
	 */
	public static final BillingSubServiceQualifierCode Store = new BillingSubServiceQualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Store";
			definition = "Subservice code contains a store number which identifies the store using the service.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingSubServiceQualifierCode.mmObject();
			codeName = "STOR";
		}
	};
	/**
	 * Meaning of the subservice code is established by the trading partners.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifierCode
	 * BillingSubServiceQualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BILA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilaterallyAgreed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meaning of the subservice code is established by the trading partners."</li>
	 * </ul>
	 */
	public static final BillingSubServiceQualifierCode BilaterallyAgreed = new BillingSubServiceQualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilaterallyAgreed";
			definition = "Meaning of the subservice code is established by the trading partners.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingSubServiceQualifierCode.mmObject();
			codeName = "BILA";
		}
	};
	/**
	 * Subservice code is an arbitrary sequence number used to uniquely identify
	 * this Service and prevent duplicate services within this statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifierCode
	 * BillingSubServiceQualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEQN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subservice code is an arbitrary sequence number used to uniquely identify this Service and prevent duplicate services within this statement."
	 * </li>
	 * </ul>
	 */
	public static final BillingSubServiceQualifierCode SequenceNumber = new BillingSubServiceQualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Subservice code is an arbitrary sequence number used to uniquely identify this Service and prevent duplicate services within this statement.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingSubServiceQualifierCode.mmObject();
			codeName = "SEQN";
		}
	};
	/**
	 * Subservice code is the account number of a member of a relationship
	 * structure. This allows a parent statement to include the same service as
	 * rolled up from its member accounts and still avoid duplicate service
	 * identification within the statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifierCode
	 * BillingSubServiceQualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MACT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subservice code is the account number of a member of a relationship structure. This allows a parent statement to include the same service as rolled up from its member accounts and still avoid duplicate service identification within the statement."
	 * </li>
	 * </ul>
	 */
	public static final BillingSubServiceQualifierCode MemberAccount = new BillingSubServiceQualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberAccount";
			definition = "Subservice code is the account number of a member of a relationship structure. This allows a parent statement to include the same service as rolled up from its member accounts and still avoid duplicate service identification within the statement.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingSubServiceQualifierCode.mmObject();
			codeName = "MACT";
		}
	};
	final static private LinkedHashMap<String, BillingSubServiceQualifierCode> codesByName = new LinkedHashMap<>();

	protected BillingSubServiceQualifierCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("LBOX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingSubServiceQualifierCode";
				definition = "Qualifies the content of the subservice code.";
				derivation_lazy = () -> Arrays.asList(BillingSubServiceQualifier1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BillingSubServiceQualifierCode.Lockbox, com.tools20022.repository.codeset.BillingSubServiceQualifierCode.Store,
						com.tools20022.repository.codeset.BillingSubServiceQualifierCode.BilaterallyAgreed, com.tools20022.repository.codeset.BillingSubServiceQualifierCode.SequenceNumber,
						com.tools20022.repository.codeset.BillingSubServiceQualifierCode.MemberAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Lockbox.getCodeName().get(), Lockbox);
		codesByName.put(Store.getCodeName().get(), Store);
		codesByName.put(BilaterallyAgreed.getCodeName().get(), BilaterallyAgreed);
		codesByName.put(SequenceNumber.getCodeName().get(), SequenceNumber);
		codesByName.put(MemberAccount.getCodeName().get(), MemberAccount);
	}

	public static BillingSubServiceQualifierCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BillingSubServiceQualifierCode[] values() {
		BillingSubServiceQualifierCode[] values = new BillingSubServiceQualifierCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BillingSubServiceQualifierCode> {
		@Override
		public BillingSubServiceQualifierCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BillingSubServiceQualifierCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}