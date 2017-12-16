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
import com.tools20022.repository.codeset.InvestmentAccountCategoryCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the investment account category.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentAccountCategoryCode#RetailAccount
 * InvestmentAccountCategoryCode.mmRetailAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentAccountCategoryCode#MandateAccount
 * InvestmentAccountCategoryCode.mmMandateAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentAccountCategoryCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the investment account category."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestmentAccountCategoryCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account is a standard account managed by the investor. The investor
	 * issues instructions for the account to the financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentAccountCategoryCode
	 * InvestmentAccountCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RETA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is a standard account managed by the investor. The investor issues instructions for the account to the financial institution."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentAccountCategoryCode RetailAccount = new InvestmentAccountCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetailAccount";
			definition = "Account is a standard account managed by the investor. The investor issues instructions for the account to the financial institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentAccountCategoryCode.mmObject();
			codeName = "RETA";
		}
	};
	/**
	 * Account is fully managed by the financial institution, that is, an
	 * investor gives a 'mandate' to the financial institution to execute a
	 * mutually agreed investment strategy on its behalf.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentAccountCategoryCode
	 * InvestmentAccountCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is fully managed by the financial institution, that is, an investor gives a 'mandate' to the financial institution to execute a mutually agreed investment strategy on its behalf."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentAccountCategoryCode MandateAccount = new InvestmentAccountCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateAccount";
			definition = "Account is fully managed by the financial institution, that is, an investor gives a 'mandate' to the financial institution to execute a mutually agreed investment strategy on its behalf.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentAccountCategoryCode.mmObject();
			codeName = "MAND";
		}
	};
	final static private LinkedHashMap<String, InvestmentAccountCategoryCode> codesByName = new LinkedHashMap<>();

	protected InvestmentAccountCategoryCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountCategoryCode";
				definition = "Specifies the investment account category.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentAccountCategoryCode.RetailAccount, com.tools20022.repository.codeset.InvestmentAccountCategoryCode.MandateAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RetailAccount.getCodeName().get(), RetailAccount);
		codesByName.put(MandateAccount.getCodeName().get(), MandateAccount);
	}

	public static InvestmentAccountCategoryCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestmentAccountCategoryCode[] values() {
		InvestmentAccountCategoryCode[] values = new InvestmentAccountCategoryCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestmentAccountCategoryCode> {
		@Override
		public InvestmentAccountCategoryCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestmentAccountCategoryCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}