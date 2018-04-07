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
 * ClearingAccountTypeCode.House}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode#Client
 * ClearingAccountTypeCode.Client}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode#LiquidityProvider
 * ClearingAccountTypeCode.LiquidityProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode#GrossOmnibusClientAccount
 * ClearingAccountTypeCode.GrossOmnibusClientAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode#NetOmnibusClientAccount
 * ClearingAccountTypeCode.NetOmnibusClientAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode#IndividuallySegregatedAccount
 * ClearingAccountTypeCode.IndividuallySegregatedAccount}</li>
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
	/**
	 * Specifies that client position and assets within the associated position
	 * and collateral accounts of the clearing account are operationally and
	 * legally conmingled, however initial margin requirements are calculated on
	 * a gross basis for each related margining account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode
	 * ClearingAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GOSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossOmnibusClientAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that client position and assets within the associated position and collateral accounts of the clearing account are operationally and legally conmingled, however initial margin requirements are calculated on a gross basis for each related margining account."
	 * </li>
	 * </ul>
	 */
	public static final ClearingAccountTypeCode GrossOmnibusClientAccount = new ClearingAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossOmnibusClientAccount";
			definition = "Specifies that client position and assets within the associated position and collateral accounts of the clearing account are operationally and legally conmingled, however initial margin requirements are calculated on a gross basis for each related margining account.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingAccountTypeCode.mmObject();
			codeName = "GOSA";
		}
	};
	/**
	 * Specifies that the client positions and assets within the associated
	 * position and collateral accounts of the clearing account are
	 * operationally and legally conmingled while initial margin requirements
	 * are calculated on a net basis across all related margining or position
	 * accounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode
	 * ClearingAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetOmnibusClientAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the client positions and assets within the associated position and collateral accounts of the clearing account are operationally and legally conmingled while initial margin requirements are calculated on a net basis across all related margining or position accounts."
	 * </li>
	 * </ul>
	 */
	public static final ClearingAccountTypeCode NetOmnibusClientAccount = new ClearingAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetOmnibusClientAccount";
			definition = "Specifies that the client positions and assets within the associated position and collateral accounts of the clearing account are operationally and legally conmingled while initial margin requirements are calculated on a net basis across all related margining or position accounts.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingAccountTypeCode.mmObject();
			codeName = "NOSA";
		}
	};
	/**
	 * Specifies that customer positions and assets within the associated
	 * position and collateral accounts of the clearing account are
	 * operationally and legally segregated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode
	 * ClearingAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISEG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividuallySegregatedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that customer positions and assets within the associated position and collateral accounts of the clearing account are operationally and legally segregated."
	 * </li>
	 * </ul>
	 */
	public static final ClearingAccountTypeCode IndividuallySegregatedAccount = new ClearingAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividuallySegregatedAccount";
			definition = "Specifies that customer positions and assets within the associated position and collateral accounts of the clearing account are operationally and legally segregated.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingAccountTypeCode.mmObject();
			codeName = "ISEG";
		}
	};
	final static private LinkedHashMap<String, ClearingAccountTypeCode> codesByName = new LinkedHashMap<>();

	protected ClearingAccountTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("HOUS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingAccountTypeCode";
				definition = "Specifies the clearing account type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingAccountTypeCode.House, com.tools20022.repository.codeset.ClearingAccountTypeCode.Client,
						com.tools20022.repository.codeset.ClearingAccountTypeCode.LiquidityProvider, com.tools20022.repository.codeset.ClearingAccountTypeCode.GrossOmnibusClientAccount,
						com.tools20022.repository.codeset.ClearingAccountTypeCode.NetOmnibusClientAccount, com.tools20022.repository.codeset.ClearingAccountTypeCode.IndividuallySegregatedAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(House.getCodeName().get(), House);
		codesByName.put(Client.getCodeName().get(), Client);
		codesByName.put(LiquidityProvider.getCodeName().get(), LiquidityProvider);
		codesByName.put(GrossOmnibusClientAccount.getCodeName().get(), GrossOmnibusClientAccount);
		codesByName.put(NetOmnibusClientAccount.getCodeName().get(), NetOmnibusClientAccount);
		codesByName.put(IndividuallySegregatedAccount.getCodeName().get(), IndividuallySegregatedAccount);
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