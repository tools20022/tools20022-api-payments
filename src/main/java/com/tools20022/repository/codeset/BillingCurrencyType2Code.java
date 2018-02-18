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
import com.tools20022.repository.codeset.BillingCurrencyType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the type of currency to be used for the billing of a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyType2Code#Account
 * BillingCurrencyType2Code.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyType2Code#Settlement
 * BillingCurrencyType2Code.Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyType2Code#Pricing
 * BillingCurrencyType2Code.Pricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyType2Code#Host
 * BillingCurrencyType2Code.Host}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyTypeCode
 * BillingCurrencyTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BillingCurrencyType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the type of currency to be used for the billing of a service."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BillingCurrencyType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyType2Code
	 * BillingCurrencyType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * </ul>
	 */
	public static final BillingCurrencyType2Code Account = new BillingCurrencyType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingCurrencyType2Code.mmObject();
			codeName = BillingCurrencyTypeCode.Account.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyType2Code
	 * BillingCurrencyType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * </ul>
	 */
	public static final BillingCurrencyType2Code Settlement = new BillingCurrencyType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settlement";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingCurrencyType2Code.mmObject();
			codeName = BillingCurrencyTypeCode.Settlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyType2Code
	 * BillingCurrencyType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pricing"</li>
	 * </ul>
	 */
	public static final BillingCurrencyType2Code Pricing = new BillingCurrencyType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pricing";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingCurrencyType2Code.mmObject();
			codeName = BillingCurrencyTypeCode.Pricing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyType2Code
	 * BillingCurrencyType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Host"</li>
	 * </ul>
	 */
	public static final BillingCurrencyType2Code Host = new BillingCurrencyType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Host";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingCurrencyType2Code.mmObject();
			codeName = BillingCurrencyTypeCode.Host.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BillingCurrencyType2Code> codesByName = new LinkedHashMap<>();

	protected BillingCurrencyType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingCurrencyType2Code";
				definition = "Defines the type of currency to be used for the billing of a service.";
				trace_lazy = () -> BillingCurrencyTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BillingCurrencyType2Code.Account, com.tools20022.repository.codeset.BillingCurrencyType2Code.Settlement,
						com.tools20022.repository.codeset.BillingCurrencyType2Code.Pricing, com.tools20022.repository.codeset.BillingCurrencyType2Code.Host);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Account.getCodeName().get(), Account);
		codesByName.put(Settlement.getCodeName().get(), Settlement);
		codesByName.put(Pricing.getCodeName().get(), Pricing);
		codesByName.put(Host.getCodeName().get(), Host);
	}

	public static BillingCurrencyType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BillingCurrencyType2Code[] values() {
		BillingCurrencyType2Code[] values = new BillingCurrencyType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BillingCurrencyType2Code> {
		@Override
		public BillingCurrencyType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BillingCurrencyType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}