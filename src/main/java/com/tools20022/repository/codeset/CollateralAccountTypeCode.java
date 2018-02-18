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
import com.tools20022.repository.codeset.CollateralAccountTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the collateral account type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralAccountTypeCode#House
 * CollateralAccountTypeCode.House}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralAccountTypeCode#Client
 * CollateralAccountTypeCode.Client}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralAccountTypeCode#LiquidityProvider
 * CollateralAccountTypeCode.LiquidityProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralAccountTypeCode#Margin
 * CollateralAccountTypeCode.Margin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralAccountTypeCode#DefaultFund
 * CollateralAccountTypeCode.DefaultFund}</li>
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
 * "CollateralAccountTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the collateral account type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralAccountTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the account is used to post collateral that covers the
	 * exposure resulting from trades executed for either the clearing member or
	 * its subsidiaries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralAccountTypeCode
	 * CollateralAccountTypeCode}</li>
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
	 * "Specifies that the account is used to post collateral that covers the exposure resulting from trades executed for either the clearing member or its subsidiaries."
	 * </li>
	 * </ul>
	 */
	public static final CollateralAccountTypeCode House = new CollateralAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "House";
			definition = "Specifies that the account is used to post collateral that covers the exposure resulting from trades executed for either the clearing member or its subsidiaries.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralAccountTypeCode.mmObject();
			codeName = "HOUS";
		}
	};
	/**
	 * Specifies that the account is used to post collateral that covers the
	 * exposure resulting from trades executed for the clearing member's
	 * customers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralAccountTypeCode
	 * CollateralAccountTypeCode}</li>
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
	 * "Specifies that the account is used to post collateral that covers the exposure resulting from trades executed for the clearing member's customers."
	 * </li>
	 * </ul>
	 */
	public static final CollateralAccountTypeCode Client = new CollateralAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			definition = "Specifies that the account is used to post collateral that covers the exposure resulting from trades executed for the clearing member's customers.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralAccountTypeCode.mmObject();
			codeName = "CLIE";
		}
	};
	/**
	 * Specifies that the account is used to post collateral that covers the
	 * exposure resulting from trades executed for liquidity providers (also
	 * known as market maker) activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralAccountTypeCode
	 * CollateralAccountTypeCode}</li>
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
	 * "Specifies that the account is used to post collateral that covers the exposure resulting from trades executed for liquidity providers (also known as market maker) activities."
	 * </li>
	 * </ul>
	 */
	public static final CollateralAccountTypeCode LiquidityProvider = new CollateralAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityProvider";
			definition = "Specifies that the account is used to post collateral that covers the exposure resulting from trades executed for liquidity providers (also known as market maker) activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralAccountTypeCode.mmObject();
			codeName = "LIPR";
		}
	};
	/**
	 * Specifies that the account is used to post collateral that covers the
	 * exposure resulting from trades executed for either the clearing member or
	 * its subsidiaries, or for the clearing member's customers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralAccountTypeCode
	 * CollateralAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MGIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Margin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the account is used to post collateral that covers the exposure resulting from trades executed for either the clearing member or its subsidiaries, or for the clearing member's customers."
	 * </li>
	 * </ul>
	 */
	public static final CollateralAccountTypeCode Margin = new CollateralAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Margin";
			definition = "Specifies that the account is used to post collateral that covers the exposure resulting from trades executed for either the clearing member or its subsidiaries, or for the clearing member's customers.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralAccountTypeCode.mmObject();
			codeName = "MGIN";
		}
	};
	/**
	 * Specifies that the account is used to post collateral that covers
	 * clearing member's default risk.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralAccountTypeCode
	 * CollateralAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the account is used to post collateral that covers clearing member's default risk."
	 * </li>
	 * </ul>
	 */
	public static final CollateralAccountTypeCode DefaultFund = new CollateralAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFund";
			definition = "Specifies that the account is used to post collateral that covers clearing member's default risk.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralAccountTypeCode.mmObject();
			codeName = "DFLT";
		}
	};
	final static private LinkedHashMap<String, CollateralAccountTypeCode> codesByName = new LinkedHashMap<>();

	protected CollateralAccountTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("HOUS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralAccountTypeCode";
				definition = "Specifies the collateral account type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralAccountTypeCode.House, com.tools20022.repository.codeset.CollateralAccountTypeCode.Client,
						com.tools20022.repository.codeset.CollateralAccountTypeCode.LiquidityProvider, com.tools20022.repository.codeset.CollateralAccountTypeCode.Margin,
						com.tools20022.repository.codeset.CollateralAccountTypeCode.DefaultFund);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(House.getCodeName().get(), House);
		codesByName.put(Client.getCodeName().get(), Client);
		codesByName.put(LiquidityProvider.getCodeName().get(), LiquidityProvider);
		codesByName.put(Margin.getCodeName().get(), Margin);
		codesByName.put(DefaultFund.getCodeName().get(), DefaultFund);
	}

	public static CollateralAccountTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralAccountTypeCode[] values() {
		CollateralAccountTypeCode[] values = new CollateralAccountTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralAccountTypeCode> {
		@Override
		public CollateralAccountTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralAccountTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}