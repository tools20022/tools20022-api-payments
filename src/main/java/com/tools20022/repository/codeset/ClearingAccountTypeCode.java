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
import com.tools20022.repository.codeset.ClearingAccountTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the clearing account type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode#House
 * ClearingAccountTypeCode.mmHouse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode#Client
 * ClearingAccountTypeCode.mmClient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode#LiquidityProvider
 * ClearingAccountTypeCode.mmLiquidityProvider}</li>
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
 * <li>"HOUS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingAccountTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the clearing account type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ClearingAccountTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the account is used to register trades executed for either
	 * the clearing member or its subsidiaries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode
	 * ClearingAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "House"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the account is used to register trades executed for either the clearing member or its subsidiaries."
	 * </li>
	 * </ul>
	 */
	public static final ClearingAccountTypeCode House = new ClearingAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "House";
			definition = "Specifies that the account is used to register trades executed for either the clearing member or its subsidiaries.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingAccountTypeCode.mmObject();
			codeName = "HOUS";
		}
	};
	/**
	 * Specifies that the account is used to register trades executed for the
	 * clearing member's customers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode
	 * ClearingAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLIE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Client"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the account is used to register trades executed for the clearing member's customers."
	 * </li>
	 * </ul>
	 */
	public static final ClearingAccountTypeCode Client = new ClearingAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			definition = "Specifies that the account is used to register trades executed for the clearing member's customers.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingAccountTypeCode.mmObject();
			codeName = "CLIE";
		}
	};
	/**
	 * Specifies that the account is used to register trades executed for
	 * liquidity providers (also known as market maker) activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode
	 * ClearingAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityProvider"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the account is used to register trades executed for liquidity providers (also known as market maker) activities."
	 * </li>
	 * </ul>
	 */
	public static final ClearingAccountTypeCode LiquidityProvider = new ClearingAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityProvider";
			definition = "Specifies that the account is used to register trades executed for liquidity providers (also known as market maker) activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingAccountTypeCode.mmObject();
			codeName = "LIPR";
		}
	};
	final static private LinkedHashMap<String, ClearingAccountTypeCode> codesByName = new LinkedHashMap<>();

	protected ClearingAccountTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("HOUS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingAccountTypeCode";
				definition = "Specifies the clearing account type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingAccountTypeCode.House, com.tools20022.repository.codeset.ClearingAccountTypeCode.Client,
						com.tools20022.repository.codeset.ClearingAccountTypeCode.LiquidityProvider);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(House.getCodeName().get(), House);
		codesByName.put(Client.getCodeName().get(), Client);
		codesByName.put(LiquidityProvider.getCodeName().get(), LiquidityProvider);
	}

	public static ClearingAccountTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ClearingAccountTypeCode[] values() {
		ClearingAccountTypeCode[] values = new ClearingAccountTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ClearingAccountTypeCode> {
		@Override
		public ClearingAccountTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ClearingAccountTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}