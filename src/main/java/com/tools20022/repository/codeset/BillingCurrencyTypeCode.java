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
import com.tools20022.repository.codeset.BillingCurrencyTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the currency type to be used in the billing balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyTypeCode#Account
 * BillingCurrencyTypeCode.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyTypeCode#Settlement
 * BillingCurrencyTypeCode.mmSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyTypeCode#Pricing
 * BillingCurrencyTypeCode.mmPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyTypeCode#Host
 * BillingCurrencyTypeCode.mmHost}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BillingCurrencyType1Code
 * BillingCurrencyType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BillingCurrencyType2Code
 * BillingCurrencyType2Code}</li>
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
 * <li>"ACCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BillingCurrencyTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the currency type to be used in the billing balance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BillingCurrencyTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Currency type used for the billing is the account currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyTypeCode
	 * BillingCurrencyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency type used for the billing is the account currency."</li>
	 * </ul>
	 */
	public static final BillingCurrencyTypeCode Account = new BillingCurrencyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Currency type used for the billing is the account currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingCurrencyTypeCode.mmObject();
			codeName = "ACCT";
		}
	};
	/**
	 * Currency type used for the billing is the settlement currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyTypeCode
	 * BillingCurrencyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STLM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency type used for the billing is the settlement currency."</li>
	 * </ul>
	 */
	public static final BillingCurrencyTypeCode Settlement = new BillingCurrencyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settlement";
			definition = "Currency type used for the billing is the settlement currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingCurrencyTypeCode.mmObject();
			codeName = "STLM";
		}
	};
	/**
	 * Currency type used for the billing is the pricing currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyTypeCode
	 * BillingCurrencyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency type used for the billing is the pricing currency."</li>
	 * </ul>
	 */
	public static final BillingCurrencyTypeCode Pricing = new BillingCurrencyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pricing";
			definition = "Currency type used for the billing is the pricing currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingCurrencyTypeCode.mmObject();
			codeName = "PRCG";
		}
	};
	/**
	 * Currency type used for the billing is the host currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyTypeCode
	 * BillingCurrencyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Host"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency type used for the billing is the host currency."</li>
	 * </ul>
	 */
	public static final BillingCurrencyTypeCode Host = new BillingCurrencyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Host";
			definition = "Currency type used for the billing is the host currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingCurrencyTypeCode.mmObject();
			codeName = "HOST";
		}
	};
	final static private LinkedHashMap<String, BillingCurrencyTypeCode> codesByName = new LinkedHashMap<>();

	protected BillingCurrencyTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingCurrencyTypeCode";
				definition = "Defines the currency type to be used in the billing balance.";
				derivation_lazy = () -> Arrays.asList(BillingCurrencyType1Code.mmObject(), BillingCurrencyType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BillingCurrencyTypeCode.Account, com.tools20022.repository.codeset.BillingCurrencyTypeCode.Settlement,
						com.tools20022.repository.codeset.BillingCurrencyTypeCode.Pricing, com.tools20022.repository.codeset.BillingCurrencyTypeCode.Host);
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

	public static BillingCurrencyTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BillingCurrencyTypeCode[] values() {
		BillingCurrencyTypeCode[] values = new BillingCurrencyTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BillingCurrencyTypeCode> {
		@Override
		public BillingCurrencyTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BillingCurrencyTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}