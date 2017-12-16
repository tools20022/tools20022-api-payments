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
import com.tools20022.repository.codeset.BillingSubServiceQualifier1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifier1Code#Lockbox
 * BillingSubServiceQualifier1Code.mmLockbox}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifier1Code#Store
 * BillingSubServiceQualifier1Code.mmStore}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifier1Code#BilaterallyAgreed
 * BillingSubServiceQualifier1Code.mmBilaterallyAgreed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifier1Code#SequenceNumber
 * BillingSubServiceQualifier1Code.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifier1Code#MemberAccount
 * BillingSubServiceQualifier1Code.mmMemberAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifierCode
 * BillingSubServiceQualifierCode}</li>
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
 * "BillingSubServiceQualifier1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Qualifies the content of the subservice code."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BillingSubServiceQualifier1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifier1Code
	 * BillingSubServiceQualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lockbox"</li>
	 * </ul>
	 */
	public static final BillingSubServiceQualifier1Code Lockbox = new BillingSubServiceQualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lockbox";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingSubServiceQualifier1Code.mmObject();
			codeName = BillingSubServiceQualifierCode.Lockbox.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifier1Code
	 * BillingSubServiceQualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Store"</li>
	 * </ul>
	 */
	public static final BillingSubServiceQualifier1Code Store = new BillingSubServiceQualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Store";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingSubServiceQualifier1Code.mmObject();
			codeName = BillingSubServiceQualifierCode.Store.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifier1Code
	 * BillingSubServiceQualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilaterallyAgreed"</li>
	 * </ul>
	 */
	public static final BillingSubServiceQualifier1Code BilaterallyAgreed = new BillingSubServiceQualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilaterallyAgreed";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingSubServiceQualifier1Code.mmObject();
			codeName = BillingSubServiceQualifierCode.BilaterallyAgreed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifier1Code
	 * BillingSubServiceQualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * </ul>
	 */
	public static final BillingSubServiceQualifier1Code SequenceNumber = new BillingSubServiceQualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingSubServiceQualifier1Code.mmObject();
			codeName = BillingSubServiceQualifierCode.SequenceNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingSubServiceQualifier1Code
	 * BillingSubServiceQualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberAccount"</li>
	 * </ul>
	 */
	public static final BillingSubServiceQualifier1Code MemberAccount = new BillingSubServiceQualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingSubServiceQualifier1Code.mmObject();
			codeName = BillingSubServiceQualifierCode.MemberAccount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BillingSubServiceQualifier1Code> codesByName = new LinkedHashMap<>();

	protected BillingSubServiceQualifier1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("LBOX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingSubServiceQualifier1Code";
				definition = "Qualifies the content of the subservice code.";
				trace_lazy = () -> BillingSubServiceQualifierCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BillingSubServiceQualifier1Code.Lockbox, com.tools20022.repository.codeset.BillingSubServiceQualifier1Code.Store,
						com.tools20022.repository.codeset.BillingSubServiceQualifier1Code.BilaterallyAgreed, com.tools20022.repository.codeset.BillingSubServiceQualifier1Code.SequenceNumber,
						com.tools20022.repository.codeset.BillingSubServiceQualifier1Code.MemberAccount);
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

	public static BillingSubServiceQualifier1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BillingSubServiceQualifier1Code[] values() {
		BillingSubServiceQualifier1Code[] values = new BillingSubServiceQualifier1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BillingSubServiceQualifier1Code> {
		@Override
		public BillingSubServiceQualifier1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BillingSubServiceQualifier1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}